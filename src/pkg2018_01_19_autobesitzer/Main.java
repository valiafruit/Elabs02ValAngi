/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2018_01_19_autobesitzer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import pkgData.Auto;
import pkgData.Besitzer;

/**
 *
 * @author schueler
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        Auto a1 = new Auto(123, LocalDate.parse("18.02.1999", dtf) , "BWM X5");
        Auto a2 = new Auto(234, LocalDate.parse("25.10.2005", dtf) , "Audi A3");
        Auto a3 = new Auto(345, LocalDate.parse("13.06.2016", dtf) , "Jeep Wrangler");
        
        HashSet<Auto> autos = new HashSet<Auto>();
        autos.add(a1);
        autos.add(a2);
        autos.add(a3);       
        
        Besitzer b1 = new Besitzer(3526254, "Rita", autos);
        
        System.out.println(b1.toString());
    }
    
}
