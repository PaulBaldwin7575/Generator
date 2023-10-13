package org.example.model;

import lombok.Builder;
import lombok.Data;
import org.example.enums.Category;
import org.example.enums.Rarity;
import org.example.enums.Utility;

import java.util.List;

@Data
@Builder
public class Item {

    private String name;
    private Rarity rarity;
    private Utility utility;
    private Category category;
    private int power;
    private List<Property> properties;
    private int price;

    @Override
    public String toString() {
        return String.format("Предмет: %s %s, тип: %s, мощность: %s свойства: %s, стоимость: %s золотых монет, редкость: %s",
                name, utility.getName(), category.getName(), power, properties, price, rarity.getName());
    }
}
