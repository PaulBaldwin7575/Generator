package org.example.enums;

import lombok.Getter;

@Getter
public enum Category {
    ATTACK("Урон"),
    ARMOR("Броня"),
    MAGIC("Магия");

    private final String name;

    Category(String name) {
        this.name = name;
    }
}
