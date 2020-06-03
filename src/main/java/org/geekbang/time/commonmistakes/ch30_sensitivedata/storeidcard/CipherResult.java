package org.geekbang.time.commonmistakes.ch30_sensitivedata.storeidcard;

import lombok.Data;

@Data
public class CipherResult {
    private Long id;
    private String cipherText;
}
