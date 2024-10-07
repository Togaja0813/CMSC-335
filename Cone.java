/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author letitiastewart
 */
public class Cone extends ThreeDimensions {

    /**
     *
     * @param x
     * @param y
     */
    Cone(double x, double y) {
        super(x, y);
    }

    /**
     *
     */
    @Override
    public void displayResults() {
        System.out.println("\nThe area of a torus is " + calConeVolume());
    }
}
