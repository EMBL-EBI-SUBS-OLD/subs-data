package uk.ac.ebi.subs.linkresolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.util.HashMap;
import java.util.Map;

@Service("LocalLinkResolutionService")
public class LocalLinkResolutionServiceImpl implements LinkResolutionService {

    @Autowired LinkResolutionRepository linkResolutionRepository;

    @Override
    public SubsLink fetchSubsLink(String uuid) {
        return linkResolutionRepository.findByUuid(uuid);
    }

    @Override
    public void storeSubsLink(AbstractSubsEntity subsEntity) {
        linkResolutionRepository.save(subsEntity.asLink());
    }

    @Override
    public void storeSubsLink(SubsLink subsLink) {
        linkResolutionRepository.save(subsLink);
    }

}
