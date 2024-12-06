import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int friends =5;
        int k =2;
        int winner = 0;
        for(int groupSize = 2; groupSize<=friends; groupSize++){
            winner = (winner+k)%groupSize;
        }
        System.out.println(winner+1);
    }

    }

