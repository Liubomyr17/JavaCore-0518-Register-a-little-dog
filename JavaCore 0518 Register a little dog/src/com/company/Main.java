package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0518  Регистрируем собачек
Создать класс Dog (собака) с тремя конструкторами:
— Имя
— Имя, рост
— Имя, рост, цвет

Требования:
1. У класса Dog должна быть переменная name с типом String.
2. У класса Dog должна быть переменная height с типом int.
3. У класса Dog должна быть переменная color с типом String.
4. У класса должен быть конструктор, принимающий в качестве параметра имя
и инициализирующий соответствующую переменную класса.
5. У класса должен быть конструктор, принимающий в качестве параметров имя,
рост и инициализирующий соответствующие переменные класса.
6. У класса должен быть конструктор, принимающий в качестве параметров имя,
рост, цвет и инициализирующий соответствующие переменные класса.

*/

// public class Dog
public class Main {
    String name;
    int height;
    String color = "red";

    public Main(String name) {
          this.name = name;
    }

    public Main(String name, int height) {
          this.name = name;
          this.height = height;
    }

    public Main(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {
    }
}




