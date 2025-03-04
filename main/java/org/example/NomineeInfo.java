package org.example;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NomineeInfo {
    @JsonProperty("identification_type")
    private int identificationType;

    private String relationship;

    @JsonProperty("date_of_birth")
    private String dateOfBirth;

    private String address;

    @JsonProperty("mobile_no")
    private String mobileNo;

    @JsonProperty("email_address")
    private String emailAddress;

    @JsonProperty("is_next_of_kin")
    private String isNextOfKin;

    @JsonProperty("is_beneficiary")
    private String isBeneficiary;

    @JsonProperty("is_contact_person")
    private String isContactPerson;

    @JsonProperty("is_nominee")
    private String isNominee;

    private int allocation;

    public int getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(int identificationType) {
        this.identificationType = identificationType;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getIsNextOfKin() {
        return isNextOfKin;
    }

    public void setIsNextOfKin(String isNextOfKin) {
        this.isNextOfKin = isNextOfKin;
    }

    public String getIsBeneficiary() {
        return isBeneficiary;
    }

    public void setIsBeneficiary(String isBeneficiary) {
        this.isBeneficiary = isBeneficiary;
    }

    public String getIsContactPerson() {
        return isContactPerson;
    }

    public void setIsContactPerson(String isContactPerson) {
        this.isContactPerson = isContactPerson;
    }

    public String getIsNominee() {
        return isNominee;
    }

    public void setIsNominee(String isNominee) {
        this.isNominee = isNominee;
    }

    public int getAllocation() {
        return allocation;
    }

    public void setAllocation(int allocation) {
        this.allocation = allocation;
    }
}