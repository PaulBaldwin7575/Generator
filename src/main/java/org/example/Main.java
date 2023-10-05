package org.example;

import org.example.enums.Rarity;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            var chance = (int) (Math.random() * 100);
            Rarity rarity = Rarity.getRarity(chance);
            System.out.println(rarity.getName() + chance);
        }

    }
}