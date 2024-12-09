package com.nanthan.inheritance.single;

class first {
     String firstName;
     String lastName;

    public first(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
 class second extends first{
    int age;

    public second(String firstName, String lastName,int age) {
        super(firstName, lastName);
        this.age = age;
    }
}

class three extends second{
    int account_number;
    public three(String firstName, String lastName,int age,int account_number) {
        super(firstName,lastName,age);
        this.account_number = account_number;
    }
}

public class main {
    public static void main(String[] args) {
        three get = new three("nanthan","shetty",21,454545);
        System.out.println(get.firstName+" "+ get.lastName+get.age+"acc number : "+get.account_number);
    }
}
