package org.geekbang.time.commonmistakes.ch05_httpinvoke.ribbonretry;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableFeignClients(basePackages = "org.geekbang.time.commonmistakes.ch05_httpinvoke.ribbonretry.feign")
public class AutoConfig {
}
