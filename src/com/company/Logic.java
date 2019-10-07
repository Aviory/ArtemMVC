package com.company;

public class Logic implements Model {
    University university = new University();

    @Override
    public void addSubject(String groupName, String subjectName) {
        university.getGroup(groupName).addSubject(subjectName);
    }

    @Override
    public void addGroup(String name) {
        university.addGroup(name);
    }

    @Override
    public void addStudent(String groupName, String name, String fName) {
        university.getGroup(groupName).addStudent(name, fName);
    }

    @Override
    public void addGroupsForNameSubject(String subjectName, String groupName) {
        university.addGroupsForNameSubject(subjectName, groupName);
    }

    @Override
    public String getSubjectForFio(String fio) {
       return university.searchSubjectAndPrintForFio(fio);
    }

    @Override
    public String getGroupForFio(String fio) {
      return university.searchGroupAndPrintForFio(fio);
    }

    @Override
    public String searchGroupForSubjects(String subjectName) {
       return university.searchGroupForSubjects(subjectName);
    }

    @Override
    public void addAssesmentsForExam(String fio, String subject, int assessment) {
        university.getStudent(fio).addAssessmentForExam(subject, assessment);
    }

    @Override
    public String getAssessments() {
        return university.getAssasments();
    }

    @Override
    public void deliteGroupsAndAllStudents(String groupName) {
        university.deliteGroupsAndAllStudents(groupName);
    }

    @Override
    public void changeAssessmentForSubject(String fio, String subject, int assessment) {
        university.getStudent(fio).changeAssessmentForSubject(subject, assessment);
    }

    @Override
    public void changeFio(String fio, String newFio) {
        university.getStudent(fio).changeFio(newFio);
    }
}
