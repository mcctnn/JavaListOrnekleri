public class DoublyLinkedList {
    Node root;
    public DoublyLinkedList insert(DoublyLinkedList doublyLinkedList,int data){
        Node yeniDugum=new Node(data);
        if (doublyLinkedList.root==null)
            doublyLinkedList.root=yeniDugum;
        else{
            Node iter=doublyLinkedList.root;
            while(iter.next!=null)
                iter=iter.next;
            iter.next=yeniDugum;
            yeniDugum.previous=iter;
        }
        return doublyLinkedList;
    }
    void print(DoublyLinkedList doublyLinkedList){
        Node iter=doublyLinkedList.root;
        while(iter!=null){
            System.out.println(iter.data+" ");
            iter=iter.next;
        }
    }
    void reversePrint(DoublyLinkedList doublyLinkedList){
            Node iter=findlastNode(doublyLinkedList);
            while(iter!=null){
                System.out.println(iter.data+" ");
                iter=iter.previous;
            }
    }
    Node findlastNode(DoublyLinkedList doublyLinkedList){
        Node iter=doublyLinkedList.root;
        while(iter.next!=null)
            iter=iter.next;
        return iter;
    }
    DoublyLinkedList orderlyInsert(DoublyLinkedList doublyLinkedList,int data){
        Node yeniDugum=new Node(data);
        if (doublyLinkedList.root==null)
            doublyLinkedList.root=yeniDugum;
        else if(yeniDugum.data<doublyLinkedList.root.data) {
            //root degistirme
            yeniDugum.next = doublyLinkedList.root;
            yeniDugum.previous = null;
            doublyLinkedList.root.previous=yeniDugum;
            doublyLinkedList.root=yeniDugum;
        }
        else {
            Node iter=doublyLinkedList.root;
            while(iter.next!=null&&iter.next.data<yeniDugum.data){
            iter=iter.next;
            }
            Node temp=iter.next;
            iter.next=yeniDugum;
            yeniDugum.previous=iter;
            yeniDugum.next=temp;
            if (temp!=null)
                temp.previous=yeniDugum;
        }
        return doublyLinkedList;
    }
    DoublyLinkedList delete(DoublyLinkedList doublyLinkedList,int silinecekData){
        //silinecek data rootta ise
        if (doublyLinkedList.root!=null&&doublyLinkedList.root.data==silinecekData)
            doublyLinkedList.root=doublyLinkedList.root.next;
        //listede olupta rootta degilse veya hiç listede yoksa
        else{
            Node iter=doublyLinkedList.root;
            while(iter.next!=null&&iter.next.data!=silinecekData)
                iter=iter.next;
            if(iter.next==null)
                System.out.println("Silinecek data listede yok!");
            else {
                if (iter.next.next!=null)
                    iter.next.next.previous=iter;
            }
        }
        return doublyLinkedList;
    }
}
