package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.util.ArrayList;
import java.util.List;

public class SampleGroup  extends Submittable {

    List<SubsLink> sampleRefs = new ArrayList<SubsLink>();

    public List<SubsLink> getSampleRefs() {
        return sampleRefs;
    }

    public void setSampleRefs(List<SubsLink> sampleRefs) {
        this.sampleRefs = sampleRefs;
    }
}
