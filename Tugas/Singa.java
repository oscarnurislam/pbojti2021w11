/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author USER
 */

    public class Singa extends Binatang implements IKarnivora, IHerbivora{
    public String suara;
    public String warnaBulu;
    
    public void Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        this.Singa(nama, jmlKaki, suara, warnaBulu);
    }
    public void Binatang(String nama, int jmlKaki){
        this.Binatang(nama, jmlKaki);
    }
    public String nama(){
        System.out.println("Cingacing");
        return suara;
    }
    public int jmlKaki(){
        System.out.println("Jumlah kaki : 4");
        return 4;
    }
    @Override
    public void displayMakan(){
        System.out.println("Makanan : Daging");
    }
    public void warnaBulu(){
        System.out.println("Warna Bulu : Coklat");
    }
    public void Suara(){
        System.out.println("Suara : Roaaarr");
    }
    public void Jenis(){
        System.out.println("Jenis : Karnivora");
    }
}

