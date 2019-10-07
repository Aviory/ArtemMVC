package com.company;

import java.io.IOException;

public class Controller {

    public static void main(String[] args) throws IOException {
        Model logic = new Logic();
        Monitor monitor = new Monitor ();


        logic.addGroup("kt");
        logic.addGroup("kn");
        logic.addStudent("kn","Maks","Barski");
        logic.addStudent("kn","Dima","a");
        logic.addStudent("kt","Oleg","a");
        logic.addStudent("kt","Misha","a");
        logic.addAssesmentsForExam("Maks Barski","math",4);
        logic.addAssesmentsForExam("Dima a","math",5);
        logic.addAssesmentsForExam("Oleg a","fisics",3);
        logic.addAssesmentsForExam("Misha a","fisics",3);
        logic.addSubject("kt","Math");
        logic.addSubject("kt","Geografy");



        while (true) {
            switch (monitor.methods()) {
                case 0:
                    monitor.output("попробуешь еще или спать?\n 1) еще \n 2) сонки");
                    int num = monitor.getInt();
                    if (num == 1)
                        monitor.methods();
                    else
                        System.exit(0);
                case 1:
                    monitor.output("введите имя группы");
                    String nameGroup = monitor.getStr();
                    monitor.output("введите название предмета");
                    String nameSabject = monitor.getStr();
                    logic.addSubject(nameGroup, nameSabject);
                    break;
                case 2:
                    monitor.output("введите имя группы");
                    String groupName = monitor.getStr();
                    logic.addGroup(groupName);
                    break;
                case 3:// void changeFio (String fio,String newFio);12 Изменение оценки по предмету и ФИО конкретного студента.
                    monitor.output("введите имя студента");
                    String fioo = monitor.getStr();
                    monitor.output("введите фамилию студента");
                    String fiof = monitor.getStr();

                    monitor.output("введите новое имя студента");
                    String newFio = monitor.getStr();
                    monitor.output("введите новое фамилию студента");
                    String newFiof = monitor.getStr();
                    logic.changeFio(fioo + " " + fiof, newFio + " " + newFiof);
                    break;
                case 4:// void addStudent(String groupName,String name, String fName);//4 Добавление нового студента
                    monitor.output("введите имя группы");
                    String group = monitor.getStr();

                    monitor.output("введите имя студента");
                    String name = monitor.getStr();

                    monitor.output("введите фамилию студента");
                    String fname = monitor.getStr();

                    logic.addStudent(group, name, fname);
                    break;
                case 5://public void addGroupsForNameSubject(String subjectName, String groupName)5 Добавление группы к предмету по названию
                    monitor.output("введите имя предмета");
                    String subjectName = monitor.getStr();
                    monitor.output("введите имя группы");
                    String nameGroups = monitor.getStr();
                    logic.addGroupsForNameSubject(subjectName, nameGroups);
                    break;
                case 6://void getSubjectForFio(String fio);6 Поиск и вывод предметов по ФИО студента.
                    monitor.output("введите имя студента");
                    String fioS = monitor.getStr();
                    monitor.output("введите фамилию студента");
                    String fioF = monitor.getStr();

                    logic.getSubjectForFio(fioS + " " + fioF);
                    break;
                case 7://void getGroupForFio(String fio);7 Поиск и вывод группы по ФИО студента.
                    monitor.output("введите имя студента");
                    String fioG = monitor.getStr();
                    monitor.output("введите фамилия студента");
                    String fioR = monitor.getStr();
                    monitor.output(logic.getGroupForFio(fioG + " " + fioR));
                    break;
                case 8://void searchGroupForSubjects(String subjectName);8 Поиск групп по названию предмета.
                    monitor.output("введите имя предмета");
                    String subjecttName = monitor.getStr();
                    monitor.output(logic.searchGroupForSubjects(subjecttName));
                    break;
                case 9://void addAssesmentsForExam(String fio, String subject, int assessment);9 Добавление оценки конкретному студенту по конкретному экзамену
                    monitor.output("введите имя студента");
                    String fio = monitor.getStr();
                    monitor.output("введите фамилию студента");
                    fio = fio + " " + monitor.getStr();
                    monitor.output("введите предмет");
                    String subject = monitor.getStr();
                    monitor.output("введите оценку");
                    int assesement = monitor.getInt();
                    if (assesement != 0);
                    logic.addAssesmentsForExam(fio, subject, assesement);
                    break;
                case 10://void getAssessments();10 Вывод всех оценок студентов определенной группы
                    monitor.output(logic.getAssessments());
                    break;
                case 11://void deliteGroupsAndAllStudents(String groupName);11 Удаление группы и всех студентов в ней.
                    monitor.output("введите имя группы");
                    String namegGroup = monitor.getStr();
                    logic.deliteGroupsAndAllStudents(namegGroup);
                    break;
                case 12://void changeAssessmentForSubject (String fio,String subject,int assessment);13 Добавление оценки конкретному студенту по конкретному экзамену
                    monitor.output("введите имя студента");
                    String fion = monitor.getStr();
                    monitor.output("введите фамилию студента");
                    String fioT = monitor.getStr();
                    monitor.output("введите имя предмета");
                    String subjectt = monitor.getStr();
                    monitor.output("введите оценку");
                    int assesment = monitor.getInt();
                    logic.changeAssessmentForSubject(fion + " " + fioT, subjectt, assesment);
                    break;

                default:
                    monitor.output("неправильное число, неудачник, руки иди чини");

            }
        }

    }



}



