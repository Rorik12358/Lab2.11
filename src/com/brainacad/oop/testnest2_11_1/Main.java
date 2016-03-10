package com.brainacad.oop.testnest2_11_1;


/**
 * Created by m18 on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {
//        MyPhoneBook phoneBook = new MyPhoneBook();
//        phoneBook.addPhoneNumber("Rob", "0988252952");
//        phoneBook.addPhoneNumber("Bob", "0988312952");
//        phoneBook.addPhoneNumber("Joi", "0669772911");
//        phoneBook.addPhoneNumber("Julliya", "0562222952");
//        phoneBook.addPhoneNumber("Soffy", "0378252952");
//        phoneBook.printPhoneBook();
//        // Lab 2.11.2
//        System.out.println();

        MyPhoneBook phoneBook1 = new MyPhoneBook();
        phoneBook1.addPhoneNumber("Rob", "0988252952");
        phoneBook1.addPhoneNumber("Bob", "0988312952");
        phoneBook1.addPhoneNumber("Joi", "0669772911");
        phoneBook1.addPhoneNumber("Julliya", "0562222952");
        phoneBook1.addPhoneNumber("Soffy", "0378252952");
        phoneBook1.addPhoneNumber("Johan", "0377752952");
        phoneBook1.addPhoneNumber("Illaya", "0578212992");
        phoneBook1.addPhoneNumber("Simon", "0378132111");
        phoneBook1.addPhoneNumber("Angelina", "0558212252");

//        phoneBook1.sortByName();
        phoneBook1.sortByPhoneNumber();
        phoneBook1.printPhoneBook();
    }
}
