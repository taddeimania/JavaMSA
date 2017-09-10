package io.joel.controller;

import io.joel.MsbClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by taddeimania on 9/8/17.
 */
@RestController
public class AirplaneController {

    @Resource
    MsbClient msbClient;

    @RequestMapping("/api/airplanes")
    public List<MsbClient.Airplane> getAirplanesFromMsb(HttpServletResponse response) {
        List<MsbClient.Airplane> airplanes = msbClient.getAirplanes();
        System.out.println("NEW BUILD");
        response.setHeader("Peek", "Aboo");
        response.setHeader("Onemore", "Beforeed");
        response.setHeader("WhichData", System.getenv("WHICHDATA"));
        return airplanes;
    }
}
