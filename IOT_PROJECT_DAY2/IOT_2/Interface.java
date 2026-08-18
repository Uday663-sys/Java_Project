package IOT_2;
interface Atm
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm
{	
	public	void depo()
	{
		System.out.println("Depos");
	}
	}

public class Interface extends Abc{

	public	void with()
	{
		System.out.println("With");
	}

	
public static void main(String[] args) {
	Interface   v = new Interface();
	v.depo();
	v.with();
}
}


