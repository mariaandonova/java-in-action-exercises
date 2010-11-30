package jia.begins.exercises.basics.maria.porlidalieva.lecture4;

public class Circle extends Shape {
    private final double pi = Math.PI;
    private double radius;

	public Circle(double radius){
        this.radius = radius;
        super.setName("Circle");
	}

    @Override
    public double surface() {
        return pi*radius*radius;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;  //To change body of implemented methods use File | Settings | File Templates.
    }

     @Override
    public String toString() {
        return super.getName() + " with radius = " + radius + ". Surface = " + this.surface() + " and perimeter = " + this.perimeter();
    }
}
