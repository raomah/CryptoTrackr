/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.awt.image.BufferedImage;
import java.util.Date;

/**
 *
 * @author amit
 */
public class UserProfile {
    
    private String name;
    private BufferedImage image;
    private Date dob;
    private String mailAdd;
    private String area;
    private long telno;
    private long faxNo;
    private String linkedIn;
    private String ipAddress;
    private long uin;    
    private long din;
    private long ssnno;
    private String medicalRecordNo;
    private String healthPlanBeneficiaryno;
    private long bankAccountNo;
    private long licenseNo;
    private String vehicleno;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMailAdd() {
        return mailAdd;
    }

    public void setMailAdd(String mailAdd) {
        this.mailAdd = mailAdd;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public long getTelno() {
        return telno;
    }

    public void setTelno(long telno) {
        this.telno = telno;
    }

    public long getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(long faxNo) {
        this.faxNo = faxNo;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public long getUin() {
        return uin;
    }

    public void setUin(long uin) {
        this.uin = uin;
    }

    public long getDin() {
        return din;
    }

    public void setDin(long din) {
        this.din = din;
    }

    public long getSsnno() {
        return ssnno;
    }

    public void setSsnno(long ssnno) {
        this.ssnno = ssnno;
    }

    public String getMedicalRecordNo() {
        return medicalRecordNo;
    }

    public void setMedicalRecordNo(String medicalRecordNo) {
        this.medicalRecordNo = medicalRecordNo;
    }

    public String getHealthPlanBeneficiaryno() {
        return healthPlanBeneficiaryno;
    }

    public void setHealthPlanBeneficiaryno(String healthPlanBeneficiaryno) {
        this.healthPlanBeneficiaryno = healthPlanBeneficiaryno;
    }

    public long getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(long bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public long getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(long licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
