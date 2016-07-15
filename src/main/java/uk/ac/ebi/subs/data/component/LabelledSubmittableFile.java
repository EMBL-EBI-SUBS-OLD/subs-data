package uk.ac.ebi.subs.data.component;

public class LabelledSubmittableFile extends SubmittableFile {
    public String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
