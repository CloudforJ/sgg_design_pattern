package com.atguigu.uml.composition;

import com.atguigu.uml.aggregation.Monitor;
import com.atguigu.uml.aggregation.Mouse;

public class Computer {
    public Monitor monitor = new Monitor();
    public Mouse mouse = new Mouse();

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
