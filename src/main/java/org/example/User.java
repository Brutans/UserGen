package org.example;

public class User {
    public String name;
    public int age;
    public String gender;
    public String number;
    public String phone;
    public String email;


    public User(String name, int age, String gender, String number, String phone, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.number = number;
        this.phone = phone;
        this.email = email;

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNumber() {
        return number;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", number=" + number +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}