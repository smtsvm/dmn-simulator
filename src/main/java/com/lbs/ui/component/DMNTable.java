package com.lbs.ui.component;

import com.vaadin.ui.Grid;

/**
 * Created by Samet SEVİM on 7.10.2016.
 */
public class DMNTable extends Grid{

    public DMNTable(){
        addColumn("Season");
        addColumn("How many guests");
        addColumn("Dish");

        setCaption("Dish");
        setColumnReorderingAllowed(true);


    }
}
