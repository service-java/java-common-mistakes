package org.geekbang.time.commonmistakes.ch27_clientdata.trustclientcalculation;

public class Db {

    public static Item getItem(long itemId) {
        return new Item();
    }
}
