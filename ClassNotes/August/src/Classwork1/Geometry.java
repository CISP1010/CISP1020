package Classwork1;
public class Geometry {
    public static double cubeVolume(double h){
        return h * h * h;
    }
    public static double cubeSurface(double h){
        return 6 * h * h;
    }
    public static double sphereVolume(double r){
        return 4 * Math.PI * r * r * r / 3;
    }
    public static double sphereSurface(double r){
        return 4 * Math.PI * r * r;
    }
    public static double cylinderVolume(double r, double h){
        return Math.PI * r * r * h;
    }
    public static double cylinderSurface(double r, double h){
        return 2 * Math.PI * r * r + 2 * Math.PI * r * h;
    }
    public static double coneVolume(double r, double h){
        return Math.PI * r * r * h / 3;
    }
    public static double coneSurface(double r, double h){
        return Math.PI * r * r + Math.PI * r * Math.sqrt(r * r + h * h);
    }
}