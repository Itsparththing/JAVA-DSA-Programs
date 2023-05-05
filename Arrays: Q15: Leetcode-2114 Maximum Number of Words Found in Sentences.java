
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum(){
        int max=0;
        String [] sentences = {"How/are/you", "i/am/fine/what/about/you"};
        for (int i = 0; i <sentences.length ; i++) {
            String [] s = sentences[i].split("/");
            int numword= s.length;
            if(numword>max){
                max =numword;
            }
        }
        return max;
    }
}
