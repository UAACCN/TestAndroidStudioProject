public class Triangle extends Shape {
	private String name = "";
	Triangle(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
}

