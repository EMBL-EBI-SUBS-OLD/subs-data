package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class ArrayAssay extends AbstractAssay {
    ArrayInstrument instrument;
    SubsLink sampleRef;
    List<LabelledSubmittableFile> fileList = new ArrayList<LabelledSubmittableFile>();

    @Override
    public ArrayInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(ArrayInstrument instrument) {
        this.instrument = instrument;
    }

    public SubsLink getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SubsLink sampleRef) {
        this.sampleRef = sampleRef;
    }

    public List<LabelledSubmittableFile> getFileList() {
        return fileList;
    }

    public void setFileList(List<LabelledSubmittableFile> fileList) {
        this.fileList = fileList;
    }
}
