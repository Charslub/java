/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam1;

/**
 *
 * @author Administrator
 */
public class MagicSquare {
    private int m[][];
    private int n;

    public MagicSquare() {
    }

    public MagicSquare(int n) {        
        this.n = n;
        m=new int[n][n];
    }

    public void setN(int n) {
        this.n = n;
        m=new int[n][n];
    }
    public void CreatMagicSquare(){
        int i=0,j=(n-1)/2;
        m[i][j]=1;
        System.out.println("=============");
        for(int x=2;x<=n*n;x++){
            if(m[(i-1+n)%n][(j+1)%n]==0){
                i=(i-1+n)%n;
                j=(j+1)%n;
                m[i][j]=x;
            }
            else{
                i=(i+1)%n;
                m[i][j]=x;
            }
        }
    }
    public void Show(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==(n-1))
                    System.out.println(m[i][j]);
                else 
                    System.out.print(m[i][j]+" ");               
            }
        }
    }
    public static void main(String[] args) {
        MagicSquare m=new MagicSquare(3);
        m.CreatMagicSquare();
        m.Show();
        m.setN(5);
        m.CreatMagicSquare();
        m.Show();
    }
}
