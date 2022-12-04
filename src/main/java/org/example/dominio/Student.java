package org.example.dominio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                '}';
    }

    //set: inscrição é única no mesmo curso
    private Set<Content> conteudosInscritos = new LinkedHashSet<>();
    private Set<Content> conteudosConcluidos = new LinkedHashSet<>();

    public void subscription(HolisticDegree holistic){
        this.conteudosInscritos.addAll(holistic.getContents()); //adicionar os conteudos
        holistic.getSubscriptionStudent().add(this); //adicionar o aluno no curso

    }
    public void status(){}

    public double score(){
        Iterator<Content> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().score();
            soma += next;
        }
        return soma;

    }


    //GENERATE: getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Content> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }


    public Set<Content> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Content> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //GENERATE: equals and hashcode: HashSet

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(conteudosInscritos, student.conteudosInscritos) && Objects.equals(conteudosConcluidos, student.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conteudosInscritos, conteudosConcluidos);
    }
}
