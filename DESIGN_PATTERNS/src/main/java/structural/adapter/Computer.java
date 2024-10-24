package structural.adapter;

class Computer {
    public void plugInUSB(USBDevice device) {
        device.connectWithUSB();
    }
}
