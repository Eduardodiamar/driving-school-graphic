/*
 */
package PKedu;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author eduardodiamar
 */
public class ClassStudent {
    // 1-Properties
    private String name;
    private String lastName;
    private int age;
    private String dni;
    private int[] grades;
    private double averageGrades;
    private int [] gradesSubject = new int [4];

    // 2-Constructor
    public ClassStudent(){};
    
    public ClassStudent(String name, String lastName, int age){
        setName(name);
        setLastName(lastName);
        setAge(age);
    };
    
     public ClassStudent(String name, String lastName, int age, int [] grades){
        setName(name);
        setLastName(lastName);
        setAge(age);
        setGrades(grades); 
    };
     
    // 3-Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        return grades;
    }
    public void setGrades(int[] grades){
        this.grades = grades;
    }
    
    
    public String getDni() {
        return dni;
    }

   
    public void setDni(String dni) {
        this.dni = dni;
    }
   
    public int[] getGradesSubject() {
        return gradesSubject;
    }

    public void setGradesSubject( int subject, int grade) {
        this.gradesSubject[subject] = grade;
    }
    
    // 4- Auxiliary method
    public double getAverageGrades(){
        int[] grades = getGrades();
        double averageGrades = 0;
        for (int i = 0; i < grades.length; i++) {
            averageGrades += grades[i];
        }
        averageGrades = averageGrades/grades.length;
        return averageGrades;
    }
    public double getAverageGrades2() {
        int[] gradesSubject
                = getGradesSubject();
        double averageGrades = 0;
        for (int i = 0; i < gradesSubject.length; i++) {
            averageGrades += gradesSubject[i];
        }
        averageGrades = averageGrades / gradesSubject.length;
        return averageGrades;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: "+getName()+"\n\r");
        sb.append("Last Name: "+getLastName()+"\n\r");
        sb.append("Dni: "+getDni()+"\n\r");
        sb.append("Age "+getAge()+"\n\r");
        sb.append(Arrays.toString(grades)+"\n\r");
        return sb.toString();
    }
    public String toStringGrades(){
        StringBuilder sb = new StringBuilder();
        sb.append("|M1|M2|M3|M4|\n\r");
        sb.append(Arrays.toString(gradesSubject)+"\n\r");
        return sb.toString();
    }

    
    
}
