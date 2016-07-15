package uk.ac.ebi.subs.data.component;


public class ProteomicsInstrument implements Instrument {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription(){
        return this.getName();
    }

}
