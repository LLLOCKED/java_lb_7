package com.company;

public class Student {

    private int id;
    private static int nextId;
    private String name;
    String surname;
    String group;
    public Subject[] subjects;


    {
        nextId++;
    }
    static {
        nextId --;
    }

    public Student(String name, String surname, String group) {

        this.id=nextId;
        this.name = name;
        this.surname = surname;
        this.group = group;
        subjects = new Subject[5];

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(){
        for(int i=0;i<this.subjects.length;i++){
            subjects[i] = new Subject();
            subjects[i].setSub(i);
            subjects[i].setMark();
            subjects[i].setPassed();

        }
    }

    public void print_all(){
        String pass;
        float bal = 0;
        String scholarship;

        P.rint("Студент: "+getName()+" ");
        P.rintln(getSurname());

        for (Subject subject : subjects){
            if(subject.isPassed()){
                pass = "Зачет";
            }else{
                pass = "Не зачет";
            }
            P.rintln(subject.getSub() +" - "+ String.format("%.2f",subject.getMark())+" - "+pass);
            bal += subject.getMark();
        }
        float avg = bal/subjects.length;
        P.rintln("");
        P.rint("Средняя оценка: "+String.format("%.2f",avg) + " - ");

        if(avg == 5.0){
            scholarship = "Повишеная";
        }
        else if(avg >= 4.0 && avg <= 4.9){
            scholarship = "Обычная степендия";
        }
        else{
            scholarship = "Не получает стипендию";
        }
        P.rintln(scholarship);
        P.rintln("");

    }

    static class Subject {

        private final int SIZE_ARR = 5;
        public String nameSubject;
        float mark;
        boolean passed;
        private Sub sub;

//        String[] nameSubjects = new String[SIZE_ARR];

//        public Subject (int i){
//            setNameSubject(i);
//        }

        public Subject (){

        }

//        public String getNameSubject() {
//            return nameSubject;
//        }

//        public void setNameSubject(int i){
//            nameSubjects = new String[]{"Математика", "Базы данных", "JAVA", "ВЕБ", "СП"};
//            this.nameSubject=nameSubjects[i];
//        }


        public Sub getSub() {
            return sub;
        }

        public void setSub(int i) {
            Sub[] subs = Sub.values();
            this.sub = subs[i];
        }

        public Float getMark() {
            return mark;
        }

        public void setMark() {
            mark = (float) (2 + (Math.random()*3));
        }

        public boolean isPassed() {
            return passed;
        }

        public void setPassed() {
            passed = getMark()>3;
        }
    }
    
}
