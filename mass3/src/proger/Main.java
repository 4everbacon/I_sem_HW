package proger;

public class Main {

    public static void main(String[] args) {
        int[] Mas = new int[50];
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
                Mas[b]=i;
                System.out.print(Mas[b]+" ");
                b++;
            }
        }
        System.out.println();
        for(int i=50-1;i>=0;i--){
            System.out.print(Mas[i]+" ");
        }
    }
}
