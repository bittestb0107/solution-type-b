package problem04;

public class Main {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		int retry = 0;
		
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
		long start = System.currentTimeMillis();
			
		System.out.println(")");
		System.out.println(bridge);
		
		int num = 0;
		
		while(num <= bridge.length()) {
		
		int rand = (int)(Math.random() * 4) + 1;
		num = num + rand;
		
		System.out.println("1. " + rand);
		System.out.println(bridge);
		
		for(int i = 0; i < num; i++) {
			System.out.print(" ");
		}
		System.out.println("^");
		
		if(bridge.charAt(num) == '#') {
			System.out.println("! ~");
			num = 0;
			retry++;
			continue;
		}
		
		if(num > bridge.length()) {
			break;
		}
		
		
		}
		long end = System.currentTimeMillis();
		
		String time = (( end - start )/1000.0 +"초");
		
	}

}
