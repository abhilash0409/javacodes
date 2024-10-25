package Day1;

public class MaxScoreCardPoints {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalPoints = 0;

        for (int i = 0; i < k; i++) {
            totalPoints += cardPoints[i];
        }

        int maxScore = totalPoints;

        for (int i = 0; i < k; i++) {
            totalPoints = totalPoints - cardPoints[k - 1 - i] + cardPoints[n - 1 - i];
            maxScore = Math.max(maxScore, totalPoints);
        }

        return maxScore;
    }

    public static void main(String[] args) {
        MaxScoreCardPoints solution = new MaxScoreCardPoints();
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        System.out.println("Maximum score: " + solution.maxScore(cardPoints, k));

        int[] cardPoints1 = {2,2,2} ;
        k = 2;
        System.out.println("Maximum score: " + solution.maxScore(cardPoints1, k));

        int[] cardPoints2 = {9,7,7,9,7,7,9};
        k = 7;
        System.out.println("Maximum score: " + solution.maxScore(cardPoints2, k));
    }
}

