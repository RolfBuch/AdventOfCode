/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author plki7
 */

public class myFileReader 
{
    public static BufferedReader getReader(String fname) 
    {
        BufferedReader myReader = null;
        
        try 
        {
            myReader = new BufferedReader(new FileReader(fname));
        }
        catch (IOException e) 
        {
            Logger.getLogger(Day1.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return myReader;
    }    
    
    public static void closeReader(BufferedReader myReader)
    {
        try 
        {
            myReader.close();
        } 
        catch (IOException e) 
        {
            Logger.getLogger(myFileReader.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static String getNextLine(BufferedReader myReader)
    {
        String line = new String();
        
        try 
        {
            line = myReader.readLine();
        } 
        catch (IOException e) 
        {
            Logger.getLogger(Day1.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return line;
    }
}
