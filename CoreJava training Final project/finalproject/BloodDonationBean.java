package com.evergent.corejava.finalproject;

public class BloodDonationBean {
    private int donorId;
    private String donorName;
    private long mobileNumber;
    private String bloodType;
    private int donationCount;

    public int getDonorId() {
        return donorId;
    }
    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }
    public String getDonorName() {
        return donorName;
    }
    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }
    public long getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getBloodType() {
        return bloodType;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    public int getDonationCount() {
        return donationCount;
    }
    public void setDonationCount(int donationCount) {
        this.donationCount = donationCount;
    }
}

