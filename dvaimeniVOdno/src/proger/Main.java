package proger;

public class Main {

    public static void main(String[] args) {
        String [] m1 = {"Жора","Саня"};
        String [] m2 = {"Петрович","Оля","Паша"};
        String [] m3 = new String[m1.length+m2.length];
        int i=0;
        for(String k:m1){
            m3[i] = k;
            i++;
        }
        for(String l:m2){
            m3[i] = l;
            i++;
        }
        for(String f:m3){
            System.out.println(f);
        }
    }
}

