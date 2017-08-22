/*
Heather M Smith
CSIS 1400/ Koziatek
September 8th, 2016
Compound Interest
 */
package compoundinterest;
  
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class CompoundInterest
{

    public static void main(String[] args)
    {
        double monthlySavings, monthlyCompound, apr, monthlyRate;
       
        Scanner scan = new Scanner(System.in);
        
        NumberFormat cash = NumberFormat.getCurrencyInstance();
       
        JOptionPane.showMessageDialog(null, "Enter your monthly savings amount "
                + "e.g. (50.00): ");
            
            monthlySavings = scan.nextDouble();
        
        JOptionPane.showMessageDialog(null, "Enter your annual percentage rate "
                + "e.g. (5): ");
            
            apr = scan.nextDouble();
            
            apr = apr / 100;
            
            monthlyRate = apr / 12;
            //month 1
            monthlyCompound = monthlySavings * monthlyRate;
            
            monthlySavings += monthlyCompound; 
            //month 2
            monthlyCompound = monthlySavings * monthlyRate;
            
            monthlySavings += monthlyCompound; 
            //month 3
            monthlyCompound = monthlySavings * monthlyRate;
            
            monthlySavings += monthlyCompound; 
            //month 4
            monthlyCompound = monthlySavings * monthlyRate;
            
            monthlySavings += monthlyCompound; 
            //month 5
            monthlyCompound = monthlySavings * monthlyRate;
            
            monthlySavings += monthlyCompound; 
            //month 6
            monthlyCompound = monthlySavings * monthlyRate;
            
            monthlySavings += monthlyCompound; 
            
        JOptionPane.showMessageDialog(null, "Savings after six months of "
                + "compounding interest:  " + cash.format(monthlySavings));
        
        
    }
    
}
