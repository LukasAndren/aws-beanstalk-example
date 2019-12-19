package com.example.aws.awselasticbeanstalkexample;

import com.example.aws.awselasticbeanstalkexample.bean.Calculation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AwsElasticBeanstalkExampleApplicationTests {
	private CalculationController calculationController = new CalculationController();
	private Calculation calculation = new Calculation();

	@Test
	void contextLoads() {
	}

	@Test
	public void testCalculateSum(){

		calculation.setNumberOne("10");
		calculation.setNumberTwo("5");

		calculationController.calculateSum(calculation);

		assert "15".equals(calculation.getSum());

	}

}
