public class CircularList {
    Node root;
    public CircularList insert(CircularList circularList,int data){
    Node yeniDugum=new Node(data);
    if (circularList.root==null){
        circularList.root=yeniDugum;circularList.root.next=circularList.root;}
     else {
         Node iter=circularList.root;
         while(iter.next!=circularList.root){
                    iter=iter.next;
         }
         iter.next=yeniDugum;
         yeniDugum.next=circularList.root;
    }
     return circularList;
    }
    public CircularList orderlyInsert(CircularList circularList,int data){
        Node yeniDugum=new Node(data);
        if (circularList.root==null){
                circularList.root=yeniDugum;
                circularList.root.next=circularList.root;
        }
        //ilk eleman roottan kucuk ise
        else if (circularList.root.data>yeniDugum.data){
            Node iter=circularList.root;
            while(iter.next!=circularList.root){
                iter=iter.next;
            }
            iter.next=yeniDugum;
            yeniDugum.next=circularList.root;
            circularList.root=yeniDugum;
        }
        else{
            Node iter=circularList.root;
            while(iter.next!=circularList.root&&iter.next.data<yeniDugum.data){
                iter=iter.next;
            }
            Node temp=iter.next;
            iter.next=yeniDugum;
            yeniDugum.next=temp;
        }
        return circularList;
    }
    void print(CircularList circularList){
        Node iter=circularList.root;
        System.out.println(iter.data+" ");
        iter=iter.next;
        while (iter!=circularList.root){
            System.out.println(iter.data+" ");
            iter=iter.next;
        }
    }
     public CircularList delete(CircularList circularList , int silinecekData){
        Node iter=circularList.root;
        //eğer silinecek dugum rootta ise
        if (circularList.root.data==silinecekData){
          while(iter.next!=circularList.root){
              iter=iter.next;
          }
            iter.next=circularList.root.next;
          circularList.root=circularList.root.next;
        }
        else{
            while(iter.next!=circularList.root&&iter.next.data!=silinecekData){
                iter=iter.next;
            }
            if (iter.next==circularList.root){
                System.out.println("Sayı bulunamadı");
            }
            else
                iter.next=iter.next.next;
        }
        return circularList;
    }
}
