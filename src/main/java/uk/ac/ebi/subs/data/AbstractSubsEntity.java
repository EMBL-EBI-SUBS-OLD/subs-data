package uk.ac.ebi.subs.data;


import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Attributes;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubsEntity implements Attributes {

    String type;
    String uuid;
    String accession;
    String archive;
    String name;

    String title;
    String description;
    List<Attribute> attributes = new ArrayList<Attribute>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public SubsLink asLink(){
        SubsLink subsLink = new SubsLink();
        subsLink.setAccession(this.accession);
        subsLink.setUuid(this.uuid);
        subsLink.setArchive(this.archive);
        subsLink.setAlias(this.name);
        return subsLink;
    }
}
