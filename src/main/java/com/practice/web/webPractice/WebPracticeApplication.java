package com.practice.web.webPractice;

import com.practice.web.webPractice.stream.StreamPractice;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class WebPracticeApplication implements CommandLineRunner {

    private final StreamPractice practice;

	public static void main(String[] args) {
		SpringApplication.run(WebPracticeApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        practice.streamCode();
    }
}
