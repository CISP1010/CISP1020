package Classwork1;

public class CylinderNotStatic {
    private final double h;
    private final double r;

    public CylinderNotStatic(double h, double r){
        this.h = h;
        this.r = r;
    }
    public double getSurface(){
        return 2 * Math.PI * r * r + 2 * Math.PI * r * h;
    }
    public double getVolume(){
        return Math.PI * r * r * h;
    }
}