package org.example.enums;

import lombok.Data;
import lombok.Getter;

import java.util.Random;

@Getter
public enum Rarity {
    ORDINARY(1, "Обычный"),
    MYSTICAL(2, "Мистический"),
    LEGENDARY(3, "Легендарный");

    private final int chance;
    private final String name;

    Rarity(int chance, String name) {
        this.chance = chance;
        this.name = name;
    }

    public static Rarity getRarity(){
        Random random = new Random();
        var chance = random.nextInt(100);
        if (chance < 60) {
            return ORDINARY;
        } else if (chance < 90) {
            return MYSTICAL;
        }
        return LEGENDARY;
    }
}
