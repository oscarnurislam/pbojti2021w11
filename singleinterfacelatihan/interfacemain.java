/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleinterfacelatihan;

import singleinterfacelatihan.ICumlaude;

import singleinterfacelatihan.Mahasiswa;
import singleinterfacelatihan.PascaSarjana;

import singleinterfacelatihan.Rektor;
import singleinterfacelatihan.Sarjana;
public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
       Sarjana sarjanaCumlaude = new Sarjana("Dini");
       PascaSarjana masterCumlaude = new PascaSarjana("Elok");
       
      
       pakrektor.berisiSertifikatCumlaude(sarjanaCumlaude);
       pakrektor.berisiSertifikatCumlaude(masterCumlaude);
    }
}
