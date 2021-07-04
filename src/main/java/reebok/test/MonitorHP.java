package reebok.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MonitorHP implements Monitor{

   private final String typeMatrix;
   private final double diagonal;
   private final int frameRate;

   public MonitorHP(){
       this.typeMatrix = "TN";
       this.diagonal = 27;
       this.frameRate = 144;
       System.out.println("Создание монитора HP c параметрами: \n" +
               "Диагональ - " + diagonal + " дюймов; \n" +
               "Тип матрицы - " + typeMatrix + ";\n" +
               "Кадровая частота - " + frameRate + " Гц.");
   }

    @Override
    public String toString() {
        return "Диагональ - " + diagonal + " дюймов; " +
                "Тип матрицы - " + typeMatrix + "; " +
                "Кадровая частота - " + frameRate + " Гц.";
    }

    @Override
    public String getTypeMatrix() {
        return this.typeMatrix;
    }

    @Override
    public double getDiagonal() {
        return this.diagonal;
    }

    @Override
    public int getFrameRate() {
        return this.frameRate;
    }
}
