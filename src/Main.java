
public class Main {

	public static void main(String[] args) {
		int[] ourArray = new int[] { 1, 2, 3, 3, 2, 1 };
		for (int i1 = 0, i2 = ourArray.length - 1; i1 < ourArray.length / 2; i1++, i2--) {
			if (ourArray[i1] != ourArray[i2]) {
				System.out.println("No");
			}
			if (ourArray[i1] == ourArray[i2]) {
				System.out.println("Yes");
			}
		}
	}

}
