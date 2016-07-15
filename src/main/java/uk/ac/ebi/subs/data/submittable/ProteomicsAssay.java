package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.SubmittableFile;
import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Instrument;
import uk.ac.ebi.subs.data.component.Protocol;

import java.util.ArrayList;
import java.util.List;

public class ProteomicsAssay extends Assay {
    List<String> sampleNameList = new ArrayList<String>();
    List<SubmittableFile> rawFileList = new ArrayList<SubmittableFile>();
    List<SubmittableFile> processedFileList = new ArrayList<SubmittableFile>();

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
