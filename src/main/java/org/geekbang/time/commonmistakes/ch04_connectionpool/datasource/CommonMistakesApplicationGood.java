package org.geekbang.time.commonmistakes.ch04_connectionpool.datasource;

import org.geekbang.time.commonmistakes._common.Utils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonMistakesApplicationGood {

    public static void main(String[] args) {

        Utils.loadPropertySource(CommonMistakesApplicationGood.class, "good.properties");
        SpringApplication.run(CommonMistakesApplicationGood.class, args);
    }
}

