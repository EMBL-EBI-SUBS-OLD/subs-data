package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.*;

import java.util.ArrayList;
import java.util.List;

public class ArrayAssay extends Assay {
    ArrayInstrument instrument;
    String sample;
    List<LabelledSubmittableFile> fileList = new ArrayList<LabelledSubmittableFile>();

    @Override
    public ArrayInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(ArrayInstrument instrument) {
        this.instrument = instrument;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public List<LabelledSubmittableFile> getFileList() {
        return fileList;
    }

    public void setFileList(List<LabelledSubmittableFile> fileList) {
        this.fileList = fileList;
    }
}
