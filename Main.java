
import java.util.*;

/**
 *
 * @author letitiastewart
 */
public class Main {

   /**
    *
    * @param args
    * @throws InputMismatchException
    */
   public static void main(String[] args) throws InputMismatchException {
   
      System.out.println("***************** Welcome to the Java OO Shapes Program *****************");
   
      Scanner std = new Scanner(System.in);
      char choice = 'Y';
      final int STOP = 10;
   
      while (choice == 'Y') {
         try {
            Menu();
            int input = std.nextInt();
            if (input >= 1 && input <= 10) {
               if (input < 10) {
                  menuSelection(input);
                  System.out.println("\nWould you like to continue? (Yes or No) \n");
                  String newInput = std.next();
                  choice = Character.toUpperCase(newInput.charAt(0));
               } else {
                  choice = 'N';
               }
            } else {
               System.out.println("\nSorry I do not understand. Enter a number from 1 to 10");
               choice = 'Y';
            }
         } catch (InputMismatchException im) {
            System.out.println("\nYou entered an invalid Character. Program is now terminating. ");
            choice = 'Y';
         }
      }
      menuSelection(STOP);
   }

   /**
    *
    */
   public static void Menu() {
   
      System.out.println("\nSelect from the menu below: \n");
      System.out.println("1.   Construct a Circle");
      System.out.println("2.   Construct a Rectangle");
      System.out.println("3.   Construct a Square");
      System.out.println("4.   Construct a Triangle");
      System.out.println("5.   Construct a Sphere");
      System.out.println("6.   Construct a Cube");
      System.out.println("7.   Construct a Cone");
      System.out.println("8.   Construct a Cylinder");
      System.out.println("9.   Construction a Torus");
      System.out.println("10.  Exit the program\n");
   }

   /**
    *
    * @param selection
    */
   public static void menuSelection(int selection) {
   
      Scanner scanner = new Scanner(System.in);
      Date date = new Date();
      double x, y;
   
      switch (selection) {
      
         case 1: {
            System.out.println("\nYou selected a circle. ");
            System.out.println("\nEnter the radius: \n");
            x = scanner.nextDouble();
            Shapes circle = new Circle(x);
            circle.displayResults();
            break;
         }
         case 2: {
            System.out.println("\nYou selected a retangle. ");
            System.out.println("\nEnter the length: \n");
            x = scanner.nextDouble();
            System.out.println("\nEnter the wideth: \n");
            y = scanner.nextDouble();
            Shapes rectangle = new Rectangle(x, y);
            rectangle.displayResults();
            break;
         }
         case 3: {
            System.out.println("\nYou selected a square. ");
            System.out.println("\nEnter one side of the Square: \n");
            x = scanner.nextDouble();
            Shapes square = new Square(x);
            square.displayResults();
         }
         case 4:{
            System.out.println("\nYou selected a (right) triangle. ");
            System.out.println("\nEnter the base: \n");
            x = scanner.nextDouble();
            System.out.println("\nEnter the height: \n");
            y = scanner.nextDouble();
            Shapes triangle = new Triangle(x, y);
            triangle.displayResults();
            break;
         }
         case 5: {
            System.out.println("You selected a sphere. \n");
            System.out.println("\nEnter the radius: \n");
            x = scanner.nextDouble();
            Shapes sphere = new Sphere(x);
            sphere.displayResults();               
            break;
         }
         case 7: {
            System.out.println("You selected a cone. ");
            System.out.println("\nEnter the radius: \n");
            x = scanner.nextDouble();
            System.out.println("\nEnter the height: \n");
            y = scanner.nextDouble();
            Shapes cone = new Cone(x, y);
            cone.displayResults();               
            break;
         }
         case 6:{
            System.out.println("You selected a cube. ");
            System.out.println("\nEnter the number of edges: \n");
            x = scanner.nextDouble();
            Shapes cube = new Cube(x);
            cube.displayResults();               
            break;
         }
         case 8: {
            System.out.println("You selected a cylinder. ");
            System.out.println("\nEnter the radius: \n");
            x = scanner.nextDouble();
            System.out.println("\nEnter the height: \n");
            y = scanner.nextDouble();
            Shapes cylinder = new Cylinder(x, y);
            cylinder.displayResults();               
            break;
         }
         case 9: {
            System.out.println("You selected a torus. ");
            System.out.println("\nEnter the minor radius: \n");
            x = scanner.nextDouble();
            System.out.println("\nEnter the major radius: \n");
            y = scanner.nextDouble();
            Shapes torus = new Torus(x, y);
            torus.displayResults();               
            break;
         }
         default:
            System.out.println("\nThanks for using the program. Today is " + date + "\n");
            break;
      }
   }
}
