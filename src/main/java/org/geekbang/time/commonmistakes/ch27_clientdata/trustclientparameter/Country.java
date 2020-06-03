package org.geekbang.time.commonmistakes.ch27_clientdata.trustclientparameter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Country {
    private int id;
    private String name;
}
