package com.thinkconstructive.rest.demo.model;

public class CloudVendor {
    private String id;
    private String Name;
    private String Address;
    private String MobileNo;

    public CloudVendor() {
    }

    public CloudVendor(String id, String Name, String Address, String MobileNo) {
        this.id = id;
        this.Name = Name;
        this.Address= Address;
        this.MobileNo = MobileNo;
    }
    public String getVendorId() {
        return id;
    }

    public void setVendorId(String id) {
        this.id = id;
    }

    public String getVendorName() {
        return Name;
    }

    public void setVendorName(String Name) {
        this.Name = Name;
    }

    public String getVendorAddress() {
        return Address;
    }

    public void setVendorAddress(String Address) {
        this.Address = Address;
    }

    public String getVendorPhoneNumber() {
        return MobileNo;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.MobileNo = vendorPhoneNumber;
    }



}
