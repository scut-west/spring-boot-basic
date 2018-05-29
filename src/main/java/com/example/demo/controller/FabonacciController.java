package com.example.demo.controller;

import com.example.demo.domain.Fabonacci;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fabonacci")
public class FabonacciController {

    @RequestMapping(path="/{number}", method = RequestMethod.GET)
    public int getFabonacciResult(@PathVariable("number") int input) throws Exception {
        int result = Fabonacci.getResult(input);
        return result;
    }
}
