package jia.begins.exercises.basics.maria.porlidalieva.lecture4;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
	    super.setName("Rectangle");
    }

    @Override
    public double surface() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2*a+2*b; 
    }

     @Override
    public String toString() {
        return super.getName() + " with face a = " + a + " and b = " + b + ". Surface = " + this.surface() + " and perimeter = " + this.perimeter();
    }
    
}
