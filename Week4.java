/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int a;
        String temp;
        //Buat input untuk memasukan jumlah kata yang di inginkan 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of names you want to enter: ");
        a = input.nextInt();
        
        String kata[]= new String[a];
        // Buat input untuk memasukan kata yang diingnkan 
        Scanner inkata = new Scanner(System.in);
        System.out.println("Enter word you want to enter : ");
           for(int i = 0; i < a; i++)
        {
            kata[i] = inkata.nextLine();
        }
        for (int i = 0; i < a; i++ )
        {
             for (int j = i + 1; j < a; j++) 
            {
                //membandingkan satu string dengan string yang lainnya
                if (kata[i].compareTo(kata[j])>0) 
                {
                    //tukar menukrar()
                    temp = kata[i];
                    kata[i] = kata[j];
                    kata[j] = temp;
                }
            }
        }
       System.out.print("Names in Sorted Order:");
        //Print untuk menampilakan kata secara urut
        for (int i = 0; i < a - 1; i++) 
        {
            System.out.print(kata[i] + ",");
        }
        System.out.print(kata[a - 1] + "\n");     
    }
    
}
