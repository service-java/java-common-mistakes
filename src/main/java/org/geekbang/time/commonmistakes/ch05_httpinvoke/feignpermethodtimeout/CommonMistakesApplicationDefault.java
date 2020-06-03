package org.geekbang.time.commonmistakes.ch05_httpinvoke.feignpermethodtimeout;

import org.geekbang.time.commonmistakes._common.Utils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CommonMistakesApplicationDefault {

    public static void main(String[] args) {
        Utils.loadPropertySource(CommonMistakesApplicationDefault.class, "default.properties");
        SpringApplication.run(CommonMistakesApplicationDefault.class, args);
    }
}

