package problem04;

public class Main {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		String bridge = "";
		
		for(int i = 0; i < 20; i++) {
			int rand = (int)(Math.random() * 2);
			
			if(rand == 0 && a > 0) {
				bridge = bridge + "#";
				a--;
			}
			else if(rand == 1 && b > 0) {
				bridge = bridge + "o";
				b--;
			}
			
			
		}
		System.out.println(")");
		System.out.println(bridge);
		
		int num = 0;
		
		while(num <= bridge.length()) {
		
		int rand = (int)(Math.random() * 4) + 1;
		num = num + rand;
		
		if(bridge.charAt(num) == '#') {
			System.out.println("! ~");
			break;
		}
		
		
		}
	}

}
