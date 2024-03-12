public class Sculpture extends Masterpiece {
	private double volume;
	private String material;
	
	protected Sculpture(double volume, String material, String movement, String condition, int index, String creator, int year) {
		super(movement, condition, index, creator, year);
		this.volume = volume;
		this.material = material;
		System.out.println("Creating and instant of Sculptures");
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("\n"+"My sculpture's volume is:"+volume);
		System.out.println("\n"+"My sclupture's material is:"+material);
	}
	
	String m = super.getMovement();
	String c = super.getCondition();
	
	public boolean evaluate(String m,String c) {
		
		//Checking whether Condition Input is blank
		if (c == null || c.isEmpty() || c.isBlank()) {
			c = "excellent";
		}
		
		if(c.equals(this.c) && m.equals(this.m)) {
			return true;
		} else {
			return false;
		}
	}
}
