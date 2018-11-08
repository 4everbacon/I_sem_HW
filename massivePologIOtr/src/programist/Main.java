package programist;

public class Main {

    public static void main(String[] args) {
        int[]x = new int[20];
        int count = 0;
        int j = 0;
        int k = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)((Math.random() * 100) - 50);
        }
        for (int l:x) {
            if (l > 0)
                count++;
        }
        int[] pol = new int[count];
        int[] otr = new int[x.length - count];
        for (int aX : x) {
            if (aX > 0) {
                pol[j++] = aX;
            } else {
                otr[k++] = aX;
            }
        }
        for (int a : pol) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b : otr) {
            System.out.print(b + " ");
        }
    }
}
