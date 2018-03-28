public class AddBinary {

	public static void main(String[] args) {
		AddBinary ab = new AddBinary();
		// TODO Auto-generated method stub
		System.out.println(ab.add("000", "1111"));
		System.out.println(ab.add("1100", "1101"));
		System.out.println(ab.add("11", "1"));
		System.out.println(ab.add("0101", "111"));
	}

	public String add(String a, String b) {
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		StringBuilder result = new StringBuilder();

		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0)
				sum = sum + a.charAt(i) - '0';
			if (j >= 0)
				sum = sum + b.charAt(j) - '0';
			result.append(sum % 2);
			carry = sum / 2;
			i--;
			j--;
		}
		if (carry != 0)
			result.append(carry);

		return result.reverse().toString();
	}
}
