package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class ProteomicsAssay extends AbstractAssay {
    ProteomicsInstrument instrument;
    List<SubsLink> sampleRefs = new ArrayList<SubsLink>();
    List<SubmittableFile> rawFileList = new ArrayList<SubmittableFile>();
    List<SubmittableFile> processedFileList = new ArrayList<SubmittableFile>();

    @Override
    public ProteomicsInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(ProteomicsInstrument instrument) {
        this.instrument = instrument;
    }

    public List<SubsLink> getSampleRefs() {
        return sampleRefs;
    }

    public void setSampleRefs(List<SubsLink> sampleRefs) {
        this.sampleRefs = sampleRefs;
    }

    public List<SubmittableFile> getRawFileList() {
        return rawFileList;
    }

    public void setRawFileList(List<SubmittableFile> rawFileList) {
        this.rawFileList = rawFileList;
    }

    public List<SubmittableFile> getProcessedFileList() {
        return processedFileList;
    }

    public void setProcessedFileList(List<SubmittableFile> processedFileList) {
        this.processedFileList = processedFileList;
    }
}
