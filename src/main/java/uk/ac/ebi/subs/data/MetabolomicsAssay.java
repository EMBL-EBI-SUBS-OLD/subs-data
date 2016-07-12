package uk.ac.ebi.subs.data;

import java.util.ArrayList;
import java.util.List;

public class MetabolomicsAssay extends Assay {
    SubmittableFile submittableFile;
    List<String> sampleNameList = new ArrayList<String>();

    public MetabolomicsAssay(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status, List<Protocol> protocolList, String assayType, Instrument instrument) {
        super(alias, submittableDomain, uuid, title, description, attributeList, status, protocolList, assayType, instrument);
    }
}
