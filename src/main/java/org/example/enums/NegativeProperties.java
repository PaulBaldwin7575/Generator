package org.example.enums;

import lombok.Getter;

@Getter
public enum NegativeProperties {

    ATTACK("", "Атака", 1, Rarity.ORDINARY);

    NegativeProperties(String name, String influence, int price, Rarity rarity) {
        this.name = name;
        this.influence = influence;
        this.price = price;
        this.rarity = rarity;
    }

    private String name;
    private String influence;
    private int price;
    private Rarity rarity;
}
