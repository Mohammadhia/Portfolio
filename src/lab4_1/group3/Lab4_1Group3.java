/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_1.group3;

import java.util.Scanner;
/**
 *
 * @author 12602424
 */
public class Lab4_1Group3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Dice die1 = new Dice();
        Dice die2 = new Dice();
        Dice die3 = new Dice();
        Dice die4 = new Dice();
        
        boolean playersturn = false;
        boolean computersturn = false;
        boolean game = true;
        
        System.out.println("Enter your name:    ");
        String name = scan.nextLine();
            
        PigPlayer player = new PigPlayer(name);
        PigPlayer computer = new PigPlayer("Computer");
            
        System.out.println("Do you want to play (yes or no):    ");
        String answer = scan.nextLine();
            
        if(answer.compareTo("yes")==0)
        {
            playersturn = true;
        }
            
        else if(answer.compareTo("no")==0)
        {
            computersturn = true;
        }
        
        while(game)
        {
            while(playersturn)
            {
                int num1 = die1.roll();
                System.out.println(num1);
            
                int num2 = die2.roll();
                System.out.println(num2);
            
                player.keepScore(num1, num2);
                System.out.println("Your score is: " + player.getScore());
                System.out.println("Computer's score is: " + computer.getScore());
                
                if(num1==1 || num2==1)
                {
                    if(num1==1 && num2==1)
                    {
                        player.score();
                    }
                    else if (num1==1 || num2==1)
                    {
                        player.keepScore(-num1, -num2);
                    }
                
                    playersturn = false;
                    computersturn = true;
                    System.out.println("Player lost his/her turn.");
                }
            
                if(player.getScore()>=100)
                {
                    System.out.println("You win " + player.getName() + " !");
                    game = false;
                    playersturn = false;
                    computersturn = false;
                }
           
                if (playersturn){
                    System.out.println("Do you want to continue (yes or no):    ");
                    String answer2 = scan.nextLine();
            
                    if(answer2.compareTo("yes")==0)
                    {
                        playersturn = true;
                    }
            
                    else if(answer2.compareTo("no")==0)
                    {
                        playersturn = false;
                        computersturn = true;
                    }
                }
            while(computersturn)
            {
                int num3 = die3.roll();
                System.out.println(num3);
            
                int num4 = die4.roll();
                System.out.println(num4);
            
                computer.keepScore(num3, num4);
                System.out.println("Your score is: " + player.getScore());
                System.out.println("Computer's score is: " + computer.getScore());
                
                if((num3==1 || num4==1) || computer.getScore()>=20)
                {
                    if(num3==1 && num4==1)
                    {
                        computer.score();
                    }
                    else if (num3==1 || num4==1)
                    {
                        computer.keepScore(-num3, -num4);
                    }
                
                    computersturn = false;
                    playersturn = true;
                }
            
                if(computer.getScore()>=100)
                {
                    System.out.println("Computer Wins!");
                    game = false;
                    computersturn = false;
                    playersturn = false;
                }
            }
        } 
    }
            
    }
}

