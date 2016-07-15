package uk.ac.ebi.subs.data.component;

public class ArraySubmittableFile extends SubmittableFile {
    String sampleName;
    String label;


    public ArraySubmittableFile(String name, String path, String checksumMethod, String checksum) {
        super(name, path, checksumMethod, checksum);
    }

    public ArraySubmittableFile(String name, String path, String checksumMethod, String checksum, String sampleName, String label) {
        super(name, path, checksumMethod, checksum);
        this.sampleName = sampleName;
        this.label = label;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
