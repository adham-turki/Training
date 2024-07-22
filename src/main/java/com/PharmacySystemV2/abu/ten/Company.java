package com.PharmacySystemV2.abu.ten;

import javax.persistence.Column;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.FIELD)public class Company {
    @Column
    private int Compid;
    @Column
    private String Compname;
    @Column
    private String location;
    @Column
    private String establsihDate;

    public Company(int compid, String compname, String location, String establsihDate) {
        Compid = compid;
        Compname = compname;
        this.location = location;
        this.establsihDate = establsihDate;
    }

    public int getCompid() {
        return Compid;
    }

    public void setCompid(int compid) {
        Compid = compid;
    }

    public String getCompname() {
        return Compname;
    }

    public void setCompname(String compname) {
        Compname = compname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEstablsihDate() {
        return establsihDate;
    }

    public void setEstablsihDate(String establsihDate) {
        this.establsihDate = establsihDate;
    }
}


