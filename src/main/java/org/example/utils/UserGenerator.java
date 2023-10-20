package org.example.utils;

import org.example.User;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UserGenerator {
    public User generateUser(int num) {
        Random r = new Random();
        StringBuilder a = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder phone = new StringBuilder();
        StringBuilder email = new StringBuilder();
        //Генерируем имя пользователя
        for (int i = 0; i < num; i++) {
            char c = (char) (r.nextInt(26) + 'a');
            a.append(c);
        }
        //Генерируем возраст пользователя
        int age = r.nextInt(30);
        //Генерируем пол пользователя
        String gender = r.nextInt(2) == 1 ? "M" : "W";
        //Генератор числа
        for (int i = 0; i < 12; i++) {
            if (i == 0) {
                number.append(r.nextInt(9) + 1);
            } else {
                number.append(r.nextInt(10));
            }
        }
        //Генератор номера телефона шаблон +7(ххх)ххх-хх-хх
        phone.append("+7(").append(r.nextInt(899) + 100).append(")").append(r.nextInt(899)
                + 100).append("-").append(r.nextInt(89) + 10).append("-").append(r.nextInt(89) + 10);
        //Генератор почты
        List<String> Domen = Arrays.asList("@mail.ru", "@gmail.com", "@rambler.ru",
                "@yandex.ru","@bk.ru","catlovers.com","hotbox.ru","inbox.ru","yahoo.com");
        for (int i = 0; i < 8; i++) {
            char e = (char) (r.nextInt(26) + 'a');
            email.append(e);
        }
        String emailDomen = Domen.get(r.nextInt(Domen.size()));
        email.append(emailDomen);
        return new User(a.toString(), age, gender, number.toString(), phone.toString(), email.toString());
    }
}

