package uk.ac.ebi.subs.linkresolution;


import org.springframework.stereotype.Service;
import uk.ac.ebi.subs.data.submittable.Submittable;

import java.util.UUID;

@Service
public class UuidService {

    public void addUuid(Submittable submittable) {
        if (submittable.getAccession() != null) {
            throw new IllegalArgumentException("Will not create UUID where accession already exists");
        }
        if (submittable.getUuid() == null) {
            submittable.setUuid(UUID.randomUUID().toString());
        }

    }
}
