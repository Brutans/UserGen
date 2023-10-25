package org.example;

import org.example.utils.UserGenerator;

import java.util.ArrayList;
import java.util.List;


public class A {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<User> usersM = new ArrayList<>();
        List<User> usersW = new ArrayList<>();
        UserGenerator token = new UserGenerator();
        //Переменное окружение
        String envName = "SIMPLE_ENV";
        String envValue = "Hello, World!25";
        System.setProperty(envName, envValue);

        //Генератор строк из класса utils
        //Scanner number = new Scanner(System.in);
        //System.out.println("Введите число (Длина имени пользователя)");
        //int num = number.nextInt();
        //Scanner number = new Scanner(System.in);
        //System.out.println("Введите число пользователей");
        //int numUser = number.nextInt();
        //Scanner number = new Scanner(System.in);
        //System.out.println("Введите число пользователей");
        //int randNumber = number.nextInt();
        int num = 10;
        int numUser = 5;
        int randNumber = 9;
        for (int i = 0; i < numUser; i++) {
            //System.out.println(token.generateUser(num));
            users.add(token.generateUser(num));
        }
        //Вывод всех юзеров
        System.out.println(users.toString());
        //Разделение юзеров в список W M
        for (User user : users) {
            if (user.gender.equals("W")) {
                usersW.add(user);
            } else {
                usersM.add(user);
            }
        }
        System.out.println(usersM.toString());
        System.out.println(usersW.toString());

        // Получение значения переменной окружения
        String value = System.getProperty(envName);
        System.out.println(envName + ": " + value);
    }
}
