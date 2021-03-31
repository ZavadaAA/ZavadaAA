package Lesson_4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        public void add (String lastName, String phoneNumber) {
            ArrayList<String> phoneNumberList = new ArrayList<>();
            if (phoneBook.containsKey(lastName)) {
                phoneNumberList = phoneBook.get(lastName);
                phoneNumberList.add(phoneNumber);
                System.out.println("Дополнительный телефон абонента " + lastName + " " + phoneNumber);
            } else {
                phoneNumberList.add(phoneNumber);
                phoneBook.put(lastName, phoneNumberList);
                System.out.println("Номер телефона " + lastName + ": " + phoneNumber);
            }
        }

        public String get(String lastName) {
            return "Абонент " + lastName + " номер телефона: " + phoneBook.get(lastName);
        }
    }