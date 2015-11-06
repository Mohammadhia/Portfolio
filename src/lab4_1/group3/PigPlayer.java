/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_1.group3;

import java.util.Random;
/**
 *
 * @author 12602424
 */
public class PigPlayer {
    private int score;
    private int totalscore;
    private String pigplayer;
    private static Random generator = new Random();
    private int numFaces;
    private int faceValue;
    
    public PigPlayer(String name)
    {
        pigplayer = name;
    }
    
    public String getName()
    {
        return pigplayer;
    }
    
    public int score()
    {
        totalscore = 0;
        return totalscore;
    }
    
    public int keepScore(int num, int num2)
    {
        totalscore += num + num2;
        return totalscore;
    }
    
    public int getScore()
    {
        return totalscore;
    }
    
    public int rollTheDice()
    {
        faceValue = generator.nextInt(numFaces) + 1;
        return faceValue;
    }
    
    public String toString()
    {
        return "Total score is: " + totalscore;
    }
}
