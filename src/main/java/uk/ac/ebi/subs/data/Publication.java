package uk.ac.ebi.subs.data;

public class Publication {
    String pubmedId;

    public Publication(String pubmedId) {
        this.pubmedId = pubmedId;
    }

    public String getPubmedId() {
        return pubmedId;
    }

    public void setPubmedId(String pubmedId) {
        this.pubmedId = pubmedId;
    }
}
