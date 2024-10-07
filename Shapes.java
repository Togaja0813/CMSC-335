
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author letitiastewart
 */
public class Shapes {

    /**
     *
     */
    private NumberOfDimensions nod;

    /**
     *
     * @param x
     */
    Shapes(double x) {
        this.nod = new NumberOfDimensions(x);
    }

    /**
     *
     * @param x
     * @param y
     */
    Shapes(double x, double y) {
        this.nod = new NumberOfDimensions(x, y);
    }

    /**
     *
     * @return
     */
    public double getX() {
        return nod.x;
    }

    /**
     *
     * @return
     */
    public double getY() {
        return nod.y;
    }

    /**
     *
     */
    public void displayResults() {
        System.out.println("Shape class display result method. ");
    }

    /**
     *
     */
    private class NumberOfDimensions {

        /**
         *
         */
        private double x;
        private double y;

        /**
         *
         * @param x
         */
        NumberOfDimensions(double x) {
            this.x = x;
        }

        /**
         *
         * @param x
         * @param y
         */
        NumberOfDimensions(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
