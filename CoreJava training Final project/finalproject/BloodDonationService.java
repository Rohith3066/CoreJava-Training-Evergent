package com.evergent.corejava.finalproject;

public class BloodDonationService {
    BloodDonationDAO bloodDAO = new BloodDonationDAO();

    public int registerDonor(int donorId, String donorName, long mobileNumber, String bloodType) {
        BloodDonationBean donor = new BloodDonationBean();
        donor.setDonorId(donorId);
        donor.setDonorName(donorName);
        donor.setMobileNumber(mobileNumber);
        donor.setBloodType(bloodType);
        donor.setDonationCount(0);
        return bloodDAO.addDonor(donor);
    }

    public String viewDonorInfo(int donorId) {
        return bloodDAO.getDonorInfo(donorId);
    }

    public int donateBlood(int donorId) {
        return bloodDAO.recordDonation(donorId);
    }

    public String viewDonationHistory(int donorId) {
        return bloodDAO.getDonationHistory(donorId);
    }

    public String listAvailableDonors() {
        return bloodDAO.getAvailableDonors();
    }
}
