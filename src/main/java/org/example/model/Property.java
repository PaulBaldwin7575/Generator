package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.Category;
import org.example.enums.Rarity;

@Data
@Builder
public class Property {
    private String name;
    private String influence;
    private int price;
    private Rarity rarity;
    private Category category;

    @Override
    public String toString() {
        return String.format("%s, влияние: %s, стоимость: %s", name, influence, price);
    }
}
