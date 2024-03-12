
public class Masterpiece extends  Artifact {

	private String movement;
	private String condition;
	
	public Masterpiece(String movement, String condition, int index, String creator, int year){
		super(index, creator, year);
		this.movement = movement;
		this.condition = condition;
	}
	
	public void getInfo() {
		super.getIndex();
		super.getInfo();
		System.out.println("\n"+"My masterpiece's movement is:"+this.movement+"\n"+"My masterpiece's condition is:"+this.condition);
		
	}

	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
}
