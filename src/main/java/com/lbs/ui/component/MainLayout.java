package com.lbs.ui.component;

import com.vaadin.ui.VerticalLayout;

/**
 * Created by Samet SEVİM on 7.10.2016.
 */
public class MainLayout extends VerticalLayout {

    public MainLayout(){
        //TODO
        addComponents(new HeaderLayout(), new DMNTable(), new SimulatorLayout());
    }
}
