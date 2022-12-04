package org.example.dominio;

import java.time.LocalDate;

public class Mentoring extends Content{

    //construtor vazio
    public Mentoring() {

    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    //criando atributos
    public LocalDate getDate() {
        return date;
    }



    //para ver o print
    @Override
    public String toString() {
        return "Mentoring{" +
                "date=" + date +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }


    LocalDate date;

    @Override
    public double calculationDefault() {

        return DEFAULT + 20d;
    }
}
