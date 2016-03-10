package com.brainacad.oop.testnest2_11_1;

import java.util.Comparator;

/**
 * Created by R2-D2 on 11.03.2016.
 */
public class TextCom implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        MyPhoneBook.PhoneNumber phoneNumber1 = (MyPhoneBook.PhoneNumber) o1;
        MyPhoneBook.PhoneNumber phoneNumber2 = (MyPhoneBook.PhoneNumber) o2;
        return phoneNumber1.getName().compareTo(phoneNumber2.getName());
    }
}
