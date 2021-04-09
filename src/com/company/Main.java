package com.company;

public class Main {

    public static void main(String[] args) {

        final int STUDENT_COUNT = 5;
        Student[] stud = new Student[STUDENT_COUNT];

        stud[0]= new Student("Влад","Матвиенко","IN-83-0");
        stud[1]= new Student("Данила","Степанов","IN-83-0");
        stud[2]= new Student("Петро","Иванов","IN-83-0");
        stud[3]= new Student("Слава","Ярошенко","IN-81");
        stud[4]= new Student("Марк","Ярмоленко","IN-83-0");


        for (int i=0; i<STUDENT_COUNT;i++){
            stud[i].setSubjects();
        }
        for (int i=0; i<STUDENT_COUNT;i++){
            stud[i].print_all();
        }

        Utils u = new Utils();

        int best = Integer.parseInt(u.getTheBestSubject(stud));
        P.rintln("Лучший предмет: "+stud[1].subjects[best].getSub());

        int bast = Integer.parseInt(u.getTheBestStudent(stud));
        P.rintln("Лучший студент: "+stud[bast].getName() + " "+stud[bast].getSurname());

    }
}
