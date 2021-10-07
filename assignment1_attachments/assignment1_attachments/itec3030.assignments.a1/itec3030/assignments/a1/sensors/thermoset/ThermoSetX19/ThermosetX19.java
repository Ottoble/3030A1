package itec3030.assignments.a1.sensors.thermoset.ThermoSetX19;

import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Thermostat;

public class ThermosetX19 implements Thermostat {

    //FrontEnd access$0 returns thermostat but it returns null 
    //so newTemp can't be called


    private String ID = null;
    private FrontEnd f;
    private ControllerInterface c = null;
    private boolean enabled;
    private int desiredTemp;

    public ThermosetX19() {
        f = new FrontEnd(this);
        f.pack();
        f.setVisible(true);
    }

    public itec3030.smarthome.standards.ControllerInterface getController() {
        return c;
    }

    public void setController(itec3030.smarthome.standards.ControllerInterface arg0) {
        this.c = arg0;
    }

    public java.lang.String getID() {
        return ID;
    }

    public void setID(java.lang.String arg0) {
        this.ID = arg0;
    }

    public void enable() {
        if(!enabled){
            enabled = true;
        }
    }

    public void disable() {
        if(enabled){
            enabled = false;
        }
    }

    public boolean enabled() {
        return enabled;
    }
//only need to get desired temp from slider
//Probably need to use access$1 to get the jlabel with the slider and take the int
    public int getReading() {
        System.out.println(desiredTemp);
        return desiredTemp;
    }

    public void newTemperature(int arg0) {
        desiredTemp = arg0;

    }
}
