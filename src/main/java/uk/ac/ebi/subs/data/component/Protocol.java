package uk.ac.ebi.subs.data.component;

public class Protocol {
    String name;
    String description;
    String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String protocolType) {
        this.type = protocolType;
    }
}
