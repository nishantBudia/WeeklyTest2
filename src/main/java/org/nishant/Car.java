package org.nishant;

import org.springframework.stereotype.Component;

@Component
public class Car {
    Integer numCyl;
    Integer cc;
    String manufacturer;
    Boolean turbo;
    Integer safetyRating;
    String name;

    public Car(Integer numCyl, Integer cc, String manufacturer, Boolean turbo, Integer safetyRating, String name) {
        this.numCyl = numCyl;
        this.cc = cc;
        this.manufacturer = manufacturer;
        this.turbo = turbo;
        this.safetyRating = safetyRating;
        this.name = name;
    }
    public Car(){
        this.numCyl = 4;
        this.cc = 1499;
        this.manufacturer = "Volkswagen";
        this.turbo = true;
        this.safetyRating = 4;
        this.name = "Virtus";
    }


    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    public void setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getNumCyl() {
        return numCyl;
    }

    public void setNumCyl(int numCyl) {
        this.numCyl = numCyl;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(manufacturer + " " +name+"\n");
        sb.append(cc+" cc "+numCyl+" Cylinder "+(turbo?" turbocharged":"")+"\n");
        sb.append("Safety Rating : "+safetyRating);
        return sb.toString();
    }
}
