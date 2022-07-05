package com.company;

import java.util.Comparator;

public class Person  {
    private String namePerson;
    private  String vacancyName;
    private int tasks;
    private int percent;

    public Person(String namePerson, String vacancyName, int tasks, int percent) {
        this.namePerson = namePerson;
        this.vacancyName = vacancyName;
        this.tasks = tasks;
        this.percent = percent;
    }

    public Person() {
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getVacancyName() {
        return vacancyName;
    }

    public void setVacancyName(String vacancyName) {
        this.vacancyName = vacancyName;
    }

    public int getTasks() {
        return tasks;
    }

    public void setTasks(int tasks) {
        this.tasks = tasks;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return namePerson;
    }


//    @Override
//    public int compare(Person person, Person t1) {
//        if(person.getTasks()>t1.getTasks())
//            return -1;
//        else if(person.getTasks()<t1.getTasks())
//            return 1;
//        if(person.getTasks()==t1.getTasks()){
//              if( person.getPercent()>t1.getPercent()){
//          return -1;}
//               }
//              if( person.getPercent()<t1.getPercent()){
//            return 1;
//        }
//        else
//            return 0;
//}

}
