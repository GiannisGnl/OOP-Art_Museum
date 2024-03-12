// Initializing Libraries
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		//Initializing Libraries' Objects
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();		
		List<Artifact> objects = new ArrayList<Artifact>();
		
		//Initializing Variables-Arrays
		String[] movements = new String[]{"impressionism", "expressionism", "naturalism"};
		String[] conditions = new String[]{"bad", "good", "excellent"};
		String[] techniques = new String[]{"oil", "aquarelle", "tempera"};
		String[] materials = new String[]{"iron", "stone", "wood"};
		String m = "";
		String c = "";
		
		System.out.println("How many objects do you want to create?");
		int N = sc.nextInt();
		
		//Creating Random Objects
		for (int i=1; i<=N; i++) {
			int randomInt = rand.nextInt(1, 3);
			int randomYear = rand.nextInt(1500, 1900);
			int randomMovement = rand.nextInt(0, 3);
			int randomCondition = rand.nextInt(0, 3);
			int randomTechniques = rand.nextInt(0, 3);
			int randomMaterials = rand.nextInt(0, 3);
			
			switch(randomInt) {
				case 1:
					double length = (int)((Math.random() * 900) + 100) / 100.0;
					double width = (int)((Math.random() * 900) + 100) / 100.0;
					Artifact myPainting = new Painting(length, width, techniques[randomTechniques], movements[randomMovement], conditions[randomCondition], i, "Creator"+i, randomYear);
					objects.add(myPainting);
					break;
				
				case 2:
					double volume = (int)((Math.random() * 900) + 100) / 100.0;
					Artifact mySculpture = new Sculpture(volume, materials[randomMaterials], movements[randomMovement], conditions[randomCondition], i, "Creator"+i, randomYear);
					objects.add(mySculpture);
					break;
			}
		}
		
		//Converting List to Array
		Artifact myArtifacts[] = new Artifact[objects.size()];
		objects.toArray(myArtifacts);
		
		for(int i=0;i<objects.size();i++) {						
			myArtifacts[i] = objects.get(i);		
		}
		
		while(!(m.equals("impressionism")) && !(m.equals("expressionism")) && !(m.equals("naturalism"))) {
			System.out.println("What movement you want?");
			m = sc.nextLine();			
		}
		c = "nope";
		while(!c.equals("bad") && !c.equals("good") && !c.equals("excellent") && !c.isBlank()) {
			System.out.println("What condition you want?");
			c = sc.nextLine();
		}
		
		auction(myArtifacts, m, c);		
	}
	
	public static void auction(Artifact artifacts[], String m, String c) {
		
		for(int i=0; i<artifacts.length; i++) {
			artifacts[i].getIndex();
			artifacts[i].getInfo();
			
			//Checking Object's Class
			if (artifacts[i].getClass() == Painting.class) {
				
				//Downcasting Object to Proper Class
				if(((Painting)artifacts[i]).evaluate(m, c)) {
					System.out.println("Successful Evaluation for painting :)"+"\n");	
				} else {
					System.out.println("Unuccessful Evaluation :("+"\n");
				}
			
			//Checking Object's Class
			} else if (artifacts[i].getClass() == Sculpture.class){
				
				//Downcasting Object to Proper Class
				if(((Sculpture)artifacts[i]).evaluate(m, c)) {
					System.out.println("Susccessful Evaluation for sculpture :)"+"\n");	
				} else {
					System.out.println("Unuccessful Evaluation :("+"\n");
				}
			}
		}
	}
}
