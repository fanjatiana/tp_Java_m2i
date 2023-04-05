package org.example;
import java.util.Scanner;

public class ExerciceNotePoo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] studentsList = new Student[100];

        int count = 0;

        for (int i = 0; i <studentsList.length ; i++) {
            System.out.println("Veuillez ajouter un prénom");
            String firstname = scanner.next();
            System.out.println("Veuillez ajouter un nom");
            String lastname = scanner.next();
            System.out.println("Veuillez ajouter une note");
            float mark = scanner.nextFloat();
            if (mark == -1) {
                System.out.println("une note de -1 n'est pas possible !");
                break;
            }
            System.out.println("Veuillez ajouter un age");
            int age = scanner.nextInt();
            Student student= new Student(firstname,lastname,mark,age);
            studentsList[i]=student;
            count ++;
        }
        display(count,studentsList);
    }
    static void display( int count,Student[] studentsList){
        for (int i = 0; i < count ; i++) {
            System.out.println(studentsList[i].lastname + "a reçu comme note " + studentsList[i].mark + " en Français" );
        }
    }

}


