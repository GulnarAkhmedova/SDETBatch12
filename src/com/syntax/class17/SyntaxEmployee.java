package com.syntax.class17;

public class SyntaxEmployee {
    String empId;
    double salary;
   static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee aselClassObject=new SyntaxEmployee();
        aselClassObject.empId="123";
        aselClassObject.salary=200000;
        System.out.println(aselClassObject.empId);
        //System.out.println(aselClassObject.salary);// bad practice
        System.out.println(SyntaxEmployee.CEO); //a good practice

        SyntaxEmployee mozzamObject=new SyntaxEmployee();
        mozzamObject.empId="456";
        mozzamObject.salary=198000;
        System.out.println(mozzamObject.empId);
        System.out.println(mozzamObject.salary);
        System.out.println(SyntaxEmployee.CEO);
    }
}
