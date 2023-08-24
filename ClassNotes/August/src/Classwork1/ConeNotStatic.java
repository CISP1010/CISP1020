package Classwork1;

public class ConeNotStatic {
    private final double h;
    private final double r;

    public ConeNotStatic(double h, double r){
        this.h = h;
        this.r = r;
    }
    public double getSurface(){
        return Math.PI * r * r + Math.PI * r * Math.sqrt(r * r + h * h);
    }
    public double getVolume(){
        return Math.PI * r * r * h / 3;
    }

}
