package IOT;

public class fibonaci {
	public static void main(String[] args) {
		int n=5;
		int a=0,b=1;
		for(int i=1; i<=n; i++) {
			System.out.println(a+"");
			int c=a+b;
			a=b;
			b=c;
		}
	}
}
