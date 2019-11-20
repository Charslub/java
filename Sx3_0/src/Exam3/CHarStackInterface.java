package Exam3;

public interface CHarStarkInterface {
    final int StackSize=100;
    static int q=100;
    //入栈
    default void Input(int x){
        int Stack[] = new int[StackSize];
        if (q>0)
            Stack[q-1]=x;
        else
            System.out.println("Full!!!");
    }
    //出栈
    default void Out(int a[],int m,int n){
        int out[]=new int[StackSize];
        for(int i=n,j=0;i>m;i--,j++){
            out[j]=a[i];
        }
    }
    //栈空判断
    default void Judge(int a[]){
        if ()System.out.println("Empty!!");
        else System.out.println("Not empty!!");
    }
}
