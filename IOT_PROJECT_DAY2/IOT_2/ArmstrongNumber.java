package IOT_2;
public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=153;
		int temp=n,sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==temp)
			System.out.println("ArmstrongNumber");
		else 
			System.out.println(" Not a ArmstrongNumber");
			
	}
}
	


