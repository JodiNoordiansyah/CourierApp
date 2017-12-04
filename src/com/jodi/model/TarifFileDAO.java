/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jodi.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class TarifFileDAO {
    
    
    public static  List<Tarif> getTarif() {
        List<Tarif> tarifList = new ArrayList<>();
        try {
            
            Scanner scan = new Scanner(new File("TarifDAO.txt"));
            while (scan.hasNextLine()) {
                Tarif tarifs = new Tarif();
                String line = scan.nextLine();
                String[] data = line.split(",");
                
                tarifs.setKotaTujuan(data[0]);
                tarifs.setReguler(Double.parseDouble(data[1]));
                tarifs.setKilat(Double.parseDouble(data[2]));
                tarifs.setSds(Double.parseDouble(data[3]));
                tarifs.setOns(Double.parseDouble(data[4]));
                tarifs.setHds(Double.parseDouble(data[5]));
                
                tarifList.add(tarifs);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File tidak ada");
        }
        
        return tarifList;
    }

     
    
}
