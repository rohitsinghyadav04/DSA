package com.rohit.O1_introduction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class J01_ClassesAndObj {
    public static void main(String[] args) {

//       com.rohit.intrdoduction.Student[] students = new com.rohit.intrdoduction.Student[5];

        // just declaring
        // student kunal;
        // kunal = new com.rohit.intrdoduction.Student();

        Student kunal = new Student(13, "Rohit Singh",95.3f);

//        kunal.rno = 13;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks  = 83.5f;

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
//        kunal.changeName(" Shoe lover");
//        kunal.greeting();

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name="Something";
        System.out.println(two.name);
    }
}

// create a class
// for every single student
class Student{
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above properties object by object
    // we need one word to access every object

    void greeting(){
        System.out.println("Hello! My name is" +name);
    }

    void changeName(String name){
       this.name = name;
    }

    Student (Student other) {
        this.name = other.name;
        this.rno =  other.rno;
        this.marks = other.marks;
    }

    Student() {
        // this is how you call a constructor from another constructor
        // internally: new student();
        this(13,"default person", 100.0f);
    }

    // com.rohit.intrdoduction.Student Arpit = new com.rohit.intrdoduction.Student(17,"Arpit", 89.7f);
    // here, this will be replaced with Arpit
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks  =marks;
    }
}