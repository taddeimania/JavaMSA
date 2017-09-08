package io.joel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
public class JavamsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavamsaApplication.class, args);
	}

	@Bean
	public MsbClient msbClient(@Value("${msb.domain}")String url)  {
		return new MsbClient(url);

	}

}
