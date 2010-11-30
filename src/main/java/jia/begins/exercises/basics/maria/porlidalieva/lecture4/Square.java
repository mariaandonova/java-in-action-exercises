package jia.begins.exercises.basics.maria.porlidalieva.lecture4;

public class Square extends Shape{
    private double a;
  
    public Square(double a){
        this.a = a;
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
        return super.getName() + " with face a = " + a +". Surface = " + this.surface() + " and perimeter = " + this.perimeter();
    }
}
