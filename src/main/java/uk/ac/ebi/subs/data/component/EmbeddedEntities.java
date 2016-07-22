package uk.ac.ebi.subs.data.component;


import uk.ac.ebi.subs.data.SubsEntity;

import java.util.ArrayList;
import java.util.List;

public class EmbeddedEntities {
    List<SubsEntity> entities = new ArrayList<SubsEntity>();

    public List<SubsEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<SubsEntity> entities) {
        this.entities = entities;
    }
}
