
public class Primenumber {

	public static void main(String[] args) {
		int number = 43;
		boolean flag = false;
		for (int i = 2; i < number; i++) {
			if(number%i==0)
			{
				flag= true;
			}

		}
		if(flag==false)
		{
			System.out.println("number is prime"+number);
		}
		else
		{
			System.out.println("number is not prime");
		}

	}
}
