package com.PharmacySystemV2.abu.ten;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Access(AccessType.FIELD)public class Disease {
    @Column
    private int Did;
    @Column
    private String Dname;

    public Disease(int did, String dname) {
        Did = did;
        Dname = dname;
    }

    public int getDid() {
        return Did;
    }

    public void setDid(int did) {
        Did = did;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }
}
