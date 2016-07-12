package uk.ac.ebi.subs.data;

import java.util.ArrayList;
import java.util.List;

public class ArrayAssay extends Assay {
    String arrayDesign;
    List<ArraySubmittableFile> arraySubmittableFileList = new ArrayList<ArraySubmittableFile>();

    public ArrayAssay(String alias, String submittableDomain, String uuid, String title, String description, List<Attribute> attributeList, String status, List<Protocol> protocolList, String assayType, Instrument instrument) {
        super(alias, submittableDomain, uuid, title, description, attributeList, status, protocolList, assayType, instrument);
    }
}
