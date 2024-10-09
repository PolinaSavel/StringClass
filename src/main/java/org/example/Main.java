package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        text = text.toLowerCase().strip().replace(",", "");
        String[] words = text.split(" ");
        String[] wordsUnikums = new String[words.length];

        for (String word : words) {
            System.out.println(word);
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i; j < words.length - 1; j++) {
                if (!words[i].equals(words[j + 1])) {
                    wordsUnikums[j] = words[i];
                } else {
                    wordsUnikums[j] = null;
                }
            }
        }

        String strokaItogovaya = String.join(" ", wordsUnikums);
        strokaItogovaya = strokaItogovaya.toLowerCase().strip().replace("null", "");
        String[] strokaRedaktorovannaya = strokaItogovaya.split(" ");
        System.out.println(strokaRedaktorovannaya.length);
    }
}