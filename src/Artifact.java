
public class Artifact {
	private int index;
	private int year;
	private String creator;
	
	
	public Artifact(int index, String creator, int year) {		
		this.index = index;
		this.year = year;
		this.setCreator(creator);
	}
	
	public void getIndex() {
		System.out.println("My artifact's index is:"+this.index+"\n");			
	}
	
	public void getInfo() {
		System.out.println("My artifact's creator is:"+this.creator+"\n");
		System.out.println("My artifact's year of creation is:"+this.year+"\n");
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getCreator() {
		return creator;
	}


	public void setCreator(String creator) {
		this.creator = creator;
	}
}