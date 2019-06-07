package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;



    public Student(String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName=firstName;
        this.lastName=lastName;
        this.examScores=examScores;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getNumberOfExamsTaken() {
        return examScores.size();
    }
    public String getExamScores() {
        String scores="Exam Scores :";
        for(int i=0;i<examScores.size();i++){
        scores=scores+ "\n"+"   Exam "+i+" -> "+examScores.get(i);
        }
        return scores;
    }
    public void addExamScore(double examScore){
        examScores.add(examScore);
    }
    public void setExamScore(int examNumber,double newScore){
        examScores.set(examNumber,newScore);
    }
    public double getAverageExamScore(){
        double sum=0;
        double average=0;
        for(int i=0;i<examScores.size();i++){
            sum=sum+examScores.get(i);}
        average=sum/examScores.size();
        return average;
    }
    @Override
    public String toString(){
        String stuRecord="Student Name : "+firstName+" "+lastName;
        stuRecord=stuRecord+"\n"+"> Average Score: "+getAverageExamScore();
        stuRecord=stuRecord+"\n"+"> "+getExamScores();

     return stuRecord;
    }

}
