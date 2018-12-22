
public class palidrone {

	public static void main(String[] args) {
		int number = 121, newnumber = 0;
		while(number%10>0)
		{
			newnumber=newnumber*10+(number%10);
			number=number/10;
		}
		System.out.println(newnumber);

	}

}
