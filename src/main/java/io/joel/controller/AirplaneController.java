package io.joel.controller;

import io.joel.MsbClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by taddeimania on 9/8/17.
 */
@RestController
public class AirplaneController {

    @Resource
    MsbClient msbClient;

    @RequestMapping("/api/airplanes")
    public List<MsbClient.Airplane> getAirplanesFromMsb() {
        List<MsbClient.Airplane> airplanes = msbClient.getAirplanes();
        System.out.println(airplanes);
        return airplanes;
    }
}
