package practice;

// given a singly linked list, write a function
// to find the nth to last element of the list

// eg.
// list = 1 -> 2 -> 3 -> 4 -> 5

// n = 1, output  = 4
// n = 2, output  = 3
// n = 3, output  = 2
// etc.

// 1 -> 2 -> 3 -> 4 -> 5 -> null
// ^
// curr
//                           ^
// follower

public class SinglyLinkedList {
  public static void main(String[] args) {
    Node list = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
    System.out.println(nthToLast(list, 2).value);
  }


  private static class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }


  public static Node nthToLast(Node node, int n) {
    Node curr = node;
    Node follower = node;

    for (int i = 0; i < n; i++) {
      if (curr == null) return null;
      curr = curr.next;
    }

    while (curr.next != null) {
      curr = curr.next;
      follower = follower.next;
    }

    return follower;
  }
}
