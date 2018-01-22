/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgData;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author schueler
 */
public class Besitzer {
    private int SvNr; //unique
    private String name;
    private Set<Auto> autos;
    

    public Besitzer(int SvNr, String name, HashSet<Auto> autos){ 
        try {
            this.SvNr = SvNr;
            this.name = name;
            this.setAutos(autos);
        } catch (Exception ex) {
            Logger.getLogger(Besitzer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public int getSvNr() {
        return SvNr;
    }

    public void setSvNr(int SvNr) {
        this.SvNr = SvNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Auto> getAutos() {
        return autos;
    }

    public void setAutos(Set<Auto> autos) throws Exception {
        if (autos == null){
            throw new Exception("need a car");
        }
        else{
            this.autos = autos;
            for (Auto a:autos){
                a.setBesitzer(this);
            }
        }
        
    }

    @Override
    public String toString() {
        return "Besitzer{" + "SvNr=" + SvNr + ", name=" + name + ", autos=" + this.getAutos() + "}\n\n";
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.SvNr;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Besitzer other = (Besitzer) obj;
        if (this.SvNr != other.SvNr) {
            return false;
        }
        return true;
    }

    
}
