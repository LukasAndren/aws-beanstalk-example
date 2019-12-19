package com.example.aws.awselasticbeanstalkexample;

import com.example.aws.awselasticbeanstalkexample.bean.Calculation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
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

    public void calculateSum(Calculation calculation){

        int i = Integer.parseInt(calculation.getNumberOne());
        int o = Integer.parseInt(calculation.getNumberTwo());
        int sum = i + o;

        calculation.setSum(String.valueOf(sum));
    }
}
