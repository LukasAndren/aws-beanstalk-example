package com.example.aws.awselasticbeanstalkexample;

import com.example.aws.awselasticbeanstalkexample.bean.Calculation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class CalculationController {

//Test comment to commit

    @GetMapping("/addCalculation")
    public String sendForm(Calculation calculation){

        return "addCalculation";
    }

    @PostMapping("/addCalculation")
    public String processForm(Calculation calculation){

        calculateSum(calculation);

        return "showMessage";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    public void calculateSum(Calculation calculation){

        int i = Integer.parseInt(calculation.getNumberOne());
        int o = Integer.parseInt(calculation.getNumberTwo());
        int sum = i + o;

        calculation.setSum(String.valueOf(sum));
    }
}
