package com.company;

public class Vacancy {
    private String nameVacancy;
    private  int numberOnVacancy;

    public Vacancy(String nameVacancy, int numberOnVacancy) {
        this.nameVacancy = nameVacancy;
        this.numberOnVacancy = numberOnVacancy;
    }

    public String getNameVacancy() {
        return nameVacancy;
    }

    public void setNameVacancy(String nameVacancy) {
        this.nameVacancy = nameVacancy;
    }

    public int getNumberOnVacancy() {
        return numberOnVacancy;
    }

    public void setNumberOnVacancy(int numberOnVacancy) {
        this.numberOnVacancy = numberOnVacancy;
    }

    @Override
    public String toString() {
        return
                "nameVacancy='" + nameVacancy + '\'' +
                ", numberOnVacancy=" + numberOnVacancy
               ;
    }
}
