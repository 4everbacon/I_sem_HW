package programist;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Gosha","Ura","Demasek"};
        for (String x:names){
            System.out.print("Privet");
            for(char j:x.toCharArray()){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
