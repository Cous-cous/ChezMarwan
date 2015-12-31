package org.martini.kartit.monapplication;

/**
 * Created by samikartit on 09/11/2015.
 */
public class Sandwich {

    public Boolean getSalade() {
        return Salade;
    }

    public void setSalade(Boolean salade) {

        Salade = salade;
    }

    public Boolean getOignons() {
        return Oignons;
    }

    public void setOignons(Boolean oignons) {

        Oignons = oignons;
    }

    public Boolean getTomates() {
        return Tomates;
    }

    public void setTomates(Boolean tomates) {
        Tomates = tomates;
    }


    public Boolean getCordon() {
        return Cordon;
    }

    public void setCordon(Boolean cordon) {

        Cordon = cordon;
    }

    public Boolean getSteak() {
        return Steak;
    }

    public void setSteak(Boolean steak) {

        Steak = steak;
    }

    public Boolean getMerguez() {
        return Merguez;
    }

    public void setMerguez(Boolean merguez) {

        Merguez = merguez;
    }

    public boolean getPain() {
        return pain;
    }

    public void setPain(boolean pain) {
        this.pain = pain;
    }

    Boolean Salade;
    Boolean Oignons;
    Boolean Tomates;
    Boolean Cordon;
    Boolean Steak;
    Boolean Merguez;

    boolean pain;

    public Sandwich(){
        Salade=false;
        Tomates=false;
        Oignons=false;
        Cordon=false;
        Steak=false;
        Merguez=false;
    }
}
