package br.com.trader.robot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ITraderRobotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ITraderRobotApplication.class, args);
	}
}
