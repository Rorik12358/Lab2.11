package com.brainacad.oop.testnest2_11_1;

/**
 * Created by m18 on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addPhoneNumber("Rob", "0988252952");
        phoneBook.addPhoneNumber("Bob", "0988312952");
        phoneBook.addPhoneNumber("Joi", "0669772911");
        phoneBook.addPhoneNumber("Julliya", "0562222952");
        phoneBook.addPhoneNumber("Soffy", "0378252952");
        phoneBook.printPhoneBook();
    }
}
