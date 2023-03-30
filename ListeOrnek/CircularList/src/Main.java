public class Main {
    public static void main(String[] args) {
        CircularList circularList=new CircularList();
        /*circularList.insert(circularList,5);
        circularList.insert(circularList,10);
        circularList.insert(circularList,15);
        circularList.insert(circularList,20);
        circularList.insert(circularList,25);
        circularList.print(circularList);*/
        circularList.orderlyInsert(circularList,5);
        circularList.orderlyInsert(circularList,10);
        circularList.orderlyInsert(circularList,15);
        circularList.orderlyInsert(circularList,20);
        circularList.orderlyInsert(circularList,25);
        circularList.print(circularList);
        circularList.delete(circularList,10);
        circularList.print(circularList);
    }
}