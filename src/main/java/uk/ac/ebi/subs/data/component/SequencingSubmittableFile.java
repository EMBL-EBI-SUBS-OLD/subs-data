package uk.ac.ebi.subs.data.component;

public class SequencingSubmittableFile extends SubmittableFile {
    public String readLabel;

    public SequencingSubmittableFile(String name, String path, String checksumMethod, String checksum) {
        super(name, path, checksumMethod, checksum);
    }

    public SequencingSubmittableFile(String name, String path, String checksumMethod, String checksum, String readLabel) {
        super(name, path, checksumMethod, checksum);
        this.readLabel = readLabel;
    }

    public String getReadLabel() {
        return readLabel;
    }

    public void setReadLabel(String readLabel) {
        this.readLabel = readLabel;
    }
}
