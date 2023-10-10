package org.example.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Random;

@Getter
public enum Names {
    FIRE("Огненный", "Огненная", "Огненное ", "Огненные", Category.ATTACK),
    DEMONIC("Демонический", "Демоническая", "Демоническое", "Демонические", Category.MAGIC),
    BRILLIANT("Бриллиантовый", "Бриллиантовая","Бриллиантовое","Бриллиантовые", Category.ARMOR),
    BRILLIANT_MAGIC("Бриллиантовый", "Бриллиантовая","Бриллиантовое","Бриллиантовые", Category.MAGIC),
    MAGIC("Магический", "Магическая", "Магическое", "Магические", Category.MAGIC),
    AMBER("Янтарный", "Янтарная", "Янтарное", "Янтарные", Category.ARMOR),
    SOURNESS("Кислотный", "Кислотная", "Кислотное", "Кислотные", Category.MAGIC),
    BLOODY("Кровавый", "Кровавая", "Кровавое", "Кровавые", Category.ATTACK),
    GRAVE("Могильный", "Могильная", "Могильное", "Могильные", Category.MAGIC),
    FREEZING("Леденящий", "Леденящая", "Леденящее", "Леденящие", Category.MAGIC),
    SINISTER("Зловещий", "Зловещая", "Зловещее", "Зловещие", Category.MAGIC),
    FATAL("Смертельный", "Смертельная", "Смертельное", "Смертельные", Category.ATTACK),
    POISONOUS("Ядовитый", "Ядовитая", "Ядовитое", "Ядовитые", Category.MAGIC),
    STONE("Каменный", "Каменная", "Каменное", "Каменные", Category.ATTACK),
    BLACK("Черный", "Черная", "Черное", "Черные", Category.ARMOR),
    FOGGY("Туманный", "Туманная", "Туманное", "Туманные", Category.MAGIC),
    SAPPHIRE("Сапфировый", "Сапфировая", "Сапфировое", "Сапфировые", Category.ATTACK),
    FULMINANT("Молниеносный", "Молниеносная", "Молниеносное", "Молниеносные", Category.ATTACK),
    CREEPY("Жуткий", "Жуткая", "Жуткое", "Жуткие", Category.MAGIC),
    CRUSHING("Сокрушительный", "Сокрушительная", "Сокрушительное", "Сокрушительные", Category.ATTACK),
    GHOST("Призрачный", "Призрачная", "Призрачное", "Призрачные", Category.MAGIC),
    LIGHT("Световой", "Световая", "Световое", "Световые", Category.ATTACK),
    IMPERIOUS("Могущественный", "Могущественная", "Могущественное", "Могущественные", Category.ATTACK),
    IMPERIOUS_MAGIC("Могущественный", "Могущественная", "Могущественное", "Могущественные", Category.MAGIC),
    IRON("Железный", "Железная", "Железное", "Железные", Category.ATTACK),
    IRON_ARMOR("Железный", "Железная", "Железное", "Железные", Category.ARMOR),
    MAGNETIC("Магнитный", "Магнитная", "Магнитное", "Магнитные", Category.MAGIC);

    private final String masculine;
    private final String feminine;
    private final String neuter;
    private final String plural;
    private final Category category;

    Names(String masculine, String feminine, String neuter, String plural, Category category) {
        this.masculine = masculine;
        this.feminine = feminine;
        this.neuter = neuter;
        this.plural = plural;
        this.category = category;
    }

    public static String getRandomNameWithGenderAndCategory(Gender gender, Category category) {
        Random random = new Random();
        var names = Arrays.stream(Names.values()).filter(it -> it.category.equals(category)).toList();
        var name = names.get(random.nextInt(names.size()));
        switch (gender) {
            case MASCULINE -> {
                return name.masculine;
            }
            case FEMININE -> {
                return name.feminine;
            }
            case NEUTER -> {
                return name.neuter;
            }
            case PLURAL -> {
                return name.plural;
            }
            default -> throw new RuntimeException("genderNotFound");
        }
    }
}
