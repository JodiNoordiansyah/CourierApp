/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jodi.model;

/**
 *
 * @author user
 */
public class Paket {

    private int berat;
    private Tarif tarif;
    private final double asuransi = 0.03;
    private boolean isAsuransi;

    public Paket() {
    }

    public Paket(int berat, Tarif tarif, boolean isAsuransi) {
        this.berat = berat;
        this.tarif = tarif;
        this.isAsuransi = isAsuransi;
    }

    public double hitungAsuransi() {
        double hitung = getTarif().getHargaBarang() * asuransi;
        return hitung;
    }

    public double hitungBiayaReguler() {
        double hitung = getTarif().getReguler() * berat;
        return hitung;
    }

    public double hitungBiayaRegulerWithAsuransi() {
        double hitung = hitungBiayaReguler() + hitungAsuransi();
        return hitung;
    }

    public double hitungBiayaKilat() {
        double hitung = getTarif().getKilat() * berat;
        return hitung;
    }

    public double hitungBiayaKilatWithAsuransi() {
        double hitung = hitungBiayaKilat() + hitungAsuransi();
        return hitung;
    }

    public double hitungBiayaSDS() {
        double hitung = getTarif().getSds() * berat;
        return hitung;
    }

    public double hitungBiayaSDSWithAsuransi() {
        double hitung = hitungBiayaSDS() + hitungAsuransi();
        return hitung;
    }

    public double hitungBiayaONS() {
        double hitung = getTarif().getOns() * berat;
        return hitung;
    }

    public double hitungBiayaONSWithAsuransi() {
        double hitung = hitungBiayaONS() + hitungAsuransi();
        return hitung;
    }

    public double hitungBiayaHDS() {
        double hitung = getTarif().getHds() * berat;
        return hitung;
    }

    public double hitungBiayaHDSWithAsuransi() {
        double hitung = hitungBiayaHDS() + hitungAsuransi();
        return hitung;
    }

    /**
     * @return the berat
     */
    public int getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
    }

    /**
     * @return the tarif
     */
    public Tarif getTarif() {
        return tarif;
    }

    /**
     * @param tarif the tarif to set
     */
    public void setTarif(Tarif tarif) {
        this.tarif = tarif;
    }

    /**
     * @return the asuransi
     */
    public double getAsuransi() {
        return asuransi;
    }

}
