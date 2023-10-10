package org.example.model;

import lombok.Builder;
import lombok.Data;
import org.example.enums.Category;
import org.example.enums.Rarity;
import org.example.enums.Utility;

@Data
@Builder
public class Item {

    private String name;
    private Rarity rarity;
    private Utility utility;
    private Category category;

    @Override
    public String toString() {
        return String.format("Предмет: %s %s, тип: %s, редкость: %s",
                name, utility.getName(), category.getName(), rarity.getName());
    }
}
