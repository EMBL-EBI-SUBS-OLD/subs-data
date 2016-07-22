package uk.ac.ebi.subs.data.component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Attributes {

    List<Attribute> attributes = new ArrayList<Attribute>();

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Map<String,List<Attribute>> getGroupedAttributes() {
        Map<String,List<Attribute>> map = new LinkedHashMap<String,List<Attribute>>();

        for (Attribute attribute : this.attributes){

            if (! map.containsKey( attribute.getTagName() )){
                map.put(attribute.getTagName(),new ArrayList<Attribute>());
            }

            map.get(attribute.getTagName()).add(attribute);

        }
        return map;
    }

    public void addAttribute(Attribute attribute){
        this.attributes.add(attribute);
    }
}
