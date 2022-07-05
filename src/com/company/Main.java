package com.company;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, EmtySourceFile {
        List<Person> t= Read.read();
for(Person p: t){
    System.out.println(p);
}


       //System.out.println(t);
    }}

