package uk.ac.ebi.subs.linkresolution;


import org.springframework.stereotype.Service;
import uk.ac.ebi.subs.data.SubsEntity;

import java.util.UUID;

@Service
public class UuidService {

    public void addUuid(SubsEntity entity) {
        if (entity.getAccession() != null) {
            throw new IllegalArgumentException("Will not create UUID where accession already exists");
        }
        if (entity.getUuid() == null) {
            entity.setUuid(UUID.randomUUID().toString());
        }

    }
}
