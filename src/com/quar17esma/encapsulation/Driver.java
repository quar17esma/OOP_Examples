package com.quar17esma.encapsulation;


public class Driver {

    // клиенту доступен лишь публичный метод drive(),
    // детали реализации скрыты в приватных методах

    public void drive(){
        startEngine();
        setFirstGear();
        pressAccelerator();
    }

    private void startEngine(){
        System.out.println("Start engine");
    } //завести машину

    private void setFirstGear(){
        System.out.println("Set first gear");
    } //включить первую передачу

    private void pressAccelerator(){
        System.out.println("Press accelerator pedal");
    } //нажать на газ
}
