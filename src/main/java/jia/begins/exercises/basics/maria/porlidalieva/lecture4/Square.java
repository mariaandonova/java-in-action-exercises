package jia.begins.exercises.basics.maria.porlidalieva.lecture4;

public class Square extends Shape{
    private double a;
    private double b;

    public Square(double a, double b){
        this.a = a;
        this.b = b;
	    super.setName("Square");
    }
    
    @Override
    public double surface() {
       return a*a;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double perimeter() {
        return 4*a;  //To change body of implemented methods use File | Settings | File Templates.
    }

     @Override
    public String toString() {
        return super.getName() + " with face a = " + a + " and b = " + b + ". Surface = " + this.surface() + " and perimeter = " + this.perimeter();
    }
}
