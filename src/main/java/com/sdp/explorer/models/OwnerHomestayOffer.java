package com.sdp.explorer.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
String imgpath;

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getVidpath() {
        return vidpath;
    }

    public void setVidpath(String vidpath) {
        this.vidpath = vidpath;
    }

    String vidpath;

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
