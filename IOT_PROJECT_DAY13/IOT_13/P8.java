package IOT_13;

public class P8 {

	public static void main(String[] args) {
		int[] productid= {101,102,101,103,101};
		int search=104;
		boolean exits=true;
		
		for(int i=0;i<productid.length;i++) {
			if(search==productid[i]) {
				exits=true;
				
				
			}else {
				exits=false;
			}
		}if(exits) {
			System.out.println("productis exits");
		}else {
			System.out.println("Productid doesnt exits");
		}		
	}
}
