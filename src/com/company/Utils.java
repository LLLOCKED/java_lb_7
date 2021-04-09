package com.company;

public class Utils {
    public float [] sum ;
    public float [] ball_avg;


    public String getTheBestStudent(Student[] students){
        ball_avg = new float[students.length];
        sum = new float[5];
        int maxID = 0;


        for (int j = 0; j<students.length;j++){
            {
                for(int i = 0; i<5; i++){
                    ball_avg[j] += students[j].subjects[i].getMark();
                }
            }
        }
        float max = ball_avg[0];

        for(int i=0; i<ball_avg.length;i++){
            if(ball_avg[i]>max){
                max = ball_avg[i];
                maxID = i;
            }
        }

        return String.valueOf(maxID);

    }

    public String  getTheBestSubject(Student[] students){
        sum = new float[5];
        int maxID = 0;

        for (Student value : students){
            for(int i = 0; i<5; i++){
                sum[i] += value.subjects[i].getMark();
            }
        }

        float max_sub = sum[0];

        for(int i=0; i<sum.length;i++){
            if(sum[i]>max_sub){
                max_sub = sum[i];
                maxID = i;
            }
        }
        return String.valueOf(maxID);
    }
}
