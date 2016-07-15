package uk.ac.ebi.subs.data.component;

public interface Attribute {
        String getTagName ();
        void setTagName (String tagName);
        String getTagValue();
        void setTagValue (String tagValue);
        String getUnits();
        OntologyTerm getOntology ();
        void setOntology (OntologyTerm ontologyTerm);
}
