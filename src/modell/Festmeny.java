/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

public class Festmeny extends KiallitasiTargy implements Serializable{

    private String eleresiUt;

    public Festmeny(String keszito, String cim) throws Exception {
        super(keszito, cim);
    }

    public Festmeny(String keszito, String cim, String eleresiUt) throws Exception {
        super(keszito, cim);
        this.eleresiUt = eleresiUt;
    }
    
    public Festmeny(Date letrehozasiDatum, String keszito, String cim) throws Exception {
        super(letrehozasiDatum, keszito, cim);
    }

    public Festmeny(Date letrehozasiDatum, String keszito, String cim, String eleresiUt) throws Exception {
        super(letrehozasiDatum, keszito, cim);
        this.eleresiUt = eleresiUt;
    }

    public String kepMegjelenit() {
        File f = new File(this.eleresiUt);
        if (f.exists()) {
            return "megjelenítés folyamatban...";
        } else {
            return "nem lehet megjeleníteni";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Festmeny{" + kepMegjelenit() + "";
    }

    @Override
    public int compareTo(KiallitasiTargy o) {
        return this.compareTo(o);
    }


    

}


