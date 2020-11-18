/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleinterfacelatihan;



/**
 *
 * @author USER
 */
public class Sarjana extends Mahasiswa implements ICumlaude{

    public Sarjana(String nama) {
        super(nama);
    }
public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
         kuliahDiKampus();
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ki lebih dari 3,51");
    }
    
}
