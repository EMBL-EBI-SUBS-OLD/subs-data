package uk.ac.ebi.subs.data;

public class SubmittableFile {
    String name;
    String path;
    String checksumMethod;
    String checksum;

    public SubmittableFile(String name, String path, String checksumMethod, String checksum) {
        this.name = name;
        this.path = path;
        this.checksumMethod = checksumMethod;
        this.checksum = checksum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getChecksumMethod() {
        return checksumMethod;
    }

    public void setChecksumMethod(String checksumMethod) {
        this.checksumMethod = checksumMethod;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
}
