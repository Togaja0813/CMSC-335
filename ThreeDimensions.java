/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author letitiastewart
 */
public class ThreeDimensions extends Shapes {

    private final Volume volume;

    /**
     *
     * @param x
     */
    ThreeDimensions(double x) {
        super(x);
        this.volume = new Volume();
    }

    /**
     *
     * @param x
     * @param y
     */
    ThreeDimensions(double x, double y) {
        super(x, y);
        this.volume = new Volume();
    }

    /**
     *
     * @return
     */
    public double calConeVolume() {
        return volume.coneVolume();
    }

    /**
     *
     * @return
     */
    public double calCylinderVolume() {
        return volume.cylinderVolume();
    }

    /**
     *
     * @return
     */
    public double calSphereVolume() {
        return volume.sphereVolume();
    }

    /**
     *
     * @return
     */
    public double calTorusVolume() {
        return volume.torusVolume();
    }

    /**
     *
     * @return
     */
    public double calCubeVolume() {
        return volume.cubeVolume();
    }

    /**
     *
     */
    private class Volume {

        /**
         *
         * @return
         */
        private double coneVolume() {
            return (Math.PI * Math.pow(getX(), 2) * getY()) / 3;
        }

        /**
         *
         * @return
         */
        public double cubeVolume() {
            return Math.pow(getX(), 3);
        }

        /**
         *
         * @return
         */
        public double cylinderVolume() {
            return Math.PI * Math.pow(getX(), 2) * getY();
        }

        /**
         *
         * @return
         */
        public double torusVolume() {
            return (Math.PI * Math.pow(getX(), 2)) * (2 * Math.PI * getY());
        }

        /**
         *
         * @return
         */
        public double sphereVolume() {
            return ((4 * Math.PI * Math.pow(getX(), 3)) / 3);
        }
    }
}
