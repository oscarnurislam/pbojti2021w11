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
public class Mahasiswa implements ICumlaude  {
    protected String nama;
    public Mahasiswa(String nama){
        this.nama=nama;
    }


    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulus() {
   
        
    }

    @Override
    public void meraihIPKTinggi() {
       
    }
}
