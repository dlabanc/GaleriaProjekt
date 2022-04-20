/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modell;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

public abstract class KiallitasiTargy implements Comparable<KiallitasiTargy>, Serializable{

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
    
    public String datumEll() throws Exception {
        String hiba = "";
        if(letrehozasiDatum.after(new Date())){
           hiba = "hibás dátum!";
        }
        return hiba;
    }
    
    
    

    @Override
    public String toString() {
        return "KiallitasiTargy{" + "letrehozasiDatum=" + letrehozasiDatum + ", keszito=" + keszito + ", cim=" + cim + '}';
    }  
    
}


