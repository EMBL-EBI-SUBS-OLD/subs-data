package uk.ac.ebi.subs.linkresolution;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;

import java.net.URL;

@Service("RemoteLinkResolutionService")
public class RemoteLinkResolutionServiceImpl implements LinkResolutionService {

    RestTemplate restTemplate = new RestTemplate();
    private URL base;

    @Override
    public SubsLink fetchSubsLink(String uuid) {

        SubsLink link = restTemplate.getForObject(base + "/" + uuid, SubsLink.class);
        return link;

    }

    @Override
    public void storeSubsLink(AbstractSubsEntity subsEntity) {
        this.storeSubsLink(subsEntity.asLink());
    }

    @Override
    public void storeSubsLink(SubsLink link) {
        restTemplate.put(base + "/", link);
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void setBase(URL base) {
        this.base = base;
    }
}
