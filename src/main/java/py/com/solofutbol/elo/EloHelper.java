package py.com.solofutbol.elo;

public class EloHelper {

    private double calculate(double a, double b) {
        return 1 / (1 + (Math.pow(10, (b - a) / 400)));
    }

    /**
     *
     * @param k
     * Max points to play
     * @param input
     * 2 elements array with the current Rating
     * @param win
     * index of the winner
     * @return
     * Array with the new rating
     */
    public double[] calculateRating(double k, double[] input, int win) {
        double r1 = input[0];
        double r2 = input[1];

        double p1 = calculate(r1, r2);
        double p2 = calculate(r2, r1);

        if (win == 0){
            r1 = r1 + k * (1 - p1);
            r2 = r2 + k * (0 - p2);
        }else{
            r1 = r1 + k * (0 - p1);
            r2 = r2 + k * (1 - p2);
        }
        return new double[]{r1, r2};
    }


}
