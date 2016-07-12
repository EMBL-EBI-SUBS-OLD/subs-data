package uk.ac.ebi.subs.data;

public class Instrument {
    String name;
    String platform;

    public Instrument(String name, String platform) {
        this.name = name;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
