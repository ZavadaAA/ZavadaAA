package Lesson_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    //HW_4 Part 1 - Unique words massive
    public static void main(String[] args) {
        String[] words = {"door", "belt", "honey", "bee", "waste", "angry", "car", "happy", "work", "name", "happy", "doors", "beach", "map", "bee", "glue", "backpack", "work", "joy", "bee"};
        HashMap<String, Integer> uniqueWord = new HashMap<>();
        for (int i = 0; i < words.length; i++) {

            if (uniqueWord.containsKey(words[i])) {
                uniqueWord.put(words[i], uniqueWord.get (words[i]) + 1);
            } else {
                uniqueWord.put(words[i], 1);
            }
        }
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Ниже приведены данные, сколько раз встречаются слова в нашем массиве: ");
        System.out.println(uniqueWord);

        //HW4_Part 2 - PhoneBook


            PhoneBook contact = new PhoneBook();
            contact.add("Иванов", "8-900-900-9090");
            contact.add("Михалков", "8-911-911-9191");
            contact.add("Рыбкин", "8-921-921-9292");
            contact.add("Рублев", "8-905-905-95-95");
            contact.add("Иванова", "8-960-960-9696");
            contact.add("Рублев", "8-922-922-9292");
            contact.add("Иванова", "8-956-956-9499");

            System.out.println(contact.get("Иванов"));
            System.out.println(contact.get("Михалков"));
            System.out.println(contact.get("Рыбкин"));
            System.out.println(contact.get("Иванова"));
            System.out.println(contact.get("Рублев"));
            System.out.println(contact.get("Песков"));
        }
    }