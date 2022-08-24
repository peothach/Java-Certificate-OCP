package com.ocp.accessmodifier.appcanvas;

import com.ocp.accessmodifier.graphicshape.Circle;

class Canvas {

    void getArea() {

        Circle circle = new Circle();

        circle.area(); // call to public method area(), outside package

    }

}
