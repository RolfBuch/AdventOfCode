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
public class Day1 
{
    public static void DoDay() 
    {
        String fname = "C:\\Users\\plki7\\Documents\\AdventDay1Input.txt";
        BufferedReader myReader;
        myReader = myFileReader.getReader(fname);
        
        int total = 0;
        int calibNum;        
        
        String line;         
        line = myFileReader.getNextLine(myReader);
        
        while(line != null)
        {            
            line = line.replace("one","o1e");
            line = line.replace("two","t2o");
            line = line.replace("three","t3e");
            line = line.replace("four","f4r");
            line = line.replace("five","f5e");
            line = line.replace("six","s6x");
            line = line.replace("seven","s7n");
            line = line.replace("eight","e8t");
            line = line.replace("nine","n9e");
            line = line.replace("zero","z0o");
            
            calibNum = getCalibrationValue(line);
            total += calibNum;
                        
            line = myFileReader.getNextLine(myReader);
        }        
        
        myFileReader.closeReader(myReader);
        System.out.println("Total: " + total);
    }
    
    public static int getCalibrationValue(String line)
    {
        Character firstDigit = null;
        Character secondDigit = null;
        Character temp;
        
        for(int i = 0; i < line.length(); i++)
        {
            temp = line.charAt(i);
            if(Character.isDigit(temp))
            {
                firstDigit = temp;
                break;
            }
        }
        for(int j = line.length() - 1; j >= 0; j--)
        {
            temp = line.charAt(j);
            if(Character.isDigit(temp))
            {
                secondDigit = temp;
                break;
            }
        }
        
        String num = firstDigit.toString();
        num += secondDigit.toString();
        
        int sum = Integer.parseInt(num);
        
        return sum;
    }
}
