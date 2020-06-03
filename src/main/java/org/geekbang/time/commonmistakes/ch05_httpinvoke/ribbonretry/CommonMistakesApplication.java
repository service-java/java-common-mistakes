package org.geekbang.time.commonmistakes.ch05_httpinvoke.ribbonretry;

import org.geekbang.time.commonmistakes._common.Utils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CommonMistakesApplication {

    public static void main(String[] args) {

        Utils.loadPropertySource(CommonMistakesApplication.class,"default-ribbon.properties");
        SpringApplication.run(CommonMistakesApplication.class, args);
    }
}

