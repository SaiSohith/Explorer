package com.sdp.explorer.models;
import javax.persistence.*;

@Entity
@Table
public class OwnerHomestayOffer {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
int offerid;
String Homestayname;
int noofpersons;
boolean offerfood;
float lat;
float lang;
String Address;

    public int getOfferid() {
        return offerid;
    }

    public void setOfferid(int offerid) {
        this.offerid = offerid;
    }

    public String getHomestayname() {
        return Homestayname;
    }

    public void setHomestayname(String homestayname) {
        Homestayname = homestayname;
    }

    public int getNoofpersons() {
        return noofpersons;
    }

    public void setNoofpersons(int noofpersons) {
        this.noofpersons = noofpersons;
    }

    public boolean isOfferfood() {
        return offerfood;
    }

    public void setOfferfood(boolean offerfood) {
        this.offerfood = offerfood;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLang() {
        return lang;
    }

    public void setLang(float lang) {
        this.lang = lang;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
