/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author letitiastewart
 */
public class Rectangle extends TwoDimensions {

    /**
     *
     * @param x
     * @param y
     */
    Rectangle(double x, double y) {
        super(x, y);
    }

    /**
     *
     */
    @Override
    public void displayResults() {
        System.out.println("\nThe area of a rectangle is " + calRectangleArea());
    }
}
