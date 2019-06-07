package io.zipcoder;

import java.util.*;

public class Classroom {
    Student[] students;
    int max;

    public Classroom(int maxNumberOfStudents) {
        this.max = maxNumberOfStudents;
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] student) {
        this.students = student;
        this.max = students.length;
    }

    public Classroom() {
        students = new Student[30];
        this.max = students.length;
    }

    public int getStudents() {
        return students.length;
    }

    public double getAverageExamScore() {
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < students.length; i++)
            sum = sum + students[i].getAverageExamScore();
        avg = sum / students.length;
        return avg;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }

    }

    public void removeStudent(String firstName, String lastName) {
        ArrayList<Student> studentsAL = new ArrayList<Student>(Arrays.asList(students));
        for (int i = 0; i < studentsAL.size(); i++) {

            if (studentsAL.get(i).getFirstName().equalsIgnoreCase(firstName) && studentsAL.get(i).getLastName().equalsIgnoreCase(lastName)) {
                studentsAL.remove(i);
            }
        }
        students = studentsAL.toArray(new Student[studentsAL.size()]);
    }

    public Student[] getStudentByScore() {
        Comparator<Student> studentsNameComparator = Comparator.comparing(Student::getAverageExamScore);
        Comparator<Student> studentComparatorReversed = studentsNameComparator.reversed();
        Arrays.sort(students, studentComparatorReversed);

        return students;
    }

    public HashMap getGradeBook() {
        HashMap<Student, String> hm = new HashMap<Student,String>();
        Student[] studentByGrade =getStudentByScore();
        Integer len=studentByGrade.length;
      for(int i= 0;  i <len;i++){
            if(i<=len/10 || i ==0)
            hm.put(studentByGrade[i], "  Grade A");
            else  if((i>len/10&&i<=(len/3)))
                hm.put(studentByGrade[i], "  Grade B");
            else if(i>(len/3)&&(i<=(len/2)))
                hm.put(studentByGrade[i], "  Grade C");
            else if(i>(len/2)&&i<=(len/1.9))
                hm.put(studentByGrade[i], "  Grade D");
            else if(i>(len/1.9))
                hm.put(studentByGrade[i],"  Grade F");
        }

    return hm;
    }
}