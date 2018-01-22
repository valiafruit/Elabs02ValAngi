/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgData;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author schueler
 */
public class Auto {
    private int FGNr; // unique
    private LocalDate Date;
    private String Type;
    private Besitzer besitzer;

    public Auto(int FGNr, LocalDate Date, String Type) {
        this.FGNr = FGNr;
        this.Date = Date;
        this.Type = Type;
    }

    public int getFGNr() {
        return FGNr;
    }

    public void setFGNr(int FGNr) {
        this.FGNr = FGNr;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Besitzer getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(Besitzer besitzer) {
        this.besitzer = besitzer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.FGNr;
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
        final Auto other = (Auto) obj;
        if (this.FGNr != other.FGNr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nAuto{" + "FGNr=" + FGNr + ", Date=" + Date.toString() + ", Type=" + Type + ", besitzer=" + besitzer.getSvNr() + ' ' + besitzer.getName() + '}';
    } 
    
    
    
}
