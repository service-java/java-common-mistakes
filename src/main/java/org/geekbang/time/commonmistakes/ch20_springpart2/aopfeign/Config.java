package org.geekbang.time.commonmistakes.ch20_springpart2.aopfeign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "org.geekbang.time.commonmistakes.ch20_springpart2.aopfeign.feign")
public class Config {
}
