package org.example.enums;

import lombok.Getter;

@Getter
public enum Category {
    ATTACK("Урон"),
    ARMOR("Броня"),
    MAGIC("Магия"),
    ENDURANCE("Выносливость"),
    SECRECY("Скрытность"),
    SPEED("Скорость"),
    HEALTH("Здоровье");


    private final String name;

    Category(String name) {
        this.name = name;
    }
}
