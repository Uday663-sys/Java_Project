package IOT_2;
	class parents {
		void property() {
			System.out.println("property");
		}
		void marry() {
			System.out.println("Family Decision(G/B)");
		}
	}
	public class PolyDemo extends parents {
		void marry() {
			System.out.println("Campus Selected(G/B");
		}
		public static void main(String[] args) {
			PolyDemo test=new PolyDemo();
			test.marry();
			test.property();
		}
	}

