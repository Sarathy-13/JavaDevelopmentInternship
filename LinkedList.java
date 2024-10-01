class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    // Function to delete the last occurrence of a key
    void deleteLastOccurrence(int key) {
        Node last = null, lastPrev = null;
        Node curr = head, prev = null;

        // Traverse the list to find the last occurrence of the key
        while (curr != null) {
            if (curr.data == key) {
                lastPrev = prev;
                last = curr;
            }
            prev = curr;
            curr = curr.next;
        }

        // If the key was found
        if (last != null) {
            // If last occurrence is not the head
            if (lastPrev != null) {
                lastPrev.next = last.next;
            } else {
                // If last occurrence is the head, move head to next node
                head = head.next;
            }
        }
    }

    // Function to print the linked list
    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(4);

        System.out.println("Original list:");
        list.printList();

        int key = 2;
        list.deleteLastOccurrence(key);

        System.out.println("List after deleting last occurrence of " + key + ":");
        list.printList();
    }
}
