package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class MetabolomicsAssay extends Assay {
    MetabolomicsInstrument instrument;
    SubmittableFile submittableFile;
    List<SubsLink> sampleRefs = new ArrayList<SubsLink>();

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

    public List<SubsLink> getSampleRefs() {
        return sampleRefs;
    }

    public void setSampleRefs(List<SubsLink> sampleRefs) {
        this.sampleRefs = sampleRefs;
    }
}
