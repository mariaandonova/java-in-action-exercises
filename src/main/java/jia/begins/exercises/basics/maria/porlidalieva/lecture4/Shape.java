package jia.begins.exercises.basics.maria.porlidalieva.lecture4;

public abstract class Shape {
	private String name;

	public String getName() { return this.name; }

	public void setName(String name) { this.name = name; }

    public abstract double surface();

    public abstract double perimeter();
}

