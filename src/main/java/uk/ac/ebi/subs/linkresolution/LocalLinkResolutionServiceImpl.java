package uk.ac.ebi.subs.linkresolution;

import org.springframework.stereotype.Service;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.util.HashMap;
import java.util.Map;

@Service("LocalLinkResolutionService")
public class LocalLinkResolutionServiceImpl implements LinkResolutionService {

    Map<String,SubsLink> storage = new HashMap<String, SubsLink>();

    @Override
    public SubsLink fetchSubsLink(String uuid) {
        return storage.get(uuid);
    }

    @Override
    public void storeSubsLink(SubsLink link) {
        storage.put(link.getUuid(),link);
    }
}
