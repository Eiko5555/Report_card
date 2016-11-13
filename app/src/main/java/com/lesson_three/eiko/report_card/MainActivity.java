package com.lesson_three.eiko.report_card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String className;
    private String grade;

    public void createreportCard(String className, String grade){
        this.className = className;
        this.grade = grade;
    }
    public void setClassName(String className){
        this.className = className;
    }
    public String getClassName(){
        return className;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade(int score){
        String grade;
        
        if (score<101 && score >89 )
            grade = "A";
        else if (score<90 && score>79)
            grade = "B";
        else if (score<80 && score>69)
            grade="C";
        else if (score<70 && score>59)
            grade = "D";
        else if (score<60 && score>=0)
            grade = "F";
        else {
            grade = "F";
        }
        return grade;
    }

    public String reportMessage(){
        return "Report card " +
                "\n Class Name : "+ className
                + "\n Grade : " + grade;
    }
}

