package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.Attribute;

import java.util.ArrayList;
import java.util.List;

public class SampleGroup  extends Submittable {

    List<String> sampleReferenceList = new ArrayList<String>();

    public List<String> getSampleReferenceList() {
        return sampleReferenceList;
    }

    public void setSampleReferenceList(List<String> sampleReferenceList) {
        this.sampleReferenceList = sampleReferenceList;
    }
}
