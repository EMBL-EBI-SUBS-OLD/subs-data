package uk.ac.ebi.subs.data;

import java.util.ArrayList;
import java.util.List;

public class SequencingAssay extends Assay {
    String sampleName;
    List<SequencingSubmittableFile> sequencingSubmittableFileList = new ArrayList<SequencingSubmittableFile>();
    String designDescription;
    String libraryName;
    String librarySource;
    String librarySelection;
    String libraryStrategy;
    String libraryLayout;



    public SequencingAssay(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status, List<Protocol> protocolList, String assayType, Instrument instrument) {
        super(alias, submittableDomain, uuid, title, description, attributeList, status, protocolList, assayType, instrument);
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public List<SequencingSubmittableFile> getSequencingSubmittableFileList() {
        return sequencingSubmittableFileList;
    }

    public void setSequencingSubmittableFileList(List<SequencingSubmittableFile> sequencingSubmittableFileList) {
        this.sequencingSubmittableFileList = sequencingSubmittableFileList;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibrarySource() {
        return librarySource;
    }

    public void setLibrarySource(String librarySource) {
        this.librarySource = librarySource;
    }

    public String getLibrarySelection() {
        return librarySelection;
    }

    public void setLibrarySelection(String librarySelection) {
        this.librarySelection = librarySelection;
    }

    public String getLibraryStrategy() {
        return libraryStrategy;
    }

    public void setLibraryStrategy(String libraryStrategy) {
        this.libraryStrategy = libraryStrategy;
    }

    public String getLibraryLayout() {
        return libraryLayout;
    }

    public void setLibraryLayout(String libraryLayout) {
        this.libraryLayout = libraryLayout;
    }

    public String getDesignDescription() {
        return designDescription;
    }

    public void setDesignDescription(String designDescription) {
        this.designDescription = designDescription;
    }
}
