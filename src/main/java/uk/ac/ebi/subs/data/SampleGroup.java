package uk.ac.ebi.subs.data;

import java.util.ArrayList;
import java.util.List;

public class SampleGroup  extends Submittable{

    List<String> sampleReferenceList = new ArrayList<String>();

    public SampleGroup(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status) {
        super(alias, submittableDomain, uuid, title, description, attributeList, status);
    }

    public List<String> getSampleReferenceList() {
        return sampleReferenceList;
    }

    public void setSampleReferenceList(List<String> sampleReferenceList) {
        this.sampleReferenceList = sampleReferenceList;
    }
}
