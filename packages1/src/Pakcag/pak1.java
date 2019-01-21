package Pakcag;

public class pak1 {
    public int S,S1,a1,A1,N;
    public int d=3,n=5,D=-2;
    public void pl() {
        a1 = 2;
        S = ((2*a1+(n-1)*d)/2)*n;
        System.out.println("Первая прогрессия: "+S);
    }
    public void PL(){ 
        A1=3;
        S1 = ((2*A1+(n-1)*d)/2)*n;
        System.out.println("Вторая прогрессия: "+S1);
    }
    public void ybivai(){
        N=A1+D*(n-1);
        System.out.println("N-ый член убывающей прогрессии: "+N);
    }


}
