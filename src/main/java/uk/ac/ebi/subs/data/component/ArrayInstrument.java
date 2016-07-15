package uk.ac.ebi.subs.data.component;


public class ArrayInstrument implements Instrument {
    String arrayDesign;

    public String getArrayDesign() {
        return arrayDesign;
    }

    public void setArrayDesign(String arrayDesign) {
        this.arrayDesign = arrayDesign;
    }

    @Override
    public String getDescription(){
        return this.getArrayDesign();
    }
}
