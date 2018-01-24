package com.hellcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RvnieufviApplication {

    public static void main(String[] args) {
        TestKotlinClass t = new TestKotlinClass();
        t.getInt();

        SpringApplication.run(RvnieufviApplication.class, args);

    }
}
