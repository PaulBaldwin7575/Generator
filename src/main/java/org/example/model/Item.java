package org.example.model;

import lombok.Builder;
import lombok.Data;
import org.example.enums.Rarity;
import org.example.enums.Utility;

@Data
@Builder
public class Item {

    private String name;
    private Rarity rarity;
    private Utility utility;

    @Override
    public String toString() {
        return String.format("Предмет: %s %s, редкость: %s", name, utility.getName(), rarity.getName());
    }
}
