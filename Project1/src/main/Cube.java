/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author letitiastewart
 */
public class Cube extends ThreeDimensions {

    /**
     *
     * @param x
     */
    Cube(double x) {
        super(x);
    }

    /**
     *
     */
    @Override
    public void displayResults() {
        System.out.println("\nThe area of a cube is " + calCubeVolume());
    }
}
