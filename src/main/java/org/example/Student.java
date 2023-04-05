package org.example;

public class Student {
        // Exercice : Projet à reprendre  => Le transformer avec une (ou plusieurs classes si besoin..)
        //Nous souhaitons en revanche les données minimales suivantes :
        //prénom
        //nom
        //note
        //age

        String firstname;
        String lastname;
        float mark;
        int age;

        public Student(String firstname, String lastname, float mark, int age){
            this.firstname = firstname;
            this.lastname = lastname;
            this.mark = mark;
            this.age = age;
        }
    }