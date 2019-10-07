package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Monitor {

    Scanner in = new Scanner(System.in);

    public Monitor() {
        output("1 Добавление нового предмета.");
        output("2 Добавление новой группы");
        output("3 Добавление оценки конкретному студенту по конкретному экзамену");
        output("4 Добавление нового студента");
        output("5 Добавление группы к предмету по названию");
        output("6 Поиск и вывод предметов по ФИО студента.");
        output("7 Поиск и вывод группы по ФИО студента.");
        output("8 Поиск групп по названию предмета.");
        output("9 Добавление оценки конкретному студенту по конкретному экзамену");
        output("10 Вывод всех оценок студентов определенной группы");
        output("11 Удаление группы и всех студентов в ней.");
        output("12 Изменение оценки по предмету и ФИО конкретного студента.");
    }




    int methods() {
        System.out.println("---------------------");
        return getInt();
    }


    public void output(String result) {
        System.out.println(result);
    }


    public int getInt() {
        int num = 0;
        try {
            num = in.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("о неет");
        }
        return num;
    }

    public String getStr() {
        return in.next();
    }
}
