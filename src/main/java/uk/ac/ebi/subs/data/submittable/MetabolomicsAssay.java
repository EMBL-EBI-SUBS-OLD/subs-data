package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.SubmittableFile;
import uk.ac.ebi.subs.data.component.Attribute;
import uk.ac.ebi.subs.data.component.Instrument;
import uk.ac.ebi.subs.data.component.Protocol;

import java.util.ArrayList;
import java.util.List;

public class MetabolomicsAssay extends Assay {
    SubmittableFile submittableFile;
    List<String> sampleNameList = new ArrayList<String>();

    public MetabolomicsAssay(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status, List<Protocol> protocolList, String assayType, Instrument instrument) {
        super(alias, submittableDomain, uuid, title, description, attributeList, status, protocolList, assayType, instrument);
    }
}
