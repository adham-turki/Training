package com.PharmacySystemV2.abu.ten;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import io.jsonwebtoken.Jwts;


@Entity
@Access(AccessType.FIELD)public class Employee {
    @Column
    private int Eid ;
    @Column
    private String Ename;
    @Column
    private double salary;
    @Column
    private String phoneNumber;

    public Employee(int eid, String eName, double salary, String phoneNumber) {
        Eid = eid;
        Ename = eName;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Eid=" + Eid +
                ", Ename='" + Ename + '\'' +
                ", salary=" + salary +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

