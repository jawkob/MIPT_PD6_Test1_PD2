package com.example.mipt_pd2;

public class StringProcessing {

    public static int wordCounter(String input) {
        if (input == null || input.isEmpty())
            return 0;

        int wordCount = 0;

        boolean isWord = false;
        int endOfLine = input.length() - 1;
        char[] characters = input.toCharArray();

        for (int i = 0; i < characters.length; i++) {

            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;

            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;

            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }

        return wordCount;
    }

    public static int charCounter(String input) {
        int charCount = 0;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != ' ')
                charCount++;
        }
        return charCount;
    }

}
