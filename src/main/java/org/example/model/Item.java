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
}
