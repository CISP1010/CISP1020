package Classwork1;

public class CubeNotStatic {
    private final double h;

    public CubeNotStatic(double h){
        this.h = h;
    }
    public double getSurface(){
        return 6 * h * h;
    }
    public double getVolume(){
        return h * h * h;
    }

}
