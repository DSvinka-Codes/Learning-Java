package com.midness;

public class PersonModel {
        String Name;
        int Age;
        String Password;

        public PersonModel(String name, int age, String password) {
            Name = name;
            Age = age;
            Password = password;
        }

        public PersonModel(String name, int age) {
            Name = name;
            Age = age;
        }

        public String getUserInfo() {
            return "Ваше имя: " + Name + "\n" +
                    "Ваш возраст : " + Age + "\n" +
                    "Ваш пароль: " + Password;
        }

        public PersonModel CopyModel() {

            var CopyModel = new PersonModel(Name, Age, Password);
            return CopyModel;

        }
    }
