package org.example;

import org.example.enums.Rarity;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Введите уровень игрока(от 1 до 100):");
        var scanner = new Scanner(System.in);
        var level = scanner.nextInt();
        for (int i = 0; i < 20; i++) {
            var chance = (int) (Math.random() * 100 + level/4);
            Rarity rarity = Rarity.getRarity(chance);
            System.out.println(rarity.getName() + chance);
        }

    }
}