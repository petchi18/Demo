class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MiddleOfLinkedList {
    public static Node findMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // Middle node
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        System.out.println("Middle Node: " + findMiddle(head).data);  // Output: 3
    }

    class DetectCycle {
        public static boolean hasCycle(Node head) {
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return true;  // Cycle detected
            }
            return false;
        }
    }
    
}
