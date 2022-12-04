package org.example;

import org.example.dominio.Course;
import org.example.dominio.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //instanciar o objeto
        Course curso1 = new Course();
        curso1.setDescription("descrição do curso aromaterapia ");
        curso1.setName("Curso de aromaterapia ");
        curso1.setWorkload(10);
        System.out.println(curso1);

        Course curso2 = new Course();
        curso1.setDescription("descrição do massagem chinesa ");
        curso1.setName("Curso de massagem chinesa ");
        curso1.setWorkload(10);
        System.out.println(curso2);

        //instanciando o objeto mentoria

        Mentoring mentoria = new Mentoring();
        mentoria.setDate(LocalDate.now());
        mentoria.setDescription("Mentoria de aromaterapia");
        mentoria.setName("Mentoria de aromaterapia");
        System.out.println(mentoria);


    }
}