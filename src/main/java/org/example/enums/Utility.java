package org.example.enums;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Random;

@ToString
@Getter

public enum Utility {
    BLADE("Клинок", Category.ATTACK, Gender.MASCULINE, 2),
    SWORD("Одноручный меч", Category.ATTACK, Gender.MASCULINE, 6),
    DOUBLE_HAND_SWORD("Двуручный меч", Category.ATTACK, Gender.MASCULINE, 7),
    BOW("Лук", Category.ATTACK, Gender.MASCULINE, 5),
    CROSSBOW("Арбалет", Category.ATTACK, Gender.MASCULINE, 8),
    SPEAR("Копьё", Category.ATTACK, Gender.NEUTER, 3),
    AXE("Топор", Category.ATTACK, Gender.MASCULINE, 4),
    HELMET("Шлем", Category.ARMOR, Gender.MASCULINE, 5),
    HAT("Шляпа", Category.ARMOR, Gender.FEMININE, 1),
    BOOTS("Сапоги", Category.ARMOR, Gender.PLURAL, 2),
    GLOVES("Перчатки", Category.ARMOR, Gender.PLURAL, 2),
    PANTS("Штаны", Category.ARMOR, Gender.PLURAL, 4),
    JACKET("Куртка", Category.ARMOR, Gender.FEMININE, 6),
    BELT("Пояс", Category.ARMOR, Gender.MASCULINE, 3),
    MAGIC_WAND("Жезл", Category.MAGIC, Gender.MASCULINE, 3),
    MAGIC_RING("Кольцо", Category.MAGIC, Gender.NEUTER, 2),
    AMULET("Амулет", Category.MAGIC, Gender.MASCULINE, 4),
    STICK("Посох", Category.MAGIC, Gender.MASCULINE, 5);

    private final String name;
    private final Category category;
    private final Gender gender;
    private final int value;

    Utility(String name, Category category, Gender gender, int value) {
        this.name = name;
        this.category = category;
        this.gender = gender;
        this.value = value;
    }

    public static Utility getRandomUtility() {
        var utilities = Arrays.stream(Utility.values()).toList();
        Random random = new Random();
        var randomIndex = random.nextInt(utilities.size());
        return utilities.get(randomIndex);
    }
}
