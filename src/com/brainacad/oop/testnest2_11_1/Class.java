package com.brainacad.oop.testnest2_11_1;

import java.util.Arrays;

/**
 * Created by R2-D2 on 11.03.2016.
 */
public class Class {
    public static void main(String[] args) {
        MyPhoneBook.PhoneNumber[] phoneNumbers = {new MyPhoneBook.PhoneNumber("A", ""), new MyPhoneBook.PhoneNumber("J", ""), new MyPhoneBook.PhoneNumber("C", "")};
        Arrays.sort(phoneNumbers, new TextCom());
        System.out.println(Arrays.toString(phoneNumbers));
    }
}

