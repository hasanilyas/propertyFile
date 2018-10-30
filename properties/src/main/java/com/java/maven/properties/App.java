package com.java.maven.properties;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        	Properties prop = new Properties();
        	

            
        	try {
        	InputStream input = App.class.getClassLoader().getResourceAsStream("path.properties");
        	 prop.load(input);
        	 
        } catch (IOException ex) {
    		ex.printStackTrace();
    		} 
        	System.out.println(prop.getProperty("someProperty"));
        }
       
    
}
