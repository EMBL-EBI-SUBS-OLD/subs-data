package uk.ac.ebi.subs.linkresolution;

import uk.ac.ebi.subs.data.component.SubsLink;


public interface LinkResolutionService {

    public SubsLink fetchSubsLink(String uuid);
    public void storeSubsLink(SubsLink link);
}
