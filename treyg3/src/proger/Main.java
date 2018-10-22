package proger;

public class Main {

    public static void main(String[] args) {
        int i, k;
        for (i = 0; i < 9; i++) {
            for (k = i; k < 9; k++) {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
