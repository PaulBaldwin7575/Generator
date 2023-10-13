package org.example;

import org.example.enums.*;
import org.example.model.Item;
import org.example.model.Property;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        System.out.println("Введите уровень игрока:");
        var scanner = new Scanner(System.in);
        var level = scanner.nextInt();
        for (int i = 0; i < 20; i++) {
            var utility = Utility.getRandomUtility();
            var properties = getProperties(utility, level);
            var power = (int) (utility.getValue() + (utility.getValue() * 0.1 * (level - 1)));
            var item = Item.builder()
                    .name(Names.getRandomNameWithGenderAndCategory(utility.getGender(), utility.getCategory()))
                    .category(utility.getCategory())
                    .power(power)
                    .properties(properties)
                    .rarity(getRarityOfItem(properties))
                    .price(getPrice(properties, power))
                    .utility(utility).build();
            System.out.println(item);
        }
    }

    public static Rarity getRarityOfItem(List<Property> properties) {
        Rarity rarity = Rarity.ORDINARY;
        for (Property property : properties) {
            if (property.getRarity().getChance() > rarity.getChance()) {
                rarity = property.getRarity();
            }
        }
        return rarity;
    }

    public static List<Property> getProperties(Utility utility, int level) {
        Random random = new Random();
        var numberOfProperties = random.nextInt(4) + 1;
        List<Property> propertyList = new ArrayList<>();
        if (numberOfProperties == 1) {
             propertyList.add(PositiveProperties.getRandomPositivePropertyOnCategory(utility.getCategory()));
             return propertyList;
        }
        var totalValue = 0;
        while (totalValue < Math.min(level, 5)) {
            propertyList.clear();
            totalValue = 0;
            var positiveProperties = Arrays.stream(PositiveProperties.values()).collect(Collectors.toList());
            var negativeProperties = Arrays.stream(NegativeProperties.values()).collect(Collectors.toList());
            for (int i = 0; i < numberOfProperties; i++) {
                var rarity = Rarity.getRarity();
                var positivePropertiesWithRarity = positiveProperties.stream().filter(it -> it.getRarity().equals(rarity)).collect(Collectors.toList());
                var isPositiveProperties = random.nextDouble() <= 0.5;
                if (isPositiveProperties) {
                    var property = positivePropertiesWithRarity.get(random.nextInt(positivePropertiesWithRarity.size())).getProperty();
                    propertyList.add(property);
                    positiveProperties = positiveProperties.stream().filter(it -> it.getCategory() != property.getCategory()).collect(Collectors.toList());
                    totalValue += property.getPrice();
                } else {
                    var property = negativeProperties.get(random.nextInt(negativeProperties.size())).getProperty();
                    propertyList.add(property);
                    negativeProperties = negativeProperties.stream().filter(it -> it.getCategory() != property.getCategory()).collect(Collectors.toList());
                    totalValue += property.getPrice();
                }
            }
        }
        return propertyList;
    }

    public static Integer getPrice(List<Property> properties, int power) {
        return properties.stream().mapToInt(Property::getPrice).sum() * 5 * power;
    }
}