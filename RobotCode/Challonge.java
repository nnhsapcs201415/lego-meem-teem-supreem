import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.Motor;
import lejos.nxt.Button;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.SensorPortListener;

public class Challonge implements FeatureListener, SensorPortListener {

    public DifferentialPilot pilot;
    public int MAX_DETECT = 100;

    public Challonge() {
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        RangeFeatureDetector fd = new RangeFeatureDetector(us, MAX_DETECT, 20);
        SensorPort.S2.addSensorPortListener(this);
        fd.addListener(this);
        this.pilot = new DifferentialPilot(5.315f, 5.355f, 11.4f, Motor.A, Motor.C, false);
    }

    public void circlePattern()
    {
        while(true)
        {
            pilot.steer(10);
        }
    } 

    public void featureDetected(Feature feature, FeatureDetector detector)
    {
        LCD.drawString("detected",3,4);
        pilot.forward();
        // use a world wide var to stop when 
    }

    public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue) {
        LCD.drawString(" "+aNewValue,3,4);
        if (aNewValue >= 860) {
            pilot.travel(-10);
            pilot.setRotateSpeed(100);
            pilot.rotateLeft();
        }
    }

    public void go() {
        pilot.forward();
    }

    public void go(double d) {
        pilot.travel(d, true);
    }
}