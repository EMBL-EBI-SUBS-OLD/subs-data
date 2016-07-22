package uk.ac.ebi.subs.data.component;

import java.util.ArrayList;
import java.util.List;

public class Relations {
    List<SubsLink> relations = new ArrayList<SubsLink>();

    public List<SubsLink> getRelations() {
        return relations;
    }

    public void setRelations(List<SubsLink> relations) {
        this.relations = relations;
    }

}
