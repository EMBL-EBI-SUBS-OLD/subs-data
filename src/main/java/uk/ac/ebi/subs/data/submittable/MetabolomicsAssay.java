package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.SubmittableFile;
import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Instrument;
import uk.ac.ebi.subs.data.component.Protocol;

import java.util.ArrayList;
import java.util.List;

public class MetabolomicsAssay extends Assay {
    SubmittableFile submittableFile;
    List<String> sampleNameList = new ArrayList<String>();

    public SubmittableFile getSubmittableFile() {
        return submittableFile;
    }

    public void setSubmittableFile(SubmittableFile submittableFile) {
        this.submittableFile = submittableFile;
    }

    public List<String> getSampleNameList() {
        return sampleNameList;
    }

    public void setSampleNameList(List<String> sampleNameList) {
        this.sampleNameList = sampleNameList;
    }
}
