package com.lemmy.inator.bean;

import org.springframework.context.annotation.Bean;

public class InstanceBean {
    String instanceURI;

    public InstanceBean(String instanceURI) {
        this.instanceURI = instanceURI;
    }

    public String getInstanceURI() {
        return instanceURI;
    }

    public void setInstanceURI(String instanceURI) {
        this.instanceURI = instanceURI;
    }
}
