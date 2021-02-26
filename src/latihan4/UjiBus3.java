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
public class UjiBus3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objek baru dan maksimal penumpang
        Bus3 Bus = new Bus3(5);
        //password
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakPenumpang();
        //Penambahan penumpang
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakPenumpang();
        //Penambahan penumpang
        Bus.addPenumpang(1);//tambah 1 penumpang
        Bus.cetakPenumpang();
        //Penambahan penumpang
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakPenumpang();
        //Penambahan penumpang
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakPenumpang();
    }
}

