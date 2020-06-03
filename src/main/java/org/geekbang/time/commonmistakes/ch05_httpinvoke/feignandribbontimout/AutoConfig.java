package org.geekbang.time.commonmistakes.ch05_httpinvoke.feignandribbontimout;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "org.geekbang.time.commonmistakes.ch05_httpinvoke.feignandribbontimout")
public class AutoConfig {
}
