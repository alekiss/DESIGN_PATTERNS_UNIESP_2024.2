package structural.adapter;

class Keyboard implements USBDevice {
    @Override
    public void connectWithUSB() {
        System.out.println("Teclado conectado via USB.");
    }
}
