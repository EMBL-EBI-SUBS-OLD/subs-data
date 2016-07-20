package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class MetabolomicsAssay extends AbstractAssay {
    MetabolomicsInstrument instrument;
    List<SubmittableFile> files = new ArrayList<SubmittableFile>();
    List<MetabolomicsData> sampleRefs = new ArrayList<MetabolomicsData>();

    @Override
    public MetabolomicsInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(MetabolomicsInstrument instrument) {
        this.instrument = instrument;
    }

    public List<SubmittableFile> getFiles() {
        return files;
    }

    public void setFiles(List<SubmittableFile> files) {
        this.files = files;
    }

    public List<MetabolomicsData> getSampleRefs() {
        return sampleRefs;
    }

    public void setSampleRefs(List<MetabolomicsData> sampleRefs) {
        this.sampleRefs = sampleRefs;
    }
}
