public class Main {
    public static void main(String[] args) {
      DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
      doublyLinkedList.insert(doublyLinkedList,5);
      doublyLinkedList.insert(doublyLinkedList,15);
      doublyLinkedList.insert(doublyLinkedList,25);
      doublyLinkedList.insert(doublyLinkedList,35);
      doublyLinkedList.insert(doublyLinkedList,45);
      doublyLinkedList.print(doublyLinkedList);
      doublyLinkedList.orderlyInsert(doublyLinkedList,30);
      doublyLinkedList.print(doublyLinkedList);
      doublyLinkedList.reversePrint(doublyLinkedList);
    }
}