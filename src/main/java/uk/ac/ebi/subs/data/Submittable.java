package uk.ac.ebi.subs.data;

import java.util.List;

public class Submittable {
    String accession;
    String alias;
    String submittableDomain;
    String uuid;
    String title;
    String description;
    List<Attribute> attributeList;
    String status;

    public Submittable(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status) {
        this.alias = alias;
        this.submittableDomain = submittableDomain;
        this.uuid = uuid;
        this.title = title;
        this.description = description;
        this.attributeList = attributeList;
        this.status = status;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSubmittableDomain() {
        return submittableDomain;
    }

    public void setSubmittableDomain(String submittableDomain) {
        this.submittableDomain = submittableDomain;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Attribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
