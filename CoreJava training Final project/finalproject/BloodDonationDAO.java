package com.evergent.corejava.finalproject;

import java.sql.*;

public class BloodDonationDAO {
    Connection con = null;
    PreparedStatement pstmt = null;

    public int addDonor(BloodDonationBean donor) {
        try {
            con = BloodDBConnection.getConnection();
            String ins_str = "INSERT INTO donors VALUES (?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, donor.getDonorId());
            pstmt.setString(2, donor.getDonorName());
            pstmt.setLong(3, donor.getMobileNumber());
            pstmt.setString(4, donor.getBloodType());
            pstmt.setInt(5, donor.getDonationCount());
            int updateCount = pstmt.executeUpdate();
            con.close();
            return updateCount;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return 0;
        }
    }

    public String getDonorInfo(int donorId) {
        try {
            con = BloodDBConnection.getConnection();
            String query = "SELECT * FROM donors WHERE donor_id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, donorId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return "Donor ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) +
                        ", Mobile: " + rs.getLong(3) + ", Blood Type: " + rs.getString(4) +
                        ", Donation Count: " + rs.getInt(5);
            }
            con.close();
            return "Donor not found";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "Error retrieving donor information";
        }
    }

    public int recordDonation(int donorId) {
        try {
            con = BloodDBConnection.getConnection();
            String update = "UPDATE donors SET donation_count = donation_count + 1 WHERE donor_id = ?";
            pstmt = con.prepareStatement(update);
            pstmt.setInt(1, donorId);
            int result = pstmt.executeUpdate();

            // Add donation record (assuming there's a donations table)
            String donationRecord = "INSERT INTO donations (donor_id, donation_date) VALUES (?, NOW())";
            pstmt = con.prepareStatement(donationRecord);
            pstmt.setInt(1, donorId);
            pstmt.executeUpdate();

            con.close();
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public String getDonationHistory(int donorId) {
        try {
            con = BloodDBConnection.getConnection();
            String query = "SELECT donation_date FROM donations WHERE donor_id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, donorId);
            ResultSet rs = pstmt.executeQuery();
            StringBuilder history = new StringBuilder();
            while (rs.next()) {
                history.append(rs.getDate(1)).append("\n");
            }
            con.close();
            return history.toString();
        } catch (Exception e) {
            System.out.println(e.toString());
            return "Error retrieving donation history";
        }
    }

    public String getAvailableDonors() {
        try {
            con = BloodDBConnection.getConnection();
            String query = "SELECT * FROM donors";
            pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            StringBuilder donorsList = new StringBuilder();
            while (rs.next()) {
                donorsList.append("ID: ").append(rs.getInt(1)).append(", Name: ")
                        .append(rs.getString(2)).append(", Blood Type: ")
                        .append(rs.getString(4)).append("\n");
            }
            con.close();
            return donorsList.toString();
        } catch (Exception e) {
            System.out.println(e.toString());
            return "Error retrieving available donors";
        }
    }
}

