/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

/**
 *
 * @author pc2
 */
public class Lab_act1_Arithmetics {
    
    public static void main (String [] args){
        
        int fnum = 10;
        int snum = 4;
        int tnum = 6;
       
                
        int firstquation = (fnum * snum)+ tnum;
        int secondquation = (fnum - snum)% tnum;
        int thirdquation = (fnum + snum + tnum) /3;
        int fourthquation = (fnum * tnum)- snum * snum;
        
        
        
       // product = fnum * snum;
        
        System.out.println(""+fnum+"x"+snum+"+"+tnum+"="+firstquation);
        System.out.println("("+fnum+"-"+snum+")%"+tnum+"="+secondquation);
        System.out.println("("+fnum+"+"+snum+"+"+tnum+")/3="+thirdquation);
        System.out.println(""+fnum+"*"+tnum+"-("+snum+ "*" +snum+")="+fourthquation);
        
       
    }
    
}
