package uk.ac.ebi.subs.data.submittable;

import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.component.Submitter;

import java.util.ArrayList;
import java.util.List;

public class Submission {
    List<AbstractSubsEntity> submissionItems = new ArrayList<AbstractSubsEntity>();
    Submitter submitter = new Submitter();
    Domain domain = new Domain();

    public List<AbstractSubsEntity> getSubmissionItems() {
        return submissionItems;
    }

    public void setSubmissionItems(List<AbstractSubsEntity> submissionItems) {
        this.submissionItems = submissionItems;
    }

    public Submitter getSubmitter() {
        return submitter;
    }

    public void setSubmitter(Submitter submitter) {
        this.submitter = submitter;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }
}
