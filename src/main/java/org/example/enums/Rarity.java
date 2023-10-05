package org.example.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum Rarity {
    ORDINARY(60, "Обычный"),
    RARE(85, "Редкий"),
    MYSTICAL(95, "Мистический"),
    LEGENDARY(100, "Легендарный");

    private final int chance;
    private final String name;

    Rarity(int chance, String name) {
        this.chance = chance;
        this.name = name;
    }

    public static Rarity getRarity(int chance){
        if (chance < 60) {
            return ORDINARY;
        } else if (chance < 85) {
            return RARE;
        } else if (chance < 95) {
            return MYSTICAL;
        }
        return LEGENDARY;
    }
}
