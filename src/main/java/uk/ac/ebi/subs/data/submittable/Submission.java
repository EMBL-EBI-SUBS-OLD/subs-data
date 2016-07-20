package uk.ac.ebi.subs.data.submittable;

import java.util.List;

public class Submission extends AbstractSubmission{

    private List<Submittable> submissionItems;

    public List<Submittable> getSubmissionItems() {
        return submissionItems;
    }

    public void setSubmissionItems(List<Submittable> submissionItems) {
        this.submissionItems = submissionItems;
    }

}