package uk.ac.ebi.subs.data.component;

public class SequencingInstrument implements Instrument {
    String name;
    String platform;

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

    @Override
    public String getDescription(){
        return this.getName() + ' ' + this.getPlatform();
    }
}
