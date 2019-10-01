public abstract class Shape{
<<<<<<< HEAD
	private String color = "red";
=======

	private String color = "Orange";
>>>>>>> 73cba2c99e36eaf85630dadd283a4d6144291b5e
	private int x,y;
	public Shape(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color = color;
	}
}

public class Circle extends Shape{
	private int x,y;
	public Circle(){;
	}
}
