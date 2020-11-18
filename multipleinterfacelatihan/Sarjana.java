/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleinterfacelatihan;



/**
 *
 * @author USER
 */
public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi{

    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ki lebih dari 3,51");
    }
    public void menjuaraiKompetisi(){
        System.out.println("Saya telaj menjuarai kompetisi internasional");
    }
    public void membuatPublikasiIlmiah(){
        System.out.println("Saya menerbitkan artikel di jurnal internasional");
    }
    
}
