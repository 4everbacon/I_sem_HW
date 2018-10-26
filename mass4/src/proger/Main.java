package proger;

public class Main {

    public static void main(String[] args) {
        int[] mas=new int[20];
        for(int i=0;i<20;i++){
            if(i<2){
                mas[i]=1;
            }
            else {
                mas[i]=mas[i-2]+mas[i-1];
            }
            System.out.print(mas[i]+" ");
        }
    }
}
