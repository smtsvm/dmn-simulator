package com.lbs.ui.component;

import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by Samet SEVİM on 7.10.2016.
 */
public class SimulatorLayout extends VerticalLayout{

    public SimulatorLayout(){
        setWidth(100,Unit.PERCENTAGE);
        Button simulateButton = new Button("Simulate");
        simulateButton.addStyleName(ValoTheme.BUTTON_DANGER);
        addComponents(createFieldLayout(), simulateButton);
    }

    private HorizontalLayout createFieldLayout(){
        HorizontalLayout fieldLayout = new HorizontalLayout(createInputLayout(), createOutputLayout());
        fieldLayout.setWidth(100,Unit.PERCENTAGE);
        fieldLayout.setSpacing(true);
        fieldLayout.addStyleName(ValoTheme.LAYOUT_CARD);
        return fieldLayout;
    }

    private FormLayout createInputLayout(){

        FormLayout inputLayout = new FormLayout();
        inputLayout.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
        inputLayout.setCaption("INPUTS");
        inputLayout.addComponent(new TextField("Season"));
        inputLayout.addComponent(new TextField("How many guests:"));
        return inputLayout;
    }

    private FormLayout createOutputLayout(){

        FormLayout outputLayout = new FormLayout();
        outputLayout.setCaption("OUTPUTS");
        outputLayout.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
        outputLayout.addComponent(new TextField("Dish"));
        return outputLayout;
    }


}
