package org.example;

import org.example.utils.UserGenerator;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<User> usersM = new ArrayList<>();
        List<User> usersW = new ArrayList<>();
        UserGenerator token = new UserGenerator();

//        //Добавление тестовых пользователей
//        User user1 = new User("Denis", 19, "M");
//        User user2 = new User("Kate", 18, "W");
//        User user3 = new User("Alex", 17, "M");
//        User user4 = new User("Anton", 19, "M");
//        User user5 = new User("Banana", 21, "M");
//        User user6 = new User("Vlad", 20, "M");
//        User user7 = new User("Vika", 22, "W");
//        User user8 = new User("Alex", 17, "W");
//        User user9 = new User("Danya", 16, "M");
//        User user10 = new User("Jane", 19, "W");
//
//
//        //Добавление юзеров в лист
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//        users.add(user5);
//        users.add(user6);
//        users.add(user7);
//        users.add(user8);
//        users.add(user9);
//        users.add(user10);


//        //Вывод юзеров в общий список
//        for (User user : users) {
//            System.out.println("Имя: " + user.getName() + ", Возраст: " + user.getAge() + ", Пол: " + user.getGender());
//        }
//        //Вывод юзеров в список W
//        for (User user : users) {
//            if (user.gender.equals("W")) {
//                usersW.add(user);
//            } else {
//                usersM.add(user);
//            }
//        }
//        System.out.println(usersM.toString());
//        System.out.println(usersW.toString());

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
    }
}
