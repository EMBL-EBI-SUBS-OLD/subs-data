package uk.ac.ebi.subs.linkresolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.SubsLink;

@RestController
public class LinkResolutionController {

    @Autowired
    @Qualifier("LocalLinkResolutionService")
    LinkResolutionService linkResolutionService;

    @RequestMapping("/link/{uuid}")
    public SubsLink getLink(@PathVariable String uuid) {
        return linkResolutionService.fetchSubsLink(uuid);
    }

    @RequestMapping(value = "/link", method = RequestMethod.PUT)
    public void storeUuid(@RequestBody SubsLink subsLink) {
        linkResolutionService.storeSubsLink(subsLink);
    }


}
