package jia.begins.exercises.basics.maria.porlidalieva.lecture4;

public class MainShape {


   public static void main(String[] args) {
	   Shape[] shapes = new Shape[10];

	   int number;
	   for(int i=0;i<shapes.length;i++){
		    number =  (int)Math.round(Math.random()*2);
		    
			switch (number){
			case 0:shapes[i] = new Rectangle(Math.random(), Math.random());break;
		   	case 1:shapes[i] = new Circle(Math.random());break;
			case 2:shapes[i] = new Square(Math.random(), Math.random());break;
			default:System.out.println("No such case");
			}
	   }


	   for (Shape sh : shapes){
			 System.out.println(sh.toString());    
	   }

    }
}
