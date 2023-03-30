public class LinkedList {
    Node root;
    public LinkedList insert(LinkedList linkedList, int data){
        Node yeniDugum=new Node(data);
        if (linkedList.root==null)
            linkedList.root=yeniDugum;
        else{
            Node iter=linkedList.root;
            while(iter.next!=null){
                iter=iter.next;
            }
            iter.next=yeniDugum;

        }
            return linkedList;
    }
    public LinkedList orderlyInsert(LinkedList linkedList, int data){
        Node yeniDugum=new Node(data);
        //liste bos ise
        if(linkedList.root==null){linkedList.root=yeniDugum;return linkedList;}
        //root degistirmek icin
        if (linkedList.root.data>yeniDugum.data){
            yeniDugum.next=linkedList.root;
            linkedList.root=yeniDugum;
        }
       else{
           Node iter=linkedList.root;
           while(iter.next!=null&&iter.next.data<yeniDugum.data){
            iter=iter.next;
           }
           Node temp=iter.next;
           iter.next=yeniDugum;
           yeniDugum.next=temp;
        }
        return linkedList;
    }
    public void print(LinkedList linkedList){
        Node iter=linkedList.root;
        while(iter!=null){
            System.out.println(iter.data+" ");
            iter=iter.next;
        }
    }
    public LinkedList delete(LinkedList linkedList,int silinecekData){
        Node iter=linkedList.root;
        //silinecek data rootta ise
        if(linkedList.root!=null&&silinecekData==linkedList.root.data){
            linkedList.root=linkedList.root.next;
            return linkedList;
        }
        //root dugumunde değil veya listede yok ise
        while (iter.next!=null&&iter.next.data!=silinecekData){
            iter=iter.next;
        }
        if (iter.next==null)
            System.out.println("Sayı bulunamadı");
        else
            iter.next=iter.next.next;

        return linkedList;
    }
}
