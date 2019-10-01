public abstract class Shape{
	private String color = "red";


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
=======
public abstract class Shape{
	private String color = "red";
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
>>>>>>> d5ff860d4aa0c1736c6ab0741ac9ae2b73d404b1
