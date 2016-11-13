package com.lesson_three.eiko.report_card;

public class ReportCard {

    public static void main(String[] args){
        ReportCard math = new ReportCard( "math", 79);
        System.out.println(math.toString());
    }

    private String className;
    private int grade;

    public ReportCard(String className, int grade){
        this.className = className;
        this.grade = grade;
    }
    public void setClassName(String className){
        this.className = className;
    }

    public String getClassName(){
        return className;
    }

    public void setGrade(int grade){
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

    public String toString(){
        return "Report card " +
                "\n Class Name : "+ className
                + "\n Grade : " + grade;
    }
}

