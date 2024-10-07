/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author letitiastewart
 */
public class Circle extends TwoDimensions {

   /**
    *
    * @param x
    */
   public Circle(double x) {
      super(x);
   }

   /**
    *
    */
   @Override
   public void displayResults() {
      System.out.println("\nThe area of a circle is " + calCircleArea());
   }
}
