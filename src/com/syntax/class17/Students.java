package com.syntax.class17;

public class Students {
    String Name;
    String Id;
    static int numberOfStudents=3;

    public static void main(String[] args) {
        Students syntaxStudent=new Students();
        syntaxStudent.Name="Michal Jackson";
        syntaxStudent.Id="MJ111";
        Students.numberOfStudents++;

        Students syntaxStudent2=new Students();
        syntaxStudent2.Name="Jimi Hendrix";
        syntaxStudent2.Id= "JH222";
        Students.numberOfStudents++;


        Students syntaxStudent3=new Students();
        syntaxStudent3.Name="Whitney Houston";
        syntaxStudent3.Id="WH333";
        Students.numberOfStudents++;
        System.out.println(Students.numberOfStudents);
    }
}
