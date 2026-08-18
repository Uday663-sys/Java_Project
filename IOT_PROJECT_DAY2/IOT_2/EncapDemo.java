package IOT_2;
	class Parents {
		private int a;
		
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a=a;
		}
	}
	public class EncapDemo extends Parents {
		public static void main(String[] args) {
		EncapDemo test=new EncapDemo();
		test.setA(43);
		int aa=test.getA();
		System.out.println(aa);
	}
}


