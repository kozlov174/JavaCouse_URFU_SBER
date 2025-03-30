package LabWork3_Kozlov;


public class Example11 {
    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Список с добавлением в голову:");
        Node headFirstList = createHeadFirstList();
        printList(headFirstList);

        System.out.println("\n\nСписок с добавлением в хвост:");
        Node headSecondList = createTailFirstList();
        printList(headSecondList);
    }

    public static Node createHeadFirstList() {
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
        return head;
    }

    public static Node createTailFirstList() {
        Node head = null;
        Node tail = null;

        for (int i = 0; i <= 9; i++) {
            Node newNode = new Node(i, null);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        return head;
    }

    public static void printList(Node head) {
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
