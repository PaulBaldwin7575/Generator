package org.example.enums;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Random;

@ToString
@Getter
public enum Utility {
    BLADE("Клинок", Category.ATTACK),
    SWORD("Меч", Category.ATTACK),
    BOW("Лук", Category.ATTACK),
    CROSSBOW("Арбалет", Category.ATTACK),
    SPEAR("Копьё", Category.ATTACK),
    HELMET("Шлем", Category.ARMOR),
    HAT("Шляпа", Category.ARMOR),
    BOOTS("Ботинки", Category.ARMOR),
    GLOVES("Перчатки", Category.ARMOR),
    PANTS("Штаны", Category.ARMOR),
    JACKET("Куртка", Category.ARMOR),
    BELT("Пояс", Category.ARMOR),
    MAGIC_WAND("Палочка", Category.MAGIC),
    MAGIC_RING("Кольцо", Category.MAGIC),
    AMULET("Амулет", Category.MAGIC),
    STICK("Посох", Category.MAGIC);

    private final String name;
    private final Category category;

    Utility(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public static Utility getRandomUtility() {
        var utilities = Arrays.stream(Utility.values()).toList();
        Random random = new Random();
        var randomIndex = random.nextInt(utilities.size());
//        (Math.random() * utilities.size());
        return utilities.get(randomIndex);
    }
}
