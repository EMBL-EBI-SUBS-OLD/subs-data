package uk.ac.ebi.subs.data.component;

public class OntologyTerm {
    String ontologyName;
    String ontologyVersion;
    String termID;

    public String getOntologyName() {
        return ontologyName;
    }

    public void setOntologyName(String ontologyName) {
        this.ontologyName = ontologyName;
    }

    public String getOntologyVersion() {
        return ontologyVersion;
    }

    public void setOntologyVersion(String ontologyVersion) {
        this.ontologyVersion = ontologyVersion;
    }

    public String getTermID() {
        return termID;
    }

    public void setTermID(String termID) {
        this.termID = termID;
    }
}
