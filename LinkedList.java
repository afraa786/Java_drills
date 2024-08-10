class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class linkedList {
    Node head;
    void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }
    void deleteWithValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
public class LinkedList {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.prepend(5);
        System.out.print("Linked List: ");
        list.printList();
        list.deleteWithValue(20);
        System.out.print("\nAfter deletion: ");
        list.printList();
    }
}
