package uk.ac.ebi.subs.linkresolution;

import org.springframework.data.mongodb.repository.MongoRepository;
import uk.ac.ebi.subs.data.component.SubsLink;


public interface LinkResolutionRepository extends MongoRepository<SubsLink, String> {

    public SubsLink findByUuid(String uuid);
}
