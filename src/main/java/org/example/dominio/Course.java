package org.example.dominio;

public class Course extends Content {

   //criando atributos


   private int workload;
//construtor vazio
   public Course() {

   }

   @Override
   public String toString() {
      return "Course{" +
              "workload=" + workload +
              ", name='" + getName() + '\'' +
              ", description='" + getDescription() + '\'' +
              '}';
   }


   public int getWorkload() {
      return workload;
   }

   public void setWorkload(int workload) {
      this.workload = workload;
   }


   @Override
   public double calculationDefault() {
      return DEFAULT + workload;
   }

   @Override
   public double score() {
      return 0;
   }
}
