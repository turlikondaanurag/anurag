
public class FibanociSeries {

	public static void main(String[] args) {
int range=10,a=0,b=1,c=0;
System.out.print(a+" "+b);
for(int i=2;i<=range;i++)
{
	c=a+b;
	System.out.print(" "+c);
	a=b;
	b=c;
	
	
}
	}

}
