package com.spring.spring.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    public static void main(String[] args) {

    }

    @GetMapping("/add/{n1}/and/{n2}")
    @ResponseBody
    public int add(@PathVariable int n1, @PathVariable int n2){
        return n1 + n2;
    }

    @GetMapping("/subtract/{n1}/from/{n2}")
    @ResponseBody
    public int subtract(@PathVariable int n1,@PathVariable int n2){
        return n1 - n2;

    }

    @GetMapping("/multiply/{n1}/and/{n2}")
    @ResponseBody
    public int multiply(@PathVariable int n1,@PathVariable int n2){
        return n1 * n2;

    }
    @GetMapping("/divide/{n1}/by/{n2}")
    @ResponseBody
    public int divide(@PathVariable int n1,@PathVariable int n2){
        return n1 / n2;

    }

}
