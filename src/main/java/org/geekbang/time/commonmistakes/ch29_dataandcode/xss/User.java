package org.geekbang.time.commonmistakes.ch29_dataandcode.xss;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    private Long id;
    private String name;
}
