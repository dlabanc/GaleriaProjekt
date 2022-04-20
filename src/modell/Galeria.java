/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.util.ArrayList;
import java.util.Iterator;

public class Galeria implements Iterable<KiallitasiTargy>{

    private ArrayList<KiallitasiTargy> targyak;

    public Galeria() {
        this.targyak = new ArrayList<>();
    }

    public void felvesz(KiallitasiTargy k) {
        this.targyak.add(k);
    }

    @Override
    public Iterator<KiallitasiTargy> iterator() {
        return targyak.iterator();
    }

}

