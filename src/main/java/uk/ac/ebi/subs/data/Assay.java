package uk.ac.ebi.subs.data;

import java.util.ArrayList;
import java.util.List;

public class Assay extends Submittable {

    List<Protocol> protocolList = new ArrayList<Protocol>();
    String assayType;
    Instrument instrument;

    public Assay(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status) {
        super(alias, submittableDomain, uuid, title, description, attributeList, status);
    }

    public Assay(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status, List<Protocol> protocolList, String assayType, Instrument instrument) {
        super(alias, submittableDomain, uuid, title, description, attributeList, status);
        this.protocolList = protocolList;
        this.assayType = assayType;
        this.instrument = instrument;
    }

    public List<Protocol> getProtocolList() {
        return protocolList;
    }

    public void setProtocolList(List<Protocol> protocolList) {
        this.protocolList = protocolList;
    }

    public String getAssayType() {
        return assayType;
    }

    public void setAssayType(String assayType) {
        this.assayType = assayType;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
