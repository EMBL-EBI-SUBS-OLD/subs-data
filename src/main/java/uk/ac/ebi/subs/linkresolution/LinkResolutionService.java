package uk.ac.ebi.subs.linkresolution;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;


public interface LinkResolutionService {

    public SubsLink fetchSubsLink(String uuid);
    public void storeSubsLink(AbstractSubsEntity subsEntity);
    public void storeSubsLink(SubsLink subsLink);
}
