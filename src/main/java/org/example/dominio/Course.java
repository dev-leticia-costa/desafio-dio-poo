package org.example.dominio;

public class Course {

   //criando atributos


   private int workload;
//construtor vazio
   public Course() {

   }

   @Override
   public String toString() {
      return "Course{" +
              "workload=" + workload +
              ", name='" + name + '\'' +
              ", description='" + description + '\'' +
              '}';
   }

   private String name;

   public int getWorkload() {
      return workload;
   }

   public void setWorkload(int workload) {
      this.workload = workload;
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

   private String description;

}
