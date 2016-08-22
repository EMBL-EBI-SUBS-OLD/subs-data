package uk.ac.ebi.subs.linkresolution;


import org.springframework.stereotype.Service;
import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.submittable.Analysis;

import java.util.UUID;

@Service
public class UuidService {

    public void addUuid(AbstractSubsEntity entity) {
        if (entity.getAccession() != null) {
            throw new IllegalArgumentException("Will not create UUID where accession already exists");
        }
        if (entity.getUuid() == null) {
            entity.setUuid(UUID.randomUUID().toString());
        }

    }
}
