package Assignment1;

import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;


    public GeometricObject() {
        this.dateCreated = new java.util.Date();
    }
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new java.util.Date();
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return new Date(dateCreated.getTime());
    }
    @Override
    public String toString() {
        return "Geometric Object: " + "created on = " + dateCreated + " color = " + color + " filled = " + filled;
    }
}
