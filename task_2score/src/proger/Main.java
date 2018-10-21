package proger;

public class Main {

    public static void main(String[] args) {
        int kol = 0;
        double plo = 0, kash = 0, krem = 0;
        System.out.println("Количество      Пломбир     Каштан      Крем-Брюле");
        System.out.println("--------------------------------------------------");
        for (int i=1; i <=10; i++) {
            kol++;
            plo = plo + 0.8;
            kash = kash + 1.60;
            krem = krem + 1.00;
            System.out.println(kol+"            "+plo+"     "+kash+"   "+krem+"   ");
        }
    }
}
