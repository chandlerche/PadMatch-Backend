package com.accounting.PadMatchBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Owner {
    @Id
    @GeneratedValue
    private int id;
    private String owner_name;
    private int manager_id;
    private String phone;
    private String alternate_phone;
    private String email;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String payment_method;
    private String check_memo;
    private String receives_1099;
    private String monthly_report;
    private String draw_account;
    private String notes;
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAlternate_phone() {
        return alternate_phone;
    }

    public void setAlternate_phone(String alternate_phone) {
        this.alternate_phone = alternate_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getCheck_memo() {
        return check_memo;
    }

    public void setCheck_memo(String check_memo) {
        this.check_memo = check_memo;
    }

    public String getReceives_1099() {
        return receives_1099;
    }

    public void setReceives_1099(String receives_1099) {
        this.receives_1099 = receives_1099;
    }

    public String getMonthly_report() {
        return monthly_report;
    }

    public void setMonthly_report(String monthly_report) {
        this.monthly_report = monthly_report;
    }

    public String getDraw_account() {
        return draw_account;
    }

    public void setDraw_account(String draw_account) {
        this.draw_account = draw_account;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
