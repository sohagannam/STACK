class Stack{
      int myarray[],top,size;

      Stack(int size){

            this.size=size;
            myarray=new int[size];
            this.top=-1;
      }

      void push(int data){
            if(top==size-1){
                  System.out.println("Stack Overflow");
                  return;
            }
            top=top+1;
            myarray[top]=data;
            System.out.println(myarray[top]);
      }
      void pop(){
           if(top==-1){
                 System.out.println("Stack Underflow");
                 return;
           }
           int temp=myarray[top];
           top=top-1;
           System.out.println(temp);
      }
      void pick(){
            if(top!=-1){
                 System.out.println(myarray[top]);
            }
      }
}



class test{
      public static void main(String[] args) {

            Stack s=new Stack(3);
            s.push(12);
            s.push(2);
            s.push(5);
            System.out.println("------------");
            s.pop();
            System.out.println("------------");
            s.pick();

      }
}