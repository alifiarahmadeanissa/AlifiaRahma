/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bendamati;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        
        
     Roti roti;
        roti = new Roti(180, "Denis Croisant ", 20000);
        roti.panggang();

     
     Puding puding;
        puding = new Puding ("putri", "Buah", 20000 );
        puding.makan();
        
        System.out.println("Masukkan suhu panggang tanpa celcius");
        try{
            roti.suhuPanggang= input.nextInt();
        }
        catch(Exception esp){
            System.out.println("Angka saja");
        }
        finally{
            System.out.println("Suhu panggang roti adalah "+ roti.suhuPanggang +" Celcius");
        }
        
        System.out.println("Puding yang dicari = ");
        String namaPuding = input.next();
        puding.setNamaSnack(namaPuding);
     
        System.out.println("Puding " + namaPuding + " Harganya " + puding.harga);
        
        //abstract
        Snack snack = new Snack("Tepung");
        snack.masak();
        
        System.out.println("Masukkan laba");
        try{
            roti.laba= input.nextInt();
        }
        catch(Exception error){
            System.out.println("Kesalahan dalam input");
        }
        finally{
            System.out.println("Laba dari penjualan roti "+ roti.laba);
        }
}
}
