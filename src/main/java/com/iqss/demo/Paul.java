package com.iqss.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Paul {

    @Autowired
    @Qualifier("sessionScopedBean")
    HelloWorld hw;

    @GetMapping("/paul")
    String getPaulString() {
        System.out.println(hw);
        return hw.getMessage();
    }

    @GetMapping("/john")
    String setPaulString() {
        System.out.println(hw);
        hw.setMessage("New Message");
        return hw.getMessage();
    }
}
