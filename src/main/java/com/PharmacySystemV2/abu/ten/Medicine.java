package com.PharmacySystemV2.abu.ten;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Access(AccessType.FIELD)public class Medicine {
    @Column
    private int Mid ;
    @Column
    private String Mname;
    @Column
    private String Mpackage;
    @Column
    private int quantity;
    @Column
    private String description;
    @Column
    private String dosage_form;
    @Column
    private double price;
    @Column
    private int Compid;

    public Medicine(int mid, String mname,String mpackage, int quantity, String description, String dosage_form, double price, int compid) {
        Mid = mid;
        Mname = mname;
        Mpackage = mpackage;
        this.quantity = quantity;
        this.description = description;
        this.dosage_form = dosage_form;
        this.price = price;
        Compid = compid;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "Mid=" + Mid +
                ", Mname='" + Mname + '\'' +
                ", Mpackage='" + Mpackage + '\'' +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", dosage_form='" + dosage_form + '\'' +
                ", price=" + price +
                ", Compid=" + Compid +"\n"+
                '}';
    }

    public int getMid() {
        return Mid;
    }

    public void setMid(int mid) {
        Mid = mid;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String mname) {
        Mname = mname;
    }
    public String getMpackage() {
        return Mpackage;
    }

    public void setMpackage(String mpackage) {
        Mpackage = mpackage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDosage_form() {
        return dosage_form;
    }

    public void setDosage_form(String dosage_form) {
        this.dosage_form = dosage_form;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCompid() {
        return Compid;
    }

    public void setCompid(int compid) {
        Compid = compid;
    }
}


