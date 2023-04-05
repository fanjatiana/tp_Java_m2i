package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class ExerciceNotes {

    // Demander à l'utilisateur de saisir un prénom et une note
    // Tant que l'utilisateur n'a pas saisi -1, le programme continue de demander la saisie
    // boucle while do while for
    // scanner pour demander les infos de saisie

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] arrayNotes = new float[5];
        String[] arrayNames = new String[5];
        int count = 0;

        while (arrayNotes[count] > -1){
            System.out.println("Veuillez rentrer une note");
            arrayNotes[count] = scanner.nextInt();

            if(arrayNotes[count]== -1 ){
                break;
            }
            System.out.println("Veuillez rentrer le nom d'un élève");
            arrayNames[count]=scanner.next();
            count++;
        }
       display(count,arrayNames,arrayNotes);
    }
    static void display( int count,String[] arrayNames, float[] arrayNotes){
        for (int i = 0; i < count ; i++) {
            System.out.println(arrayNames[i] +" a eu la note de" +" " + arrayNotes[i] + " " + "en Sport");
        }
    }


}

