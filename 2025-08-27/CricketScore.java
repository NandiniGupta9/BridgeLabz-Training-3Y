import java.util.*;
public class CricketScore {    
    public static void analyzeScores(int[] runs) {
        int highestScore = runs[0];
        int lowestScore = runs[0];
        int sum = 0;

       
        for (int i = 0; i < runs.length; i++) {
            int score = runs[i];

            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }
            if (score >= 100) {
                System.out.println("Century Scorer: Batsman " + (i+1)+" scored " +score);
            }

            sum += score;
        }

        float average = (float) sum / runs.length;

       
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Average Score: " + average);
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int[] runs = new int[n];
        for(int i=0;i<n;i++){
            runs[i]=sc.nextInt();
        }

        analyzeScores(runs);
    }
}

