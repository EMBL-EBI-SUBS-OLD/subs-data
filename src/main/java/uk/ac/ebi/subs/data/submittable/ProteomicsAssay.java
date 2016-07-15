package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class ProteomicsAssay extends Assay {
    ProteomicsInstrument instrument;
    List<String> sampleNameList = new ArrayList<String>();
    List<SubmittableFile> rawFileList = new ArrayList<SubmittableFile>();
    List<SubmittableFile> processedFileList = new ArrayList<SubmittableFile>();

    @Override
    public ProteomicsInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(ProteomicsInstrument instrument) {
        this.instrument = instrument;
    }

    public List<String> getSampleNameList() {
        return sampleNameList;
    }

    public void setSampleNameList(List<String> sampleNameList) {
        this.sampleNameList = sampleNameList;
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
