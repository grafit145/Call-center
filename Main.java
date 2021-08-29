package ru.netology;

public class Main {
    public static void main(String[] args) {
        Ats ats = new Ats();
        Operator operator1 = new Operator("Оператор 1", ats);
        Operator operator2 = new Operator("Оператор 2", ats);
        Operator operator3 = new Operator("Оператор 3", ats);

        ats.start();

        operator1.start();

        operator2.start();

        operator3.start();
    }
}