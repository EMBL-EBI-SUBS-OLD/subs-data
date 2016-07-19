package uk.ac.ebi.subs.data.submittable;

import java.util.List;

public class Submission extends Submittable {
    private List<SubmissionLink> submissionItems;

    public List<SubmissionLink> getSubmissionItems() {
        return submissionItems;
    }

    public void setSubmissionItems(List<SubmissionLink> submissionItems) {
        this.submissionItems = submissionItems;
    }

    class SubmissionLink {

    }
}
