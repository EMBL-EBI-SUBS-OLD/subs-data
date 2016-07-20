package uk.ac.ebi.subs.data.component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidr on 20/07/2016.
 */
public class MetabolomicsData {
    SubsLink sampleRef;
    List<Attribute> attributes = new ArrayList<Attribute>();
    List<SubmittableFile> files = new ArrayList<SubmittableFile>(); //TODO implemnted as attributes in Metabolights model


    public SubsLink getSampleRef() {
        return sampleRef;
    }

    public void setSampleRef(SubsLink sampleRef) {
        this.sampleRef = sampleRef;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<SubmittableFile> getFiles() {
        return files;
    }

    public void setFiles(List<SubmittableFile> files) {
        this.files = files;
    }
}
