package Tutorial9;

public class Numbers {

	public String maxValue(int[] abc) {
		
		if(abc == null || abc.length ==0) {
			
			return "Array is empty";
		}
		int max = abc[0];

		for (int i = 1; i < abc.length; i++) {
			if (abc[i] > max) {
				max = abc[i];
			}
		}

		return "Max value in array is :" + max;

	}

	public String minValue(int[] abc) {

		int min = abc[0];

		for (int i = 1; i < abc.length; i++) {
			if (min > abc[i]) {
				min = abc[i];
			}
		}
		return "Min value in array is :" + min;
	}

	public static void main(String[] args) {

		int[] xyz = { 23, 56, 12, 54, 67 };

		Numbers obj = new Numbers();
		String ans = obj.maxValue(xyz);
		String ans2 = obj.minValue(xyz);

		System.out.println(ans);
		System.out.println(ans2);

	}

}
