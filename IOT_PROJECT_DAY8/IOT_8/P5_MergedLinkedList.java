package IOT_8;
// Merged Linked List
 class Node {
	int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class P5_MergedLinkedList {
    Node head;    
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
  static Node merge(Node h1, Node h2) {
        if (h1 == null) return h2;
        Node temp = h1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = h2;
        return h1;
    }   
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        P5_MergedLinkedList list1 = new P5_MergedLinkedList();
        P5_MergedLinkedList list2 = new P5_MergedLinkedList();

        list1.insert(10);
        list1.insert(20);
        list1.insert(30);

        list2.insert(40);
        list2.insert(50);
        list2.insert(60);

        Node mergedHead = merge(list1.head, list2.head);

        System.out.println("Merged Linked List:");
        display(mergedHead);
    }
}