package io.joel;

import com.fasterxml.jackson.annotation.JsonProperty;
import feign.Feign;
import feign.RequestLine;
import feign.gson.GsonDecoder;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by taddeimania on 9/8/17.
 */
@Component
public class MsbClient {

    public List<Airplane> airplanes;

    public static class Airplane {
        @JsonProperty("manufacturer")
        public String manufacturer;

        @JsonProperty("engineCount")
        public int engineCount;
    }

    public interface Msb {
        @RequestLine("GET /airplanes")
        List<Airplane> getAirplanes();
    }

    private String msbUrl;

    public MsbClient(String url) {
        this.msbUrl = url;
    }
    public List<Airplane> getAirplanes() {
        Msb msbBuilder = Feign.builder()
                .decoder(new GsonDecoder())
                .target(Msb.class, msbUrl);

        return msbBuilder.getAirplanes();
    }

}
