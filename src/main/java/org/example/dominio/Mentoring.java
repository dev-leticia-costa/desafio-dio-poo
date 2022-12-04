package org.example.dominio;

import java.time.LocalDate;

public class Mentoring {

    //construtor vazio
    public Mentoring() {

    }

    //criando atributos
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    //para ver o print
    @Override
    public String toString() {
        return "Mentoring{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    LocalDate date;
    private String name;
    private String description;

}
