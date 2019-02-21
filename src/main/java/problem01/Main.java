package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {

		int a = 0, b = 0;
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] * arr[j] > max) {
					a = arr[i];
					b = arr[j];
					max = arr[i] * arr[j];
				}
			}
		}

		System.out.println("[" + a + "," + b + "]");
	}
}
