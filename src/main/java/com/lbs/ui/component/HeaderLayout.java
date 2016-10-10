package com.lbs.ui.component;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by Samet SEVİM on 7.10.2016.
 */
public class HeaderLayout extends HorizontalLayout{

    public HeaderLayout(){
        Button uploadDmnButton = new Button("Upload DMN Table");
        Button downloadDmnButton = new Button("Download DMN Table");

        uploadDmnButton.setStyleName(ValoTheme.BUTTON_PRIMARY);
        downloadDmnButton.setStyleName(ValoTheme.BUTTON_PRIMARY);
        setSpacing(true);
        setMargin(new MarginInfo(true, false, false, false));
        uploadDmnButton.addClickListener(e->{

        });

        downloadDmnButton.addClickListener(e->{

        });
        addComponents(uploadDmnButton,downloadDmnButton);
    }
}
