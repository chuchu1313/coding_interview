import java.util.Stack;

public class I06_PrintListInReversedOrder {

  public static void main(String[] args) {
    Node node1 = new Node(null, 1);
    Node node2 = new Node(null, 2);
    Node node3 = new Node(null, 3);
    Node node4 = new Node(null, 4);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    new I06_PrintListInReversedOrder().printListReversely(node1);
    new I06_PrintListInReversedOrder().printListRecursively(node1);
  }

  private void printListReversely(Node head) {
    Stack<Integer> stack = new Stack<Integer>();
    Node currentNode = head;
    while (currentNode != null) {
      stack.push(currentNode.value);
      currentNode = currentNode.next;
    }
    while (!stack.empty()) {
      System.out.println(stack.pop());
    }
  }

  private void printListRecursively(Node head) {
    if (head != null) {
      printListRecursively(head.next);
      System.out.println(head.value);
    }
  }
}

class Node {
  Node next;
  int value;

  Node(Node next, int value) {
    this.next = next;
    this.value = value;
  }
}
