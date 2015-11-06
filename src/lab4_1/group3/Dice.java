/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_1.group3;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author 12602424
 */
public class Dice {    
    private static Random generator = new Random();
    private int numFaces;
    private int faceValue;
    
    public Dice ()
    {    
        numFaces = 6;
        faceValue = 1;   
    }
    
    public int roll()
    {
        faceValue = generator.nextInt(numFaces) + 1;
        return faceValue;
    }
    
    public int getFaceValue()
    {
        return faceValue;
    }

    void keepScore(int num1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
