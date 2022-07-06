package com.company;

import java.text.Collator;
import java.util.*;

public class ReadUnit {
public static Vacancy getVacancyFromFile(String line){
    List<Vacancy>newVacancy = new ArrayList<>();
    String[] nameArrayVacancy = line.split(",");
    String nameVacancy= nameArrayVacancy[0];
    int numberOnVacancy = Integer.parseInt(nameArrayVacancy[1]);
    return new Vacancy(nameVacancy,numberOnVacancy);
}
public static Person getAllPersonFromFile(String line1){
    List<Person>newPerson = new ArrayList<>();
    String[]nameArrayPerson = line1.split(",");
    String namePerson = nameArrayPerson[0];
    String vacancyName = nameArrayPerson[1];
    int tasks= Integer.parseInt(nameArrayPerson[2]);
    int percent = Integer.parseInt(nameArrayPerson[3]);
    return new Person(namePerson,vacancyName,tasks,percent);
}

public static void getAllPersonSort(List<Person>listPerson, List<Vacancy>listVacancy) {
    List<Person> listPersonNew = listPerson;
    List<Vacancy> listVacancyNew = listVacancy;
    String nameVacancy = null;
    int limit = 0;
    int count = 0;
    for (Vacancy v : listVacancyNew) {
        nameVacancy = v.getNameVacancy();
        limit = v.getNumberOnVacancy();
        List<Person> newList = new ArrayList<>();
        for (Person p : listPersonNew) {
            if (nameVacancy.equals(p.getVacancyName())) {
                newList.add(p);
                }
            }
        for (int i =0; i<limit; i++) {
        System.out.println(newList.get(i).getNamePerson());
    }}

}

public static List getAllPersonOnlySort(List<Person>sortPerson){
    List<Person>treeSetPerson =sortPerson;
    Collections.sort(treeSetPerson, new Comparator<Person>() {
        @Override
        public int compare(Person person, Person t1) {
            int result = t1.getTasks()-person.getTasks();
            if(result==0){
                int result2 = person.getPercent()-t1.getPercent();
            }
            return result;
        }
    });
    return treeSetPerson;
}}







