package IOT_6;
// STRINGBUILDER PROGRAM
 public class P5_StringBuilder {
    public static void main(String[] args) {
    	StringBuilder sb = new StringBuilder("Java");

        sb.append(" Program");
        System.out.println("Append : " + sb);
        System.out.println();

        sb.insert(5, "Easy ");
        System.out.println("Insert : " + sb);
        System.out.println();

        sb.replace(0, 4, "Core");
        System.out.println("Replace: " + sb);
        System.out.println();

        sb.delete(5, 10);
        System.out.println("Delete : " + sb);
        System.out.println();

        sb.reverse();
        System.out.println("Reverse: " + sb);
        System.out.println();

    }
}