package uk.ac.ebi.subs.data.component;

public class SampleRelationship extends SubsLink {
    String relationshipType;

    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }
}
