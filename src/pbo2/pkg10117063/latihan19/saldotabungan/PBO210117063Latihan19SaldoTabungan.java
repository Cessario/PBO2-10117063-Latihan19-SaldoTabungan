/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan19.saldotabungan;

/**
 *
 * @author DEADPOOL
 */
public class PBO210117063Latihan19SaldoTabungan {

    /*  Nama : Cessario Sheva Lakita Purwa Adidjaya
        NIM  : 10117063
        Kelas : IF-2
        Deskripsi Program : Menampilkan Saldo Tabungan
     */
    public static void main(String[] args) {
         int i = 1;
         int saldotab = 2500000;
         double bunga = 0.15;
         int saldobul;
        
       do{
           saldobul = (int) (bunga * saldotab);
           saldotab =  (saldotab + saldobul);
              System.out.println("Saldo di bulan ke- "+i + " Rp." + saldotab );
          i++;
            
       }while(i<=6);
       
    }
    
}
