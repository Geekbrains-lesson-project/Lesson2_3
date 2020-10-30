package geekbrains.lesson2_3_homework;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Mikrotik","TP-link","TP-link","Ubiquiti","D-Link","LogicPower","D-Link",
                "Cisco","ZTE","D-Link","Dahua","Cisco","Eltex","Eltex","Cisco","Hanlong","Hikvision","Huawei","Huawei",
                "ZyXEL");
        Set<String> unique = new HashSet <> (words);

        System.out.println("Оригинальный Набор слов:");
        System.out.println(words.toString());
        System.out.println();
        System.out.println("Уникальные слова:");
        System.out.println(unique.toString());
        System.out.println();
        System.out.println("Как часто встречается каждое слово:");

        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));

        }

        System.out.println();
        System.out.println();
        System.out.println("Справочник:");

            PhoneBook phoneBook = new PhoneBook();

            phoneBook.add("Градусов", "+79638889999");
            phoneBook.add("Градусов", "+79173332211");
            phoneBook.add("Давыдов", "+792700022233");
            phoneBook.add("Микулин", "+792711122233");
            phoneBook.add("Иванов", "+792711332233");
            phoneBook.add("Петров", "+792711442233");

            phoneBook.info();
            System.out.println();
            System.out.println("Номер Градусова: " + phoneBook.get("Градусов"));
            System.out.println("Номер Петрова: " + phoneBook.get("Петров"));
        }

    }

