package br.edu.infnet.appaluguelcarros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppaluguelcarrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppaluguelcarrosApplication.class, args);
	}

}
