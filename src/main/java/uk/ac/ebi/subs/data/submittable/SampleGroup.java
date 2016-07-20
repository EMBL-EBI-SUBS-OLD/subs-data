package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.util.ArrayList;
import java.util.List;

public class SampleGroup  implements Submittable {
    String accession;
    String alias;
    String submittableDomain;
    String uuid;
    String title;
    String description;
    List<Attribute> attributeList;
    String status;

    List<SubsLink> sampleRefs = new ArrayList<SubsLink>();

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

    public List<SubsLink> getSampleRefs() {
        return sampleRefs;
    }

    public void setSampleRefs(List<SubsLink> sampleRefs) {
        this.sampleRefs = sampleRefs;
    }
}
