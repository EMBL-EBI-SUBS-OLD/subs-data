package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.Publication;
import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Contact;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Study implements Submittable {
    String accession;
    String alias;
    String submittableDomain;
    String uuid;
    String title;
    String description;
    List<Attribute> attributeList;
    String status;

    Date releaseDate;
    List<Publication> publicationList = new ArrayList<Publication>();
    String parentProject = null;
    List<Contact> contactList = new ArrayList<Contact>();
    String studyType;

    @Override
    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    @Override
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String getSubmittableDomain() {
        return submittableDomain;
    }

    public void setSubmittableDomain(String submittableDomain) {
        this.submittableDomain = submittableDomain;
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public List<Attribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Publication> getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(List<Publication> publicationList) {
        this.publicationList = publicationList;
    }

    public String getParentProject() {
        return parentProject;
    }

    public void setParentProject(String parentProject) {
        this.parentProject = parentProject;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }
}
