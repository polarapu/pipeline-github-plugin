package org.jenkinsci.plugins.pipeline.github;

import java.util.Date;

import groovy.lang.GroovyObjectSupport;
import org.jenkinsci.plugins.pipeline.github.client.Review;
import org.jenkinsci.plugins.scriptsecurity.sandbox.whitelists.Whitelisted;

/**
 * Groovy wrapper for PR reviews
 */
public class ReviewGroovyObject extends GroovyObjectSupport {
    private final Review review;

    ReviewGroovyObject(final Review review) {
        this.review = review;
    }

    @Whitelisted
    public String getUser() {
        return review.getUser().getLogin();
    }

    @Whitelisted
    public String getBody() {
        return review.getBody();
    }

    @Whitelisted
    public String getCommitId() {
        return review.getCommitId();
    }

    @Whitelisted
    public long getId() {
        return review.getId();
    }

    @Whitelisted
    public String getState() {
        return review.getState();
    }
}
