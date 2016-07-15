package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.Publication;
import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Contact;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Study extends Submittable {
    Date releaseDate;
    List<Publication> publicationList = new ArrayList<Publication>();
    String parentProject = null;
    List<Contact> contactList = new ArrayList<Contact>();
    String studyType;


    public Study(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status) {
        super(alias, submittableDomain, uuid, title, description, attributeList, status);
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
