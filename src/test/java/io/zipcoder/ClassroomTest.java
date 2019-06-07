package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void testgetAverageExamScore(){
        ArrayList<Double>s1Scores = new ArrayList<Double>(Arrays.asList(100.0, 95.0));
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(100.0, 96.0));
        Student s1=new Student("Student", "one", s1Scores);
        Student s2=new Student("Student", "two", s2Scores);
        Student[] students=new Student[]{s1,s2};
        Classroom classroom =new Classroom(students);
        Assert.assertEquals(97.75, classroom.getAverageExamScore(),0.00009);
    }
    @Test
    public void test2getAverageExamScore(){
        ArrayList<Double>s1Scores = new ArrayList<Double>(Arrays.asList(100.0, 95.0));
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(100.0, 96.0));
        Student s1=new Student("Student", "one", s1Scores);
        Student s2=new Student("Student", "two", s2Scores);
        Student[] students=new Student[]{s1,s2};
        Classroom classroom =new Classroom(students);
        Assert.assertNotEquals(100, classroom.getAverageExamScore(),0.00009);
    }
    @Test
    public void testAddStudent(){
        int maxNumberOfStudents=2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double>examScores = new ArrayList<Double>(Arrays.asList(100.0,150.0,95.0));
        Student student = new Student("Leon1", "Hunter1", examScores);
        Student student1 = new Student("Leon2", "Hunter4", examScores);
        classroom.addStudent(student);
        classroom.addStudent(student1);
        Assert.assertEquals(2, classroom.getStudents());
    }
   @Test
    public void testRemoveStudent(){
       int maxNumberOfStudents=2;
       Classroom classroom = new Classroom(maxNumberOfStudents);
       ArrayList<Double>examScores = new ArrayList<Double>(Arrays.asList(100.0,150.0,95.0));
       Student student = new Student("Leon1", "Hunter1", examScores);
       ArrayList<Double>examScores1 = new ArrayList<Double>(Arrays.asList(102.0,150.0,105.0));
       classroom.addStudent(student);
       Student student1 = new Student("Leon2", "Hunter2", examScores1);
       classroom.addStudent(student1);
       classroom.removeStudent("Leon1", "Hunter1");
       Assert.assertEquals(1,classroom.getStudents());
   }
   @Test
    public void testgetStudentByScore(){
        //int maxNumbe4rOfStudents=10;
       Classroom classroom = new Classroom(6);
       ArrayList<Double>examScores = new ArrayList<Double>(Arrays.asList(100.0,150.0,95.0));
       Student student = new Student("Leon1", "Hunter1", examScores);
       ArrayList<Double>examScores1 = new ArrayList<Double>(Arrays.asList(102.0,150.0,105.0));
       classroom.addStudent(student);
       Student student1 = new Student("Leon2", "Hunter2", examScores1);
       classroom.addStudent(student1);
       ArrayList<Double>examScores2 = new ArrayList<Double>(Arrays.asList(10.0,90.0));
       Student student2 = new Student("Leon3", "Hunter3", examScores2);
       ArrayList<Double>examScores3 = new ArrayList<Double>(Arrays.asList(47.0,90.0));
       classroom.addStudent(student2);
       Student student3 = new Student("Leon4", "Hunter4", examScores3);
       classroom.addStudent(student3);
       ArrayList<Double>examScores4 = new ArrayList<Double>(Arrays.asList(10.0,90.0));
       Student student4 = new Student("Leon3", "Hunter3", examScores4);
       ArrayList<Double>examScores5 = new ArrayList<Double>(Arrays.asList(47.0,90.0));
       classroom.addStudent(student4);
       Student student5 = new Student("Leon4", "Hunter4", examScores5);
       classroom.addStudent(student5);
       Student[] sortedStudents = classroom.getStudentByScore();
      Assert.assertEquals(student1,sortedStudents[0]);

   }
   @Test
    public void testGradeBook(){
       int maxNumberOfStudents=10;
       Classroom classroom = new Classroom(maxNumberOfStudents);
       ArrayList<Double>examScores = new ArrayList<Double>(Arrays.asList(100.0,90.0));
       Student student = new Student("Leon1", "Hunter1", examScores);
       ArrayList<Double>examScores1 = new ArrayList<Double>(Arrays.asList(70.0,85.0));
       classroom.addStudent(student);
       Student student1 = new Student("Leon2", "Hunter2", examScores1);
       classroom.addStudent(student1);
       ArrayList<Double>examScores2 = new ArrayList<Double>(Arrays.asList(45.0,80.0));
       Student student2 = new Student("Leon3", "Hunter3", examScores2);
       ArrayList<Double>examScores3 = new ArrayList<Double>(Arrays.asList(87.0,90.0));
       classroom.addStudent(student2);
       Student student3 = new Student("Leon4", "Hunter4", examScores3);
       classroom.addStudent(student3);
       ArrayList<Double>examScores4 = new ArrayList<Double>(Arrays.asList(10.0,90.0));
       Student student4 = new Student("Leon5", "Hunter5", examScores4);
       ArrayList<Double>examScores5 = new ArrayList<Double>(Arrays.asList(47.0,90.0));
       classroom.addStudent(student4);
       Student student5 = new Student("Leon6", "Hunter6", examScores5);
       classroom.addStudent(student5);
       ArrayList<Double>examScores6 = new ArrayList<Double>(Arrays.asList(87.0,90.0));
       Student student6 = new Student("Leon7", "Hunter7", examScores6);
       classroom.addStudent(student6);
       ArrayList<Double>examScores7 = new ArrayList<Double>(Arrays.asList(87.0,90.0));
       Student student7 = new Student("Leon8", "Hunter8", examScores7);
       classroom.addStudent(student7);
       ArrayList<Double>examScores8 = new ArrayList<Double>(Arrays.asList(10.0,90.0));
       Student student8 = new Student("Leon9", "Hunter9", examScores8);
       classroom.addStudent(student8);
       ArrayList<Double>examScores9= new ArrayList<Double>(Arrays.asList(47.0,90.0));
       Student student9 = new Student("Leon10", "Hunter10", examScores9);
       classroom.addStudent(student9);
       String expected="  Grade A";
   Assert.assertEquals(expected,classroom.getGradeBook().get(student));
    
   }
}
