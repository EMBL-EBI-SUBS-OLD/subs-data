package uk.ac.ebi.subs.data.component;

public class MetabolomicsInstrument implements Instrument  {
    String technology;
    String platform;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String getDescription(){
        return this.getTechnology() + ' ' + this.getPlatform();
    }
}
