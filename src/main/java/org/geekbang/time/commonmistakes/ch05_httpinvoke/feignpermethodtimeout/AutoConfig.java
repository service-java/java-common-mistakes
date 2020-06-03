package org.geekbang.time.commonmistakes.ch05_httpinvoke.feignpermethodtimeout;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "org.geekbang.time.commonmistakes.ch05_httpinvoke.feignpermethodtimeout")
public class AutoConfig {
}
