/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Galeria implements Iterable<KiallitasiTargy> {
    
    private ArrayList<KiallitasiTargy> targyak;
    SimpleDateFormat format;
    String dateString;
    
    public Galeria() throws Exception {
        this.targyak = new ArrayList<>();
        format = new SimpleDateFormat("yyyy-MM-dd");
        dateString = format.format(new Date());
        
        targyak.add(new Festmeny("Béla", "Festmény"));
        targyak.add(new Festmeny(format.parse("2009-12-31"), "Lóri", "Alma"));
        targyak.add(new Festmeny(format.parse("2023-12-31"), "Andris", "Kéz"));
        targyak.add(new Festmeny(format.parse("2021-12-31"), "Lóránt", "Fej", "kep.txt"));
        targyak.add(new Festmeny("Sanyi", "Táj", "minta.txt"));
        
    }
    
    public void felvesz(KiallitasiTargy k) {
        this.targyak.add(k);
    }
    
    @Override
    public Iterator<KiallitasiTargy> iterator() {
        return targyak.iterator();
    }

    @Override
    public String toString() {
        return "Galeria{" + "targyak=" + targyak + ", format=" + format + ", dateString=" + dateString + '}';
    }
    
    
    
}
