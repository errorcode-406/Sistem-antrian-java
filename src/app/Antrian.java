/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

public class Antrian {
    private int nomorTerakhir;
    private int nomorSekarang;

    public Antrian() {
        this.nomorTerakhir = 0;
        this.nomorSekarang = 0;
    }

    public int getNomorTerakhir() {
        return nomorTerakhir;
    }

    public void setNomorTerakhir(int nomorTerakhir) {
        this.nomorTerakhir = nomorTerakhir;
    }

    public int getNomorSekarang() {
        return nomorSekarang;
    }

    public void setNomorSekarang(int nomorSekarang) {
        this.nomorSekarang = nomorSekarang;
    }
}

