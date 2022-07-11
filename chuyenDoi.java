package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class chuyenDoi {

    @GetMapping("/mn/{money}/{x}")
    public String money(@PathVariable String money,@PathVariable int x){
        switch (money){
            case "USD":
                int USD = 1;
                USD = x * 23000;
                return "Từ " + x + " VND đổi sang tiền USD : " + USD;
            case "EUR":
                int EUR = 1;
                EUR = x * 23783;
                return "Từ " + x + " VND đổi sang tiền EUR : " + EUR;
            case "JPY":
                int JPY = 1;
                JPY = x * 17163;
                return "Từ " + x + " VND đổi sang tiền JPY : " + JPY;
            default:
                return "Không tìm thấy loại tiền này";
        }
    }
}
