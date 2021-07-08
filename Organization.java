public class Organization {
	public void armstrongNumber(int num) {
		if(num <= 0) {
			System.out.println(num + " is not an armstrong number");
			return;
		}
		int n = ("" + num).length();
		int sum = 0;
		int val = num;
		while(val != 0) {
			int temp = val%10;
			sum += (int)Math.pow(temp, n);
			val = val/10;
		}
		if(sum == num) {
			System.out.println(num + " is an armstrong number");
		}else {
			System.out.println(num + " is not an armstrong number");
		}
	}
	public static void main(String [] args) {
		Organization obj = new Organization ();
		obj.armstrongNumber(154);
		System.out.println("Program is completed.");
	}
}
