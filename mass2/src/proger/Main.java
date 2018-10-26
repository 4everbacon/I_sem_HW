package proger;

public class Main {

    public static void main(String[] args) {
        double sum1=0,sum2=0;
        int[] mas1 = new int[5];
        for(int i=0;i<5;i++){
            mas1[i]=(int)(Math.random()*6);
            System.out.print(mas1[i] +" ");
            sum1+=(double)mas1[i]/5;
        }
        System.out.println(" ");
        int[] Mas2=new int[5];
        for(int i=0;i<5;i++){
            Mas2[i] =(int)(Math.random()*6);
            System.out.print(Mas2[i] +" ");
            sum2+=(double)Mas2[i]/5;
        }
        System.out.println(" ");
        if(sum1==sum2)System.out.println("Сред. арифм. равно");
        else {if(sum1>=sum2)
            System.out.println("Сред. арифм первого больше и равно ");
        else System.out.println("Сред. арифм.  больше и равно ");
        }
    }
}
