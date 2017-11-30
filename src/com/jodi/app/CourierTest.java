/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jodi.app;

import com.jodi.model.Tarif;
import com.jodi.model.tarifDAO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CourierTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Scanner scan = new Scanner(new File("E:/ASSIGNMENT/tarifDAO.txt"));
            List<Tarif> tarifList = new ArrayList<>();
            
            while (scan.hasNextLine()) {
                Tarif tarifs = new Tarif();
                String line = scan.nextLine();
                String[] data = line.split(",");
                String kota = data[0];
                double tarif = Double.parseDouble(data[1]);
                tarifs.setKotaTujuan(kota);
                //tarifs.setTarifLayanan(tarif);
                //System.out.println(""+tarifs.getKotaTujuan()+" "+tarifs.getTarifLayanan());
                break;
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("File tidak ada");
        }

        Tarif tarif = new Tarif();
        System.out.println("" + tarif.getKotaTujuan());

        tarifDAO td = new tarifDAO();
        td.getTarif();
    }

}
