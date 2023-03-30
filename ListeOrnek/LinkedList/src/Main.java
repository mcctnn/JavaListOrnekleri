public class Main {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.insert(linkedList,1);
        linkedList.insert(linkedList,2);
        linkedList.insert(linkedList,3);
        linkedList.insert(linkedList,4);
        linkedList.insert(linkedList,5);
        linkedList.print(linkedList);
        linkedList.delete(linkedList,1);
        linkedList.print(linkedList);
        linkedList.orderlyInsert(linkedList,6);
        linkedList.print(linkedList);
    }
}