package org.geekbang.time.commonmistakes.ch28_securitylastdefense.prventcouponfarming;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Coupon {
    private long userId;
    private BigDecimal amount;
}
