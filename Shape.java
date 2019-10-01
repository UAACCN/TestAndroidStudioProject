public abstract class Shape{
	private String color;
	private int x,y;
	public Shape(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public String setColor(String color){
		this.color = color;
	}
}

public class Circle extends Shape{
	private int x,y;
	public Circle(){;
	}
}
