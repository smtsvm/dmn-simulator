package com.lbs.ui.component;

import com.vaadin.ui.*;

/**
 * Created by Samet SEVİM on 7.10.2016.
 */
public class SimulatorLayout extends VerticalLayout{

    public SimulatorLayout(){

        Button simulateButton = new Button("Simulate");
        addComponents(createFieldLayout(), simulateButton);
    }

    private HorizontalLayout createFieldLayout(){
        HorizontalLayout fieldLayout = new HorizontalLayout(createInputLayout(), createOutputLayout());
        fieldLayout.setSpacing(true);
        return fieldLayout;
    }

    private FormLayout createInputLayout(){

        FormLayout inputLayout = new FormLayout();
        inputLayout.setCaption("INPUTS");
        inputLayout.addComponent(new TextField("Season"));
        inputLayout.addComponent(new TextField("How many guests:"));
        return inputLayout;
    }

    private FormLayout createOutputLayout(){

        FormLayout outputLayout = new FormLayout();
        outputLayout.setCaption("OUTPUTS");
        outputLayout.addComponent(new TextField("Dish"));
        return outputLayout;
    }


}
