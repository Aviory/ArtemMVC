package com.company;

public class University {

    private Group[] groups = new Group[20];
    private int groupSize;

    public void addGroup(String name) {
        Group group = new Group();
        group.setGroupName(name);
        groups[groupSize] = group;
        groupSize++;
    }


    public void addGroup(Group group) {
        groups[groupSize] = group;
        groupSize++;
    }


    public void addGroupsForNameSubject(String subjectName, String groupName) {
        addGroup(groupName);
        getGroup(groupName).addSubject(subjectName);
    }


    public String searchSubjectAndPrintForFio(String fio) {
        String result = "";
        for (int i = 0; i < groupSize; i++) {
            for (int j = 0; j < groups[i].getSizeStudents(); j++) {
                if (fio.equals(groups[i].getStudents()[j].getFio())) {
                    String[] subjects = groups[i].getSubjects();
                    for (int k = 0; k < groups[i].getSizeSabjects(); k++) {
                        result+=subjects[k] + ",";

                    }
                   result+="\n";
                }
            }
        }
        return result;
    }


    public String searchGroupAndPrintForFio(String fio) {
        String result = "";
        for (int i = 0; i < groupSize; i++) {
            for (int j = 0; j < groups[i].getSizeStudents(); j++) {
                if (groups[i].getStudents()[j].getFio().equals(fio)) {
                    for (int k = 0; k < groups[i].getSizeStudents(); k++) {
                        result+=groups[i].getStudents()[k].getFio()+"\n";
                    }

                }

            }

        }
            return result;
    }


    public String searchGroupForSubjects(String subjectName) {
        for (int i = 0; i < groupSize; i++) {
            for (int j = 0; j < groups[i].getSizeSabjects(); j++) {
                if (groups[i].getSubjects()[j].equals(subjectName)) {
                    return groups[i].getGroupName();
                }
            }
        }
        return "нет груп по предмету";
    }


    public void deliteGroupsAndAllStudents(String groupName) {
        for (int i = 0; i < groupSize; i++) {
            if (groups[i].getGroupName().equals(groupName)) {
                groups[i] = null;
                for (int j = i; j < groupSize - 1; j++) {
                    groups[j] = groups[j + 1];

                }
                groups[groupSize-1] = null;
                groupSize--;
                break;
            }
        }
    }

    public Group getGroup(String groupName) {
        for (int i = 0; i < groupSize; i++) {
          if (groupName.equals(groups[i].getGroupName())){
              return groups[i];
          }
        }
        Group group = new Group();
        group.setGroupName(groupName);
        addGroup(group);

        return group;
    }

    public Student getStudent(String fio) {
        for (int i = 0; i < groupSize; i++) {
            for (int j = 0; j < groups[i].getSizeStudents(); j++) {
                if (groups[i].getStudents()[j].getFio().equals(fio)) {
                   return groups[i].getStudents()[j];
                }
            }
        }

        System.out.println("нет такого тут, ищи в другом месте, лузер");
        return new Student();
    }


    public String getAssasments(){
        String result = "";
        for (int i = 0; i < groupSize; i++) {
            result+= groups[i].getGroupName()+":\n";
            for (int j = 0; j < groups[i].getSizeStudents(); j++) {
                result+=groups[i].getStudents()[j].getAssessmentsForExam();
            }
        }
            return result;
    }
}
