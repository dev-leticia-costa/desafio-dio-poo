package org.example.dominio;
//classe que engloba mentoria e curso
public abstract class Content {
    //classe abstrada, utilizada somente para que as classes filhas herdem seus atributos e metodos

    //criação de uma constante padrão
    //static: pode ser acessado fora da classe

    protected static final double DEFAULT = 10d;

    private String name;

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

    private String description;

    public abstract double calculationDefault();
}
