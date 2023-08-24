package Classwork1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the height of the object: ");
        Scanner in = new Scanner(System.in);
        double h = in.nextDouble();
        System.out.print("Enter the radius of the object: ");
        double r = in.nextDouble();
        System.out.println("Would you like to calculate using static methods or non-static methods?");
        System.out.println("Enter 1 for static methods and 2 for non-static methods.");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println();
                System.out.println();
                System.out.println("The volume of the cube is: " + Geometry.cubeVolume(h));
                System.out.println();
                System.out.println("The surface area of the cube is: " + Geometry.cubeSurface(h));
                System.out.println();
                System.out.println("The volume of the sphere is: " + Geometry.sphereVolume(r));
                System.out.println();
                System.out.println("The surface area of the sphere is: " + Geometry.sphereSurface(r));
                System.out.println();
                System.out.println("The volume of the cylinder is: " + Geometry.cylinderVolume(r, h));
                System.out.println();
                System.out.println("The surface area of the cylinder is: " + Geometry.cylinderSurface(r, h));
                System.out.println();
                System.out.println("The volume of the cone is: " + Geometry.coneVolume(r, h));
                System.out.println();
                System.out.println("The surface area of the cone is: " + Geometry.coneSurface(r, h));
            }
            case 2 -> {
                CubeNotStatic cube = new CubeNotStatic(h);
                SphereNotStatic sphere = new SphereNotStatic(r);
                CylinderNotStatic cylinder = new CylinderNotStatic(h, r);
                ConeNotStatic cone = new ConeNotStatic(h, r);
                System.out.printf("The volume of the cube is:" + cube.getVolume());
                System.out.println();
                System.out.println("The surface area of the cube is: " + cube.getSurface());
                System.out.println();
                System.out.println("The volume of the sphere is: " + sphere.getVolume());
                System.out.println();
                System.out.println("The surface area of the sphere is: " + sphere.getSurface());
                System.out.println();
                System.out.println("The volume of the cylinder is: " + cylinder.getVolume());
                System.out.println();
                System.out.println("The surface area of the cylinder is: " + cylinder.getSurface());
                System.out.println();
                System.out.println("The volume of the cone is: " + cone.getVolume());
                System.out.println();
                System.out.println("The surface area of the cone is: " + cone.getSurface());
            }
            default -> System.out.println("Invalid choice.");
        }
    }
}
