package structural.adapter;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        // Conectar um dispositivo USB
        USBDevice keyboard = new Keyboard();
        computer.plugInUSB(keyboard);

        // Conectar um dispositivo HDMI usando o Adapter
        Monitor monitor = new Monitor();
        USBDevice hdmiAdapter = new HDMIToUSBAdapter(monitor);
        computer.plugInUSB(hdmiAdapter);  // Agora funciona com o Adapter
    }
}
