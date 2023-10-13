package org.example.enums;

import lombok.Getter;
import org.example.model.Property;

@Getter
public enum NegativeProperties {

    HEALTH("Нездоровый", "-5% к лечению вне боя",-1, Rarity.ORDINARY, Category.HEALTH),
    BAD_HEALTH("Проклятый", "Отнимает 30 единиц здоровья при каждом использовании магии",-2, Rarity.MYSTICAL, Category.HEALTH),
    WORTH_HEALTH("Умирающий", "-5% к общему здоровью",-4, Rarity.MYSTICAL, Category.HEALTH),
    SPEED("Замедление", "-10% к скорости передвижения",-2, Rarity.ORDINARY, Category.SPEED),
    BAD_SPEED("Неуклюжесть", "Уменьшает шанс уклониться на 15%",-3, Rarity.MYSTICAL, Category.SPEED),
    WORTH_SPEED("Медленный", "-10% к скорости восстановления всех ресурсов",-5, Rarity.MYSTICAL, Category.SPEED),
    ATTACK("Ослабление", "Уменьшает урон на 5%",-1, Rarity.ORDINARY, Category.ATTACK),
    BAD_ATTACK("Киллер", "Ударяет двух противников сразу",-3, Rarity.MYSTICAL, Category.ATTACK),
    WORTH_ATTACK("Некритичный удар", "-25% к шансу критического удара",-4, Rarity.MYSTICAL, Category.ATTACK),
    ARMOR("Небронированный", "-10% к броне",-2, Rarity.ORDINARY, Category.ARMOR),
    BAD_ARMOR("Хрупкость", "-15% шанс отклонить удар",-4, Rarity.MYSTICAL, Category.ARMOR),
    WORTH_ARMOR("Плохая броня", "Блокирует на 20% ударов меньше",-6, Rarity.MYSTICAL, Category.ARMOR),
    MAGIC("Такая себе магия", "-10% к эффективности заклинаний",-1, Rarity.ORDINARY, Category.MAGIC),
    BAD_MAGIC("Восприимчивость к магии", "Увеличивает урон от заклинаний противников на 15%",-3, Rarity.MYSTICAL, Category.MAGIC),
    WORTH_MAGIC("Ограничение заклинаний", "-20% к дальности магии",-5, Rarity.MYSTICAL, Category.MAGIC),
    ENDURANCE("Уставший", "-5% к скорости атаки",-2, Rarity.ORDINARY, Category.ENDURANCE),
    BAD_ENDURANCE("Вымотанный", "Каждый удар тратит на 10% больше выносливости",-4, Rarity.MYSTICAL, Category.ENDURANCE),
    WORTH_ENDURANCE("Больше не могу", "-30% к общей выносливости",-6, Rarity.MYSTICAL, Category.ENDURANCE),
    SECRECY("Заметный", "Увеличивает заметность на 15%",-1, Rarity.ORDINARY, Category.SECRECY),
    BAD_SECRECY("Топающий", "Враг заметит Вас, если Вы примените любое заклинание",-3, Rarity.MYSTICAL, Category.SECRECY),
    WORTH_SECRECY("Я здесь", "Враги всегда знают, где Вы находитесь",-5, Rarity.MYSTICAL, Category.SECRECY);




    private final String name;
    private final String influence;
    private final int price;
    private final Rarity rarity;
    private final Category category;

    NegativeProperties(String name, String influence, int price, Rarity rarity, Category category) {
        this.name = name;
        this.influence = influence;
        this.price = price;
        this.rarity = rarity;
        this.category = category;
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
