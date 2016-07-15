package uk.ac.ebi.subs.data.component;

public class Attribute {
        String tagName;
        String tagValue;
        String units;
        OntologyTerm ontologyTerm;

        public String getTagName() {
                return tagName;
        }

        public void setTagName(String tagName) {
                this.tagName = tagName;
        }

        public String getTagValue() {
                return tagValue;
        }

        public void setTagValue(String tagValue) {
                this.tagValue = tagValue;
        }

        public String getUnits() {
                return units;
        }

        public void setUnits(String units) {
                this.units = units;
        }

        public OntologyTerm getOntologyTerm() {
                return ontologyTerm;
        }

        public void setOntologyTerm(OntologyTerm ontologyTerm) {
                this.ontologyTerm = ontologyTerm;
        }
}
