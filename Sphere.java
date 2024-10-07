/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author letitiastewart
 */
public class Sphere extends ThreeDimensions {

    /**
     *
     * @param x
     */
    Sphere(double x) {
        super(x);
    }

    /**
     *
     */
    @Override
    public void displayResults() {
        System.out.println("\nThe area of a sphere is " + calSphereVolume());
    }
}
