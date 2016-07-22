package uk.ac.ebi.subs.data;

import uk.ac.ebi.subs.data.component.Attributes;
import uk.ac.ebi.subs.data.component.EmbeddedEntities;
import uk.ac.ebi.subs.data.component.Relations;

public class SubsEntity {
    String type;
    String uuid;
    String accession;

    Attributes attributes = new Attributes();
    EmbeddedEntities embedded =  new EmbeddedEntities();
    Relations relations = new Relations();

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

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public EmbeddedEntities getEmbedded() {
        return embedded;
    }

    public void setEmbedded(EmbeddedEntities embedded) {
        this.embedded = embedded;
    }

    public Relations getRelations() {
        return relations;
    }

    public void setRelations(Relations relations) {
        this.relations = relations;
    }
}
