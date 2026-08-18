package IOT_2;
class Director
{
	void Humble()
	{
		System.out.println(" hsyjag");
	}
}
class professor extends Director
{
	void Kind()
	{
		System.out.println(" jbsyagga");
	}
	
}

public class MultiDemo extends professor{

	public static void main(String[] args) {
		MultiDemo  bb= new MultiDemo();
 		bb.Humble();
 		bb.Kind();
	}
}