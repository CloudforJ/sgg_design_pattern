package com.atguigu.uml.aggregation;

public class Computer {
    public Monitor monitor;
    public Mouse mouse;

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
