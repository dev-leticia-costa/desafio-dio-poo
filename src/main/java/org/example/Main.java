package org.example;

import org.example.dominio.Course;
import org.example.dominio.HolisticDegree;
import org.example.dominio.Mentoring;
import org.example.dominio.Student;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //instanciar o objeto
        Course curso1 = new Course();
        curso1.setDescription("descrição do curso shiatsu ");
        curso1.setName("Curso de shiatsu ");
        curso1.setWorkload(10);
        System.out.println(curso1);

        Course curso2 = new Course();
        curso1.setDescription("descrição do massagem chinesa ");
        curso1.setName("Curso de massagem chinesa - Tuiná ");
        curso1.setWorkload(10);
        System.out.println(curso2);

        //instanciando o objeto mentoria

        Mentoring mentoria = new Mentoring();
        mentoria.setDate(LocalDate.now());
        mentoria.setDescription("Mentoria de aromaterapia");
        mentoria.setName("Mentoria de aromaterapia");
        System.out.println(mentoria);

        HolisticDegree holisticDegree = new HolisticDegree();
        holisticDegree.setDescription(" curso que estuda a medicina Chinesa...");
        holisticDegree.setName("medicina Chinesa");
        holisticDegree.getContents().add(curso1);
        holisticDegree.getContents().add(curso2);
        holisticDegree.getContents().add(mentoria);
        holisticDegree.getDataFinal();
        System.out.println(holisticDegree);


        Student leticia = new Student();
        leticia.setName("Camila");
        leticia.subscription(holisticDegree);
        System.out.println("Conteúdos Inscritos Leticia" + leticia.getConteudosInscritos());
        System.out.println("XP:" + leticia.score());












    }
}