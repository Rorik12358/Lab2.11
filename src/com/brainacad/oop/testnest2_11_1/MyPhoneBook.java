package com.brainacad.oop.testnest2_11_1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by m18 on 09.03.2016.
 */
public class MyPhoneBook {
    int index = 0;
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumber(String name, String phone) {
        if (index < 10) {
            PhoneNumber phoneNumber = new PhoneNumber(name, phone);
            phoneNumbers[index] = phoneNumber;
            index++;
        } else {
            System.out.println("Место в записной книжке закончилось");
        }
    }

    public void printPhoneBook() {
        for (PhoneNumber phoneNumber : phoneNumbers) {
            if (phoneNumber != null) System.out.println(phoneNumber);
        }
    }

    //Lab 2.11.2:
    public void sortByName() {
        Comparator comparatorByName = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                PhoneNumber phoneNumber1 = (PhoneNumber) o1;
                PhoneNumber phoneNumber2 = (PhoneNumber) o2;
                return phoneNumber1.getName().compareTo(phoneNumber2.getName());
            }
        };
        Arrays.sort(phoneNumbers, comparatorByName);
    }

    public void sortByPhoneNumber() {
        Comparator comparatorByPhoneNumber = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                PhoneNumber phoneNumber1 = (PhoneNumber) o1;
                PhoneNumber phoneNumber2 = (PhoneNumber) o2;
                int number1 = Integer.parseInt(phoneNumber1.phone);
                int number2 = Integer.parseInt(phoneNumber2.phone);
                return number1 - number2;
            }
        };
        Arrays.sort(phoneNumbers, comparatorByPhoneNumber);
    }


    protected static class PhoneNumber {
        private String name;
        private String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", phone: " + phone;
        }
    }
}
