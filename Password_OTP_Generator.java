/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Random;
import java.util.Scanner;

public class Password_OTP_Generator 
{
    public static String password(int l)
    {
        Random r=new Random();
        String cap_let="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sma_let="abcdefghijklmnopqrstuvwxyz";
        String dig="0123456789";
        String sym="+-*/%!@#$^&()=[]<>()";
        String all=(cap_let+sma_let+dig+sym);
        String pwd="";
        int i;
        
        for(i=0;i<l;i++)
        {
            pwd+=all.charAt(r.nextInt(all.length()));
        }
        return pwd;
    }
    
    public static String otp(int l)
    {
        Random r=new Random();
        String dig="0123456789";
        String otp="";
        int i;
        
        for(i=0;i<l;i++)
        {
         otp+=dig.charAt(r.nextInt(dig.length()));
        }
        
        return otp;
    }
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
     
        
        while(true)
        {
        System.out.println("Enter the length of Password or OTP you want your program to generate");
        int l=s.nextInt();
        System.out.println("Enter 1: For Password generation.\nEnter 2: For OTP generation.\nEnter any no except 1 & 2: For exit.");
        int c=s.nextInt();
        
        switch(c)
        {
        case 1:
        System.out.println(password(l));
        break;
        
        case 2:
        System.out.println(otp(l));
        break;
        
        default:
        System.exit(0);   
        }
        }
                
    }
}
