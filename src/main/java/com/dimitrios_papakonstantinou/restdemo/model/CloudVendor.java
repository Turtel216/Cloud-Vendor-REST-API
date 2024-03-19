package com.dimitrios_papakonstantinou.restdemo.model;

public class CloudVendor {

    private String vendorId;
    private String vendorName;
    private String vendorAndress;
    private String vendorPhoneNumber;
    public CloudVendor(String vendorId, String vendorName, String vendorAndress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAndress = vendorAndress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public CloudVendor() {

    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAndress() {
        return vendorAndress;
    }

    public void setVendorAndress(String vendorAndress) {
        this.vendorAndress = vendorAndress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
