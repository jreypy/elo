package py.com.solofutbol.elo.test;

import org.junit.jupiter.api.Test;
import py.com.solofutbol.elo.EloHelper;

public class EloTest {

    @Test
    public void testElo() {
        EloHelper eloHelper = new EloHelper();
        print(eloHelper.calculateRating(50, new double[]{900,100}, 0));

    }

    void print(double[] array){
        System.out.println("==============");
        System.out.println("player1 -> " + array[0]);
        System.out.println("player2 -> " + array[1]);
    }
}
