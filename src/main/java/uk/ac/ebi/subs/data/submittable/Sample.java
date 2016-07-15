package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.Attribute;

import java.util.ArrayList;
import java.util.List;

public class Sample extends Submittable {
    int taxonId;
    List<SampleLink> sampleLinkList = new ArrayList<SampleLink>();

    public Sample(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status) {
        super(alias, submittableDomain, uuid, title, description, attributeList, status);
    }

    class SampleLink {

        public SampleLink(String alias, String accession, String relationshipType) {
            this.alias = alias;
            this.accession = accession;
            this.relationshipType = relationshipType;
        }

        String alias;
        String accession;
        String relationshipType;

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getAccession() {
            return accession;
        }

        public void setAccession(String accession) {
            this.accession = accession;
        }

        public String getRelationshipType() {
            return relationshipType;
        }

        public void setRelationshipType(String relationshipType) {
            this.relationshipType = relationshipType;
        }
    }
}
