/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author WINDOWS 10
 */
public class Bus3 {
    //deklarasi
    public int penumpang;
    public int maxPenumpang;
    //konstruktor dan parameter untuk penumpang maksimum
    public Bus3 (int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addPenumpang(int penumpang){
        //variabel temp merupakan jumlah penumpang di dalam bus
        //variabel penumpang merupakan jumlah penumpang yang ditambahkan di main class
        int temp;
        temp = this.penumpang + penumpang;
        //ketika penumpang melebihi batas, maka
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        //jika tidak, maka
        }else{
            this.penumpang = temp;
        }
    }
    //password
    public void getPenumpang(int password){
        if (password == 24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
    }
    //cetak
    public void cetakPenumpang(){
        System.out.println("Penumpang bus sekarang = "+ penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+ maxPenumpang);
    }
}

