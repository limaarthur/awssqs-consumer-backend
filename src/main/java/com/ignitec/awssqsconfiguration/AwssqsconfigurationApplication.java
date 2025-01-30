package com.ignitec.awssqsconfiguration;

import com.ignitec.awssqsconfiguration.consumer.MyMessage;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwssqsconfigurationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AwssqsconfigurationApplication.class, args);
	}

	@Autowired
	private SqsTemplate sqsTemplate;


	@Override
	public void run(String... args) throws Exception {
		var SQS = "https://localhost.localstack.cloud:4566/000000000000/minha-fila";	
		sqsTemplate.send(SQS, new MyMessage("meu valor de start"));
	}
}
