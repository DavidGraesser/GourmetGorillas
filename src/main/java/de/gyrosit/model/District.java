package de.gyrosit.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by dave on 18.01.15.
 */
public enum District {

    FRIEDRICHSHAIN(1, "Friedrichshain"),
    HELLERSDORF(2, "Hellersdorf"),
    HOHENSCHOENHAUSEN(3, "Hohenschönhausen"),
    KOEPENICK(4, "Köpenick"),
    LICHTENBERG(5, "Lichtenberg"),
    MARZAHN(6, "Marzahn"),
    MITTE(7, "Mitte"),
    PANKOW(8, "Pankow"),
    PRENZLAUER_BERG(9, "Prenzlauer Berg"),
    TREPTOW(10, "Treptow"),
    WEISSENSEE(11, "Weißensee"),
    CHARLOTTENBURG(12, "Charlottenburg"),
    KREUZBERG(13, "Kreuzberg"),
    NEUKOELLN(14, "Neukölln"),
    REINICKENDORF(15, "Reinickendorf"),
    SCHOENEBERG(16, "Schöneberg"),
    SPANDAU(17, "Spandau"),
    STEGLITZ(18, "Steglitz"),
    TEMPELHOF(19, "Tempelhof"),
    TIERGARTEN(20, "Tiergarten"),
    WEDDING(21, "Wedding"),
    WILMERSDORF(22, "Wilmersdorf"),
    ZEHLENDORF(23, "Zehlendorf");

    private final int id;
    private final String label;

    District(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", label='" + label + '\'' +
                '}';
    }
}






