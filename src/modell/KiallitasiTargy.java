/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modell;

import java.util.Comparator;
import java.util.Date;

public abstract class KiallitasiTargy implements Comparable<KiallitasiTargy>{

    private Date letrehozasiDatum;
    String keszito, cim;
    

    public KiallitasiTargy(String keszito, String cim) throws Exception {
        this.keszito = keszito;
        this.cim = cim;
        this.letrehozasiDatum = new Date();
        datumEll();
    }

    public KiallitasiTargy(Date letrehozasiDatum, String keszito, String cim) throws Exception {
        this(keszito, cim);
        this.letrehozasiDatum = letrehozasiDatum;
        datumEll();
    }
    
    public void datumEll() throws Exception {
        if(letrehozasiDatum.after(new Date())){
            System.out.println("Hibás dátum!");
        }
    }
    
    
    

    @Override
    public String toString() {
        return "KiallitasiTargy{" + "letrehozasiDatum=" + letrehozasiDatum + ", keszito=" + keszito + ", cim=" + cim + '}';
    }  
    
}


