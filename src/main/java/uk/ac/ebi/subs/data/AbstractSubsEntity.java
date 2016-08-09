package uk.ac.ebi.subs.data;


import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Attributes;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.component.SubsLink;
import uk.ac.ebi.subs.data.submittable.Submittable;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubsEntity implements Attributes, Submittable {

    String type;
    String uuid;
    String accession;
    String archive;
    String alias;
    String status;
    Domain domain;

    String title;
    String description;
    List<Attribute> attributes = new ArrayList<Attribute>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    @Override
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    @Override
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public SubsLink asLink(){
        SubsLink subsLink = new SubsLink();
        subsLink.setAccession(this.accession);
        subsLink.setUuid(this.uuid);
        subsLink.setArchive(this.archive);
        subsLink.setAlias(this.alias);
        return subsLink;
    }
}
