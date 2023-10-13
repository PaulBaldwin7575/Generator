package org.example.enums;

import lombok.Getter;
import org.example.model.Property;

import java.util.Arrays;
import java.util.Random;

@Getter
public enum PositiveProperties {
    HEALTH("Здоровье", "+3% к лечению вне боя",1, Rarity.ORDINARY, Category.HEALTH),
    GOOD_HEALTH("Живучий", "Восстанавливает 5 единиц здоровья при каждом убийстве",6, Rarity.MYSTICAL, Category.HEALTH),
    GREAT_HEALTH("Бессмертный", "+10% к общему здоровью",8, Rarity.LEGENDARY, Category.HEALTH),
    SPEED("Быстрый", "+15% к скорости передвижения",2, Rarity.ORDINARY, Category.SPEED),
    HIGH_SPEED("Уклоняющийся", "Увеличивает шанс уклониться на 10%",5, Rarity.MYSTICAL, Category.SPEED),
    SUPER_SPEED("Восстанавливающийся", "+20% к скорости восстановления всех ресурсов",9, Rarity.LEGENDARY, Category.SPEED),
    ATTACK("Атакующий", "Увеличивает мощность удара на 5%",1, Rarity.ORDINARY, Category.ATTACK),
    NOT_BAD_ATTACK("Киллер", "Ударяет двух противников сразу",3, Rarity.MYSTICAL, Category.ATTACK),
    SUPER_ATTACK("Крушитель", "25% шанс нанести удар с силой в 3 раза выше",5, Rarity.LEGENDARY, Category.ATTACK),
    ARMOR("Бронированный", "+5% к броне",2, Rarity.ORDINARY, Category.ARMOR),
    GOOD_ARMOR("Железный", "15% шанс отклонить удар",4, Rarity.MYSTICAL, Category.ARMOR),
    GREAT_ARMOR("Непробиваемый", "Блокирует 20% ударов противников",8, Rarity.LEGENDARY, Category.ARMOR),
    MAGIC("Магический", "+10% к дальности заклинаний",1, Rarity.ORDINARY, Category.MAGIC),
    SUPER_MAGIC("Невосприимчивый", "Уменьшает урон от заклинаний противников на 20%",3, Rarity.MYSTICAL, Category.MAGIC),
    MEGA_MAGIC("Отравляющий", "Вызывает кровотечение у противников при использовании заклинаний",5, Rarity.LEGENDARY, Category.MAGIC),
    ENDURANCE("Выносливый", "+5% к скорости атаки",2, Rarity.ORDINARY, Category.ENDURANCE),
    GOOD_ENDURANCE("Спортсмен", "Каждый удар тратит на 10% меньше выносливости",6, Rarity.MYSTICAL, Category.ENDURANCE),
    EXCELLENT_ENDURANCE("Рэмбо", "+30% к общей выносливости",9, Rarity.LEGENDARY, Category.ENDURANCE),
    SECRECY("Скрытный", "Уменьшает заметность на 10%",1, Rarity.ORDINARY, Category.SECRECY),
    GREAT_SECRECY("Ниндзя", "Враг не заметит Вас, если подойти со спины",4, Rarity.MYSTICAL, Category.SECRECY),
    EXCELLENT_SECRECY("Невидимый", "Враги не видят Вас, пока Вы не ударите их",8, Rarity.LEGENDARY, Category.SECRECY);

    private final String name;
    private final String influence;
    private final int price;
    private final Rarity rarity;
    private final Category category;

    PositiveProperties(String name, String influence, int price, Rarity rarity, Category category) {
        this.name = name;
        this.influence = influence;
        this.price = price;
        this.rarity = rarity;
        this.category = category;
    }

    public static Property getRandomPositivePropertyOnCategory(Category category) {
        var positiveProperties = Arrays.stream(PositiveProperties.values()).toList();
        positiveProperties = positiveProperties.stream().filter(it -> it.category.equals(category)).toList();
        Random random = new Random();
        var property = positiveProperties.get(random.nextInt(positiveProperties.size()));
        return Property.builder().name(property.name)
                .category(property.category)
                .influence(property.influence)
                .price(property.price)
                .rarity(property.rarity)
                .build();
    }

    public Property getProperty() {
        return Property.builder()
                .name(name)
                .category(category)
                .influence(influence)
                .price(price)
                .rarity(rarity)
                .build();
    }

}
