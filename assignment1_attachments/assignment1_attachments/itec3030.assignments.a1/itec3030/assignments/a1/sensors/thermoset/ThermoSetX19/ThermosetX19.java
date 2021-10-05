package itec3030.assignments.a1.sensors.thermoset.ThermoSetX19;

import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.Thermostat;

public class ThermosetX19 implements Thermostat {

    private String ID = null;
    private Thermostat th = null;

    public ThermosetX19() {
        FrontEnd f = new FrontEnd(th);
        f.pack();
        f.setVisible(true);
    }

    public itec3030.smarthome.standards.ControllerInterface getController() {
        return null;
    }

    public void setController(itec3030.smarthome.standards.ControllerInterface arg0) {

    }

    public java.lang.String getID() {
        return ID;
    }

    public void setID(java.lang.String arg0) {

    }

    public void enable() {

    }

    public void disable() {

    }

    public boolean enabled() {
        return false;
    }

    public int getReading() {
        return 0;
    }

    public void newTemperature(int arg0) {

    }
}
