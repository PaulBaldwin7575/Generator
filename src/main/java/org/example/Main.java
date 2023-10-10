package org.example;

import org.example.enums.Names;
import org.example.enums.Rarity;
import org.example.enums.Utility;
import org.example.model.Item;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Введите уровень игрока:");
        var scanner = new Scanner(System.in);
        var level = scanner.nextInt();
        var main = new Main();
        for (int i = 0; i < 20; i++) {
//            var chance = (int) (Math.random() * 100 + level/4);
//            Rarity rarity = Rarity.getRarity(chance);
//            System.out.println(rarity.getName() + chance);
            var utility = Utility.getRandomUtility();
            var item = Item.builder()
                            .name(Names.getRandomNameWithGenderAndCategory(utility.getGender(), utility.getCategory()))
                            .category(utility.getCategory())
                            .rarity(Rarity.getRarity())
                            .utility(utility).build();
            System.out.println(item);
        }


    }

    public Utility generateUtility(){
        var utilities = Arrays.stream(Utility.values()).toList();
        //var choises = Arrays.stream(utilities).filter(utility -> utility.getCategory() == Category.ATTACK).collect(Collectors.toList());
        int random = (int) (Math.random() * utilities.size());
        return utilities.get(random);
    }
}