package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class SequencingAssay extends Assay {
    SubsLink sampleRef;
    List<LabelledSubmittableFile> labelledSubmittableFileList = new ArrayList<LabelledSubmittableFile>();
    String designDescription;
    String libraryName;
    String librarySource;
    String librarySelection;
    String libraryStrategy;
    String libraryLayout;
    SequencingInstrument instrument;

    public SubsLink getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SubsLink sampleRef) {
        this.sampleRef = sampleRef;
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

    @Override
    public SequencingInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(SequencingInstrument instrument) {
        this.instrument = instrument;
    }
}
