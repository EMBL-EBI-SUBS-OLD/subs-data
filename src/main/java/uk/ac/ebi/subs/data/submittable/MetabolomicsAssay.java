package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class MetabolomicsAssay extends Assay {
    MetabolomicsInstrument instrument;
    SubmittableFile submittableFile;
    List<String> sampleNameList = new ArrayList<String>();

    @Override
    public MetabolomicsInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(MetabolomicsInstrument instrument) {
        this.instrument = instrument;
    }

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
