package IOT_10;
public class P6_HuffmanAlgorithm {
	class Demo {
		public static void main(String[] args) {
			String message = "AAAABBCCD";
			System.out.println("Mesage: " +message);
			int a = 0, b = 0, c = 0, d = 0;
			for (char ch : message.toCharArray()) {
				if (ch == 'A')
					a++;
				else if (ch == 'B')
					b++;
				else if (ch =='C')
					c++;
				else if (ch =='D')
					d++;
			}
			System.out.println("Frequency:");
			System.out.println(" A:" + a);
			System.out.println(" B:" + b);
			System.out.println(" C:" + c);
			System.out.println(" D:" + d);
		}
	}
}