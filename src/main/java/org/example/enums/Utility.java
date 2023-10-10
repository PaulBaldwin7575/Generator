package org.example.enums;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Random;

@ToString
@Getter
public enum Utility {
    BLADE("Клинок", Category.ATTACK, Gender.MASCULINE),
    SWORD("Меч", Category.ATTACK, Gender.MASCULINE),
    BOW("Лук", Category.ATTACK, Gender.MASCULINE),
    CROSSBOW("Арбалет", Category.ATTACK, Gender.MASCULINE),
    SPEAR("Копьё", Category.ATTACK, Gender.NEUTER),
    HELMET("Шлем", Category.ARMOR, Gender.MASCULINE),
    HAT("Шляпа", Category.ARMOR, Gender.FEMININE),
    BOOTS("Сапоги", Category.ARMOR, Gender.PLURAL),
    GLOVES("Перчатки", Category.ARMOR, Gender.PLURAL),
    PANTS("Штаны", Category.ARMOR, Gender.PLURAL),
    JACKET("Куртка", Category.ARMOR, Gender.FEMININE),
    BELT("Пояс", Category.ARMOR, Gender.MASCULINE),
    MAGIC_WAND("Палочка", Category.MAGIC, Gender.FEMININE),
    MAGIC_RING("Кольцо", Category.MAGIC, Gender.NEUTER),
    AMULET("Амулет", Category.MAGIC, Gender.MASCULINE),
    STICK("Посох", Category.MAGIC, Gender.MASCULINE);

    private final String name;
    private final Category category;
    private final Gender gender;

    Utility(String name, Category category, Gender gender) {
        this.name = name;
        this.category = category;
        this.gender = gender;
    }

    public static Utility getRandomUtility() {
        var utilities = Arrays.stream(Utility.values()).toList();
        Random random = new Random();
        var randomIndex = random.nextInt(utilities.size());
//        (Math.random() * utilities.size());
        return utilities.get(randomIndex);
    }
}
