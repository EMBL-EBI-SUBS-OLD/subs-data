package uk.ac.ebi.subs.data.component;

public class SubmittableFile {
    String name;
    String path;
    String checksumMethod;
    String checksum;

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
