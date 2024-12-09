package com.nanthan.inheritance;

import javax.swing.*;

public class BoxWeight extends box {
    double weight;
    public BoxWeight() {
        this.weight = -1.0;
        //this.l = 1.0;
    }

    public BoxWeight(double l, double w,double h,double weight) {
        super(l,w,h);/// this is the call the parent class constructor
        // used to initialize values from parent
        this.weight = weight;
    }
}
