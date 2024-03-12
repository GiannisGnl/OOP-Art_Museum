public class Painting extends Masterpiece {
	private double length;
	private double width;
	private String technique;
	
	public Painting(double length, double width, String technique, String movement, String condition, int index, String creator, int year){
		super(movement, condition, index, creator, year);
		this.length = length;
		this.width = width;
		this.technique = technique;
		System.out.println("Creating and instant of Paintings");
	}
	
	public void getInfo() {	
		super.getInfo();
		double surface = this.length * this.width;
		System.out.println("\n"+"My painting's surface is:"+ surface);
		System.out.println("\n"+"My painting's technique is:"+technique);
	}
	
	String m = super.getMovement();
	String c = super.getCondition();
	
	public boolean evaluate(String m,String c) {
		
		//Checking whether Condition Input is blank
		if (c == null || c.isEmpty() || c.isBlank()) {
			c = "good";
		}
		
		if ((c.equals(this.c) || (this.c.equals("excellent") && c.equals("good"))) && m.equals(this.m )) {						
			return true;
		} else {
			return false;
		}
	}
}
