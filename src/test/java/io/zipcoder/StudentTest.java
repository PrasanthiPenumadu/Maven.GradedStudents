package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void testGetExamScore() {
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);
        Assert.assertEquals("Exam Scores :\n" +
                "   Exam 0 -> 100.0\n" +
                "   Exam 1 -> 95.0\n" +
                "   Exam 2 -> 123.0\n" +
                "   Exam 3 -> 96.0", student.getExamScores());
    }

    @Test
    public void test2GetExamScore() {
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);
        Assert.assertNotEquals("Exam Scores :\n" +
                "   Exam 0 -> 100.0\n" +
                "   Exam 1 -> 95.0\n" +
                "   Exam 2 -> 123.0\n", student.getExamScores());
    }
    @Test
    public void testsetExamScore(){

        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);
        student.setExamScore(1, 150.0);
        Assert.assertEquals("Exam Scores :\n" +
                "   Exam 0 -> 100.0\n" +
                "   Exam 1 -> 150.0\n" +
                "   Exam 2 -> 123.0\n" +
                "   Exam 3 -> 96.0",student.getExamScores());
    }
    @Test
    public void test2setExamScore(){

        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);
        student.setExamScore(1, 150.0);
        Assert.assertNotEquals("Exam Scores :\n" + "   Exam 1 -> 150.0\n",student.getExamScores());
    }
@Test
    public void testgetAverageExamScore(){
    String firstName = "Leon";
    String lastName = "Hunter";
    ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
    Student student = new Student(firstName, lastName, examScores);
     Assert.assertEquals(103.5, student.getAverageExamScore(),0.00009);
}
    @Test
    public void test2getAverageExamScore(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);
        Assert.assertNotEquals(100.0, student.getAverageExamScore(),0.00009);
    }
    @Test
    public void testtoString(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);
    Assert.assertEquals("Student Name : Leon Hunter\n" +
            "> Average Score: 103.5\n" +
            "> Exam Scores :\n" +
            "   Exam 0 -> 100.0\n" +
            "   Exam 1 -> 95.0\n" +
            "   Exam 2 -> 123.0\n" +
            "   Exam 3 -> 96.0", student.toString());
    }
}