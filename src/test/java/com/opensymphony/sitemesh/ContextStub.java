package com.opensymphony.sitemesh;

import java.io.IOException;

/**
 * Stub {@link Context} implementation, for use in tests.
 *
 * @author Joe Walnes
 */
public class ContextStub implements Context {

    private String requestPath;
    private Content contentToMerge;

    @Override
    public String getRequestPath() {
        return requestPath;
    }

    public ContextStub withRequestPath(String requestPath) {
        this.requestPath = requestPath;
        return this;
    }

    @Override
    public Content decorate(String decoratorName, Content content) throws IOException {
        throw new UnsupportedOperationException("Not supported by ContextStub");
    }

    @Override
    public Content getContentToMerge() {
        return contentToMerge;
    }

    public void setContentToMerge(Content contentToMerge) {
        this.contentToMerge = contentToMerge;
    }
}
