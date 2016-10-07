package com.lbs.ui.component;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

/**
 * Created by Samet SEVİM on 7.10.2016.
 */
public class HeaderLayout extends HorizontalLayout{

    public HeaderLayout(){
        Button uploadDmnButton = new Button("Upload DMN Table");
        Button downloadDmnButton = new Button("Download DMN Table");

        setSpacing(true);
        setWidth(100,Unit.PERCENTAGE);
        setMargin(true);

        uploadDmnButton.addClickListener(e->{

        });

        downloadDmnButton.addClickListener(e->{

        });
    }
}
