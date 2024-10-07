/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author letitiastewart
 */
public class Square extends TwoDimensions {

    /**
     *
     * @param x
     */
    Square(double x) {
        super(x);
    }

    /**
     *
     */
    @Override
    public void displayResults() {
        System.out.println("\nThe area of a square is " + calSquareArea());
    }
}
