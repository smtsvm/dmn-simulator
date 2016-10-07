package com.lbs.ui;

import com.lbs.ui.component.MainLayout;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * Created by Samet SEVİM on 7.10.2016.
 */
@SpringUI(path="editor")
public class VaadinUI extends UI{

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new MainLayout());
    }
}
