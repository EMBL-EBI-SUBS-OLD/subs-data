package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.component.Attribute;

import java.util.List;

public interface Submittable {
    String getAccession();

    String getAlias();

    String getSubmittableDomain();

    String getUuid();

    String getTitle();

    String getDescription();

    List<Attribute> getAttributeList();

    String getStatus();
}
