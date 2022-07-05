package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public static List<Person> read() throws FileNotFoundException, EmtySourceFile {
        checkFile();
        List<Vacancy> getAllVacancy = new ArrayList<>();
        List<Person> getAllPerson = new ArrayList<>();
        List<Person> newListSort = new ArrayList<>();
        List<Person> newSort1 = new ArrayList<>();
        Integer countLines = 1;
        String lines;
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){
            checkFile();
            String line = reader.readLine();
            int countNumber = Integer.parseInt(line);
            for(int i =0; i<countNumber; i++){
               line = reader.readLine();
               Vacancy vacancy = ReadUnit.getVacancyFromFile(line);
               getAllVacancy.add(vacancy);
            }
           line = reader.readLine();
            int countNumber2 = Integer.parseInt(line);
            for(int i = 0; i<countNumber2; i++){
                line = reader.readLine();
                Person person = ReadUnit.getAllPersonFromFile(line);
                getAllPerson.add(person);
            }
             newListSort = ReadUnit.getAllPersonOnlySort(getAllPerson);
            newSort1 = ReadUnit.getAllPersonSort(newListSort, getAllVacancy);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EmtySourceFile emtySourceFile) {
            emtySourceFile.printStackTrace();
        }
        return newSort1;
    }


    private static void checkFile() throws EmtySourceFile {
        File sourceFile = new File("file.txt");
        if (sourceFile.length() == 0) {
            throw new EmtySourceFile("Файл Пуст");
        }
    }
}




