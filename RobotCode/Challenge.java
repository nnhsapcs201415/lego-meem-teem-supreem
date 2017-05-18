import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
import lejos.robotics.navigation.DifferentialPilot;

public class Challenge implements FeatureListener, SensorPortListener {

    public DifferentialPilot pilot;
    public int MAX_DETECT = 80;
    
    public Challenge() {
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        SensorPort.S2.addSensorPortListener(this);
        RangeFeatureDetector fd = new RangeFeatureDetector(us, MAX_DETECT, 500);
        fd.addListener(this);
        this.pilot = new DifferentialPilot(5.315f, 5.355f, 11.4f, Motor.A, Motor.C, false);
    }
    
    public void featureDetected(Feature feature, FeatureDetector detector) {
        pilot.stop();
    }
    
    public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue) {
        LCD.drawString(" "+aNewValue,3,4);
        if (aNewValue >= 860) {
            pilot.quickStop();
            LCD.drawString(" "+aNewValue,2,4);
            pilot.rotate(180);
            pilot.forward();
        }
    }
    
    public void go() {
        pilot.forward();
    }
    
    public void go(double d) {
        pilot.travel(d, true);
    }
}