package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.LabelledSubmittableFile;
import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Instrument;
import uk.ac.ebi.subs.data.component.Protocol;

import java.util.ArrayList;
import java.util.List;

public class SequencingAssay extends Assay {
    String sampleName;
    List<LabelledSubmittableFile> labelledSubmittableFileList = new ArrayList<LabelledSubmittableFile>();
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

    public List<LabelledSubmittableFile> getLabelledSubmittableFileList() {
        return labelledSubmittableFileList;
    }

    public void setLabelledSubmittableFileList(List<LabelledSubmittableFile> labelledSubmittableFileList) {
        this.labelledSubmittableFileList = labelledSubmittableFileList;
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
