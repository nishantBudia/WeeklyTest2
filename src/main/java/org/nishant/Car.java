package org.nishant;

public class Car {
    int numCyl;
    int cc;
    String manufacturer;
    boolean turbo;
    int safetyRating;
    String name;

    public Car(Integer numCyl, Integer cc, String manufacturer, Boolean turbo, Integer safetyRating, String name) {
        this.numCyl = numCyl!=null?numCyl:4;
        this.cc = cc!=null?cc:1499;
        this.manufacturer = manufacturer!=null?manufacturer:"Volkswagen";
        this.turbo = turbo!=null?turbo:true;
        this.safetyRating = safetyRating!=null?safetyRating:4;
        this.name = name!=null?name:"Virtus";
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
}
