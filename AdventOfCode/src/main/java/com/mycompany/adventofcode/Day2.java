/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adventofcode;

import java.io.BufferedReader;

/**
 *
 * @author plki7
 */
public class Day2 {
    int totalRed = 12;
    int totalGreen = 13;
    int totalBlue = 14;
    
    
    public static void DoDay() 
    {
        String fname = "C:\\Users\\plki7\\Documents\\AdventDay2Input.txt";
        BufferedReader myReader;
        myReader = myFileReader.getReader(fname);
        double sum = 0;       
        
        String line;         
        line = myFileReader.getNextLine(myReader);
        while(line != null)
        {
            int[] result = parseLine2(line);
            int power = result[0]*result[1]*result[2];
            sum += power;
            
            
            line = myFileReader.getNextLine(myReader);            
        }
        
        System.out.println(sum);
    }
    
    public static int[] parseLine2(String line)
    {
        String[] arrPulls = line.split(":",0);
        arrPulls = arrPulls[1].split(";",0);
        int minRed = 0;
        int minGreen = 0;
        int minBlue = 0;
        
        int[] result = new int[3];
        
                
        for (String pull : arrPulls) 
        {
            String[] balls = pull.split(",",0);
            for (String ball : balls) 
            {
                String[] temp = ball.split(" ",0);
                int numBalls = Integer.parseInt(temp[1]);                
                {
                    String ballColor = temp[2];
                    if("green".equals(ballColor) && numBalls > minGreen)
                    {
                        minGreen = numBalls; 
                    }            
                    else if("red".equals(ballColor) && numBalls > minRed)                        
                    {
                        minRed = numBalls;  
                    }
                    else if("blue".equals(ballColor) && numBalls > minBlue)                        
                    {
                        minBlue = numBalls;  
                    }
                    
                }           
            }            
        }        
        result[0] = minRed;
        result[1] = minGreen;
        result[2] = minBlue;
        
        return result;
    }
    
    
    public static Boolean parseLine(String line)
    {
        String[] arrPulls = line.split(":",0);
        arrPulls = arrPulls[1].split(";",0);
        int minRed = 0;
        int minGreen = 0;
        int minBlue = 0;
        
                
        for (String pull : arrPulls) 
        {
            String[] balls = pull.split(",",0);
            for (String ball : balls) 
            {
                String[] temp = ball.split(" ",0);
                int numBalls = Integer.parseInt(temp[1]);
                if(numBalls > 14) 
                {
                    System.out.println("False --> more than 14 balls. NumBalls == " + numBalls);
                    return false;
                }
                else
                {
                    String ballColor = temp[2];
                    if("green".equals(ballColor) && numBalls > 13)
                    {
                        System.out.println("False --> more than 13 green balls. NumBalls == " + numBalls);
                        return false;
                    }            
                    if("red".equals(ballColor) && numBalls > 12)                        
                    {
                        System.out.println("False --> more than 12 Red balls. NumBalls == " + numBalls);
                        return false;     
                    }
                    
                }           
            }            
        }        
        return true;
    }
     
}
