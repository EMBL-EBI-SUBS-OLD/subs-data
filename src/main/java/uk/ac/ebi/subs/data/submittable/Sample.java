package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.SampleRelationship;

import java.util.ArrayList;
import java.util.List;

public class Sample extends Submittable {
    Integer taxonId;
    List<SampleRelationship> sampleRelationships = new ArrayList<SampleRelationship>();

    public Integer getTaxonId() {
        return taxonId;
    }

    public void setTaxonId(Integer taxonId) {
        this.taxonId = taxonId;
    }

    public List<SampleRelationship> getSampleRelationships() {
        return sampleRelationships;
    }

    public void setSampleRelationships(List<SampleRelationship> sampleRelationships) {
        this.sampleRelationships = sampleRelationships;
    }
}
