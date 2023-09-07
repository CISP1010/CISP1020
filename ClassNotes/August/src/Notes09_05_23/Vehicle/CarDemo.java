package Notes09_05_23.Vehicle;
public class CarDemo {
    public static void main(String[] args) {
        Car aCar = new Car();
        System.out.println(aCar.getDescription());
        Car aLimo = new Car();
        aLimo.setLicensePlateNumber("w00000");
        aLimo.setNumberOfTires(8);
        System.out.println(aLimo.getDescription());
        System.out.println(aLimo.getNumberOfTires());
        Vehicle v1 = new Vehicle();
        System.out.println(v1.getDescription());
    }
}