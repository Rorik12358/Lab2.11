package com.brainacad.oop.testnest2_11_1;

/**
 * Created by m18 on 09.03.2016.
 */
public class MyPhoneBook {
    int index = 0;
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumber(String name, String phone) {
        PhoneNumber phoneNumber = new PhoneNumber(name, phone);
        phoneNumbers[index] = phoneNumber;
        index++;
    }

    public void printPhoneBook() {
        for (PhoneNumber phoneNumber : phoneNumbers) {
            if (phoneNumber != null) System.out.println(phoneNumber);
        }
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
