package io.joel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by taddeimania on 9/8/17.
 */
@RestController
public class NewProdController {

    @RequestMapping("/api/version")
    public String getVersion() {
        return "Demo Branch!";
    }
}
