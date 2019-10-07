package com.company;

public class Group {
    private String[] subjects = new String[20];
    private  Student[] students = new Student[20];
    private int studentsSize = 0;
    private int sizeSabjects = 0;
    private String groupName;

    public int getSizeSabjects() {
        return sizeSabjects;
    }

    public Student[] getStudents() {
        return students;
    }

    public String[] getSubjects(){
        return subjects;
    }

    public void setGroupName(String groupName){
        this.groupName =groupName;
    }


    public String getGroupName(){
        return groupName;
    }


    public void addStudent(String name, String fName){
        Student student = new Student();
        student.setFio(name+" "+fName);
        students[studentsSize]= student ;
        studentsSize++;
    }



    public void addSubject(String SubjectName){
        subjects[sizeSabjects]= SubjectName;
        sizeSabjects++;
    }


    public int getSizeStudents() {
        return studentsSize;
    }


    public void addAssessmentsForFio(String fio,String subject,int assessment){
        for (int i = 0; i < getSizeStudents(); i++) {
            if (students[i].getFio().equals(fio)){
                students[i].addAssessmentForExam(subject,assessment);
            }
        }
    }

}
