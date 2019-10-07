package com.company;

public interface Model {
    void addSubject(String groupName,String SubjectName);//1 Добавление нового предмета.
    void addGroup(String name);//2 Добавление новой группы
    void addStudent(String groupName,String name, String fName);//4 Добавление нового студента
    void addGroupsForNameSubject(String subjectName, String groupName);//5 Добавление группы к предмету по названию
    String getSubjectForFio(String fio);//6 Поиск и вывод предметов по ФИО студента.
    String getGroupForFio(String fio);//7 Поиск и вывод группы по ФИО студента.
    String searchGroupForSubjects(String subjectName);//8 Поиск групп по названию предмета.
    void addAssesmentsForExam(String fio, String subject, int assessment);//9 Добавление оценки конкретному студенту по конкретному экзамену
    String getAssessments();//10 Вывод всех оценок студентов определенной группы
    void deliteGroupsAndAllStudents(String groupName);//11 Удаление группы и всех студентов в ней.
    void changeAssessmentForSubject (String fio,String subject,int assessment);//12,2 Добавление оценки конкретному студенту по конкретному экзамену
    void changeFio (String fio,String newFio);//12 Изменение оценки по предмету и ФИО конкретного студента.
}
