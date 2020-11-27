package com.eduardnow.di.lifecycle.explicitBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExplicitBean {

    private static final Logger log = LoggerFactory.getLogger(ExplicitBean.class);

    public void initial() {
        log.info("Initial");
    }

    public void destroy() {
        log.info("destroy");
    }

}
