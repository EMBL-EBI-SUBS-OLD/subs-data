package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Instrument;
import uk.ac.ebi.subs.data.component.LabelledSubmittableFile;
import uk.ac.ebi.subs.data.component.Protocol;

import java.util.ArrayList;
import java.util.List;

public class ArrayAssay extends Assay {
    String arrayDesign;
    String sample;
    List<LabelledSubmittableFile> fileList = new ArrayList<LabelledSubmittableFile>();

    public String getArrayDesign() {
        return arrayDesign;
    }

    public void setArrayDesign(String arrayDesign) {
        this.arrayDesign = arrayDesign;
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
