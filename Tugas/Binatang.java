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
public abstract class Binatang implements IKarnivora, IHerbivora{
    public abstract String nama();
    public abstract int jmlKaki();
    
    public void Binatang(String nama, int jmlKaki){
        this.Binatang(nama, jmlKaki);
    }
    public void setNama(String nama){
        this.nama();
    }
    public void getNama(){
        return;
    }
    public void getKaki(){
        return;
    }
    public void displayBinatang(){
        System.out.println("Nama Hewan "+this.nama());
        System.out.println("Jumlah Kaki "+this.jmlKaki());
    }
    
}