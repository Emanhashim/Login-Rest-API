package com.example.WalletLogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

        @GetMapping("/home")
    public String home(){
        return "this is homepage";
    }

    @GetMapping("/admin")
    public String admin(){
        return "this is admin";
    }

}
