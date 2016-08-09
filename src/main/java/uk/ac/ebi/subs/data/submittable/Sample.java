package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Term;
import uk.ac.ebi.subs.data.component.SampleLink;

import java.util.ArrayList;
import java.util.List;

public class Sample extends AbstractSubsEntity {
    List<SampleLink> sampleLinks = new ArrayList<>();
    Attribute taxon = new Attribute();

    public List<SampleLink> getSampleLinks() {
        return sampleLinks;
    }

    public void setSampleLinks(List<SampleLink> sampleLinks) {
        this.sampleLinks = sampleLinks;
    }

    public Attribute getTaxon() {
        return taxon;
    }

    public void setTaxon(Attribute taxon) {
        this.taxon = taxon;
    }
}
