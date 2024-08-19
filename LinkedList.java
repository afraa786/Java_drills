package prc;
import java.util.Scanner;

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedList {
    private Node root = null;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Single Linked List Operations:");
            System.out.println("1. Append");
            System.out.println("2. Add at Begin");
            System.out.println("3. Add at After");
            System.out.println("4. Length");
            System.out.println("5. Display");
            System.out.println("6. Delete");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    list.append();
                    break;
                case 2:
                    list.addAtBegin();
                    break;
                case 3:
                    list.addAtAfter();
                    break;
                case 4:
                    System.out.println("Length: " + list.length());
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    list.delete();
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    void append() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter node data: ");
        int data = scanner.nextInt();
        Node temp = new Node(data);

        if (root == null) {
            root = temp;
        } else {
            Node p = root;
            while (p.link != null) {
                p = p.link;
            }
            p.link = temp;
        }
    }

    int length() {
        int count = 0;
        Node temp = root;
        while (temp != null) {
            count++;
            temp = temp.link;
        }
        return count;
    }

    void display() {
        Node temp = root;
        if (temp == null) {
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.link;
            }
            System.out.println("NULL\n");
        }
    }

    void addAtBegin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter node data: ");
        int data = scanner.nextInt();
        Node temp = new Node(data);
        temp.link = root;
        root = temp;
    }

    void addAtAfter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the node data after which to add: ");
        int afterData = scanner.nextInt();
        System.out.print("Enter new node data: ");
        int newData = scanner.nextInt();

        Node temp = new Node(newData);
        Node p = root;

        while (p != null && p.data != afterData) {
            p = p.link;
        }

        if (p != null) {
            temp.link = p.link;
            p.link = temp;
        } else {
            System.out.println("Node with data " + afterData + " not found.");
        }
    }

    void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the node data to delete: ");
        int data = scanner.nextInt();

        if (root == null) {
            System.out.println("List is empty");
            return;
        }

        if (root.data == data) {
            root = root.link;
            return;
        }

        Node p = root;
        while (p.link != null && p.link.data != data) {
            p = p.link;
        }

        if (p.link != null) {
            p.link = p.link.link;
        } else {
            System.out.println("Node with data " + data + " not found.");
        }
    }
}

