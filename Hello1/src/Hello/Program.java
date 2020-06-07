/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hello;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 32169
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            // TODO code application logic here
            System.out.println("Hi");
            class2 s = new class2();
            System.out.printf("%d",21);
            byte[] buf = new byte[256];
            int sym, n;
            n=0;
            try {
            while((sym=System.in.read())!=10){
                buf[n++]=(byte)sym;
            }} catch (IOException ex) {
                System.out.println(ex.getMessage());
                return;
            }
            
            /*for(int k =0;k<n;++k){
                System.out.print(buf[k]+" ");
                System.out.println((char)buf[k]);
            }*/
            for(byte bt:buf){
                bt='s';
            }
            for(byte bt:buf){
                
                System.out.print(bt+" ");
                System.out.println((char)bt);
            }
        
    }
    class class3{
        
    }
    
    
}
class class2{
    int i = 1;
    }