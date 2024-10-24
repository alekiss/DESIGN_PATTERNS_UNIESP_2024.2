package structural.adapter;

// Adapter que permite conectar um Monitor (HDMI) como se fosse um USBDevice
class HDMIToUSBAdapter implements USBDevice {
    private Monitor monitor;

    public HDMIToUSBAdapter(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void connectWithUSB() {
        // Traduz a chamada de USB para HDMI
        monitor.connectWithHDMI();
    }
}
