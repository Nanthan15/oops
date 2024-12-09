package com.nanthan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Create an instance of student
        student nathan = new student();

        // Call the greeting method
        nathan.greeting();
        nathan.changename("Nanthan Shetty");
        student manthan = new student("manthang",12);
    }
}

class student {
    String name;
    int age;

    // Constructor
    student() {
        this.name = "Nanthan Shetty";
        this.age = 11;
        System.out.println("Hello"+name+"your age is :" +age);
    }

    student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello"+name+"your age is :" +age);
    }

    // Method

    void changename(String name1) {

        name = name1;
        System.out.println("after channging name");
        System.out.println("name is  : "+name);
    }

    @Override
    protected void finalize() throws Throwable {


    }

    void greeting() {
        System.out.println("Hello, World! " + name);
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }



}
