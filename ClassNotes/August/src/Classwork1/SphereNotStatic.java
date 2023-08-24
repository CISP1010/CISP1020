package Classwork1;

public class SphereNotStatic {
    private final double r;

    public SphereNotStatic(double r){
        this.r = r;
    }
    public double getSurface(){
        return 4 * Math.PI * r * r;
    }
    public double getVolume(){
        return 4 * Math.PI * r * r * r / 3;
    }
}
