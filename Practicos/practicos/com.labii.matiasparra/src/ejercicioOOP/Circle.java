package ejercicioOOP;

/**
 * Created by WIZERWOLF on 15/09/2016.
 */
public class Circle {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*this.getRadius();
    }
    public double getCircumference(){
        return Math.PI*(this.getRadius()*2);
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
