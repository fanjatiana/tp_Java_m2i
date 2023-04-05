package org.example;

import java.util.Scanner;

public class ExercicePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yourWord = "";

        System.out.println("Donnez moi un mot");
        yourWord =scanner.nextLine();

        if (searchIfPalindrome(yourWord))
            System.out.println(yourWord + " " + "est un palindrome");
        else
            System.out.println(yourWord + " " + " n'est pas un palindrome");
    }
    public static boolean searchIfPalindrome(String yourWord){
        int i=0;
        int wordLength=yourWord.length()-1;
        boolean booleanValue=true;

        while(i<wordLength && booleanValue){
            if(yourWord.charAt(i)==yourWord.charAt(wordLength-i)){
                booleanValue = true;
            } else {
                booleanValue = false;
            }
            i++;
        }
        return booleanValue;
    }

}



