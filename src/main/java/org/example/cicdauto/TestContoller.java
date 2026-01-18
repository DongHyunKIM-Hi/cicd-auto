package org.example.cicdauto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {

    @GetMapping("/test")
    public String test() {
        return "신기방기신기방기";
    }
}
