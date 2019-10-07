package com.company;

import java.util.HashMap;

public class Student {


    private String fio;
    private String[] assessmentsName = new String[20];
    private int [] assessmentsNumbers = new int [20];
    private int assessmentsSize;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }


    public String getAssessmentsForExam (){
        String result = "";
        result+="fio = "+fio+"\n";
        for (int i = 0; i < assessmentsSize; i++) {
            result+="subject : "+assessmentsName[i]+"="+assessmentsNumbers[i]+"\n";
//            System.out.println("subject : "+assessmentsName[i]+"="+assessmentsNumbers[i]);
        }
        return result;
    }


    public void addAssessmentForExam (String subject,int assessment){
        assessmentsName[assessmentsSize] = subject;
        assessmentsNumbers[assessmentsSize] = assessment;
        assessmentsSize++;

    }


    public void changeAssessmentForSubject (String subject,int assessment){
        for (int i = 0; i < assessmentsSize; i++) {
            if (assessmentsName[i].equals(subject)){
                assessmentsNumbers[i] = assessment;
            }
        }
    }


    public void changeFio (String fio){
       this.fio = fio;
    }
}

