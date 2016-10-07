package com.lbs.ui.component;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by Samet SEVİM on 7.10.2016.
 */
public class MainLayout extends VerticalLayout {

    public MainLayout(){
        Panel panel = new Panel();
        panel.setWidth(750,Unit.PIXELS);
        panel.setStyleName(ValoTheme.PANEL_BORDERLESS);
        VerticalLayout contentLayout = new VerticalLayout();
        contentLayout.addComponents(new HeaderLayout(), new DMNTable(), new SimulatorLayout());
        contentLayout.setSpacing(true);
        panel.setContent(contentLayout);
        addComponent(panel);
        setComponentAlignment(panel, Alignment.TOP_CENTER);


    }
}
