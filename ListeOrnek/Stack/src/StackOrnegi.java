public class StackOrnegi {
    int genislik;int top; int[] veriler;
    StackOrnegi(int genislikParametresi){
        this.genislik=genislikParametresi; this.top=-1; veriler=new int[genislik];
    }
    void push(int data){
        if (isFull())
            System.out.println("Stack full");
        else
        {
            this.top++;
            this.veriler[this.top]=data;
        }
    }
    void hardlyPush(int data){
        if (isFull()&&this.veriler[this.top]>data){
            System.out.println("Stack empty");
        }
        else{
            /*stack boş olmadıkça ve data stack'in
            top değerindeki elemanından büyük oldukça
            pop islemi yapılıcak */
            while(!isEmpty()&&this.veriler[this.top]<data){
                pop();
            }push(data);
        }
    }
    int pop(){
        if (isEmpty())
        {System.out.println("Stack empty");return -1;}
        else{
            this.top-=1;
            return this.veriler[this.top+1];
        }

    }
    void print(){
        if (isEmpty())
            System.out.println("Stack empty");
        else{
            for (int i=this.top;i>-1;i--)
                System.out.println(this.veriler[i]);
        }

    }
    boolean isFull()
    {
        if(this.top==(this.genislik-1))
            return true;
        else
            return false;
    }
    boolean isEmpty()
    {
        if (this.top==1)
            return true;
        else
            return false;
    }
}
