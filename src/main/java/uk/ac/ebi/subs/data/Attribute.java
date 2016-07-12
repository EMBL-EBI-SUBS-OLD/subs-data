package uk.ac.ebi.subs.data;

public interface Attribute {
        String getTagName ();
        void setTagName (String tagName);
        String getTagValue();
        void setTagValue (String tagValue);
        String getUnits();
        Ontology getOntology ();
        void setOntology (Ontology ontology);
}
