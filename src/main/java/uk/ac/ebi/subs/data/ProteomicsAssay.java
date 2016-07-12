package uk.ac.ebi.subs.data;

import java.util.ArrayList;
import java.util.List;

public class ProteomicsAssay extends Assay {
    List<String> sampleNameList = new ArrayList<String>();
    List<SubmittableFile> rawFileList = new ArrayList<SubmittableFile>();
    List<SubmittableFile> processedFileList = new ArrayList<SubmittableFile>();

    public ProteomicsAssay(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status, List<Protocol> protocolList, String assayType, Instrument instrument) {
        super(alias, submittableDomain, uuid, title, description, attributeList, status, protocolList, assayType, instrument);
    }

    public ProteomicsAssay(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status, List<Protocol> protocolList, String assayType, Instrument instrument, List<String> sampleNameList, List<SubmittableFile> rawFileList, List<SubmittableFile> processedFileList) {
        super(alias, submittableDomain, uuid, title, description, attributeList, status, protocolList, assayType, instrument);
        this.sampleNameList = sampleNameList;
        this.rawFileList = rawFileList;
        this.processedFileList = processedFileList;
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
