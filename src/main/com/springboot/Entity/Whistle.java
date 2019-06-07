package com.springboot.Entity;

public class Whistle {

    String complaintId;
    String companyName;
    String incidentType;
    String association;
    String awareOf;
    String personInvolved;
    String monetorValue;
    String date;
    String auditAware;
    String generalNature;
    String occurancePlace;
    String reviewer;


    public Whistle() {
    }

    public Whistle(String complaintId, String companyName, String incidentType, String association, String awareOf, String personInvolved, String monetorValue, String date, String auditAware, String generalNature, String occurancePlace, String reviewer) {
        this.complaintId = complaintId;
        this.companyName = companyName;
        this.incidentType = incidentType;
        this.association = association;
        this.awareOf = awareOf;
        this.personInvolved = personInvolved;
        this.monetorValue = monetorValue;
        this.date = date;
        this.auditAware = auditAware;
        this.generalNature = generalNature;
        this.occurancePlace = occurancePlace;
        this.reviewer = reviewer;
    }

    public Integer getComplaintId() {
        return Integer.valueOf(complaintId);
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getAssociation() {
        return association;
    }

    public void setAssociation(String association) {
        this.association = association;
    }

    public String getAwareOf() {
        return awareOf;
    }

    public void setAwareOf(String awareOf) {
        this.awareOf = awareOf;
    }

    public String getPersonInvolved() {
        return personInvolved;
    }

    public void setPersonInvolved(String personInvolved) {
        this.personInvolved = personInvolved;
    }

    public String getMonetorValue() {
        return monetorValue;
    }

    public void setMonetorValue(String monetorValue) {
        this.monetorValue = monetorValue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuditAware() {
        return auditAware;
    }

    public void setAuditAware(String auditAware) {
        this.auditAware = auditAware;
    }

    public String getGeneralNature() {
        return generalNature;
    }

    public void setGeneralNature(String generalNature) {
        this.generalNature = generalNature;
    }

    public String getOccurancePlace() {
        return occurancePlace;
    }

    public void setOccurancePlace(String occurancePlace) {
        this.occurancePlace = occurancePlace;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }


}



