/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author letitiastewart
 */
public class TwoDimensions extends Shapes {

    private Area area;

    /**
     *
     * @param x
     */
    public TwoDimensions(double x) {
        super(x);
        this.area = new Area();
    }

    /**
     *
     * @param x
     * @param y
     */
    public TwoDimensions(double x, double y) {
        super(x, y);
        this.area = new Area();
    }

    /**
     *
     * @return
     */
    public double calCircleArea() {
        return area.CircleArea();
    }

    /**
     *
     * @return
     */
    public double calSquareArea() {
        return area.squareArea();
    }

    /**
     *
     * @return
     */
    public double calTriangleArea() {
        return area.triangleArea();
    }

    /**
     *
     * @return
     */
    public double calRectangleArea() {
        return area.retangleArea();
    }

    /**
     *
     */
    private class Area {

        /**
         *
         * @return
         */
        public double CircleArea() {
            return Math.PI * Math.pow(getX(), 2);
        }

        /**
         *
         * @return
         */
        public double squareArea() {
            return Math.pow(getX(), 2);
        }

        /**
         *
         * @return
         */
        public double triangleArea() {
            return getX() * getY() / 2;
        }

        /**
         *
         * @return
         */
        public double retangleArea() {
            return getX() * getY();
        }
    }
}
