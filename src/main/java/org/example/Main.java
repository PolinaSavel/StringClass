package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String text = scanner.nextLine();

        String text = "masha, Sasha, Glasha, MaSHa, Masha, glaShA";
        text = text.toLowerCase().strip().replace(",", "");
        String[] words = text.split(" ");
        String[] wordsUnikums = new String[words.length];

        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(" ");

        int counter = 0;

        for (int i = 0; i < words.length-1; i++) {
            boolean vstrecha= false;

            //for (String x : wordsUnikums) {
              //  String word = words[i];

            for (int j = 0; j < words.length-1; j++) {
                if (words[i].equals(wordsUnikums[j])){
           // } if (word.equals(x)) {
                    vstrecha = true;
                    break;
                }
            }

            if (!vstrecha){
                wordsUnikums[counter] = words[i];
                counter = counter +1;
            }

        }

        for (String x : wordsUnikums) {
            System.out.println(x);
        }

        String strokaItogovaya = String.join(" ", wordsUnikums);
        strokaItogovaya = strokaItogovaya.toLowerCase().strip().replace("null", "");
        String[] strokaRedaktorovannaya = strokaItogovaya.split(" ");
        System.out.println(strokaRedaktorovannaya.length);
    }
}
