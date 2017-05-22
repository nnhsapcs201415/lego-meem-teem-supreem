import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.*;

public class Challonge implements FeatureListener, SensorPortListener {

    public DifferentialPilot pilot;
    public final int MAX_DETECT = 100;
    
    /*
     * 0 = in box
     * 1 = looking for stuff
     * 2 = going forward
     * 3 = hit black line
     * 
     */
    public byte state;

    public Challonge() {
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        RangeFeatureDetector fd = new RangeFeatureDetector(us, MAX_DETECT, 20);
        SensorPort.S2.addSensorPortListener(this);
        fd.addListener(this);
        this.pilot = new DifferentialPilot(5.315f, 5.355f, 11.4f, Motor.A, Motor.C, false);
        this.pilot.setRotateSpeed(100);
        this.state = 0;
    }

    public void circlePattern()
    {
        while(true)
        {
            pilot.steer(10);
        }
    } 
    
    public void run() {
    }
    
    public void featureDetected(Feature feature, FeatureDetector detector)
    {
        LCD.drawString("detected",3,4);
        if (this.state == 0 && feature.getRangeReading().getRange() < 20) {
            pilot.rotate(20);
            pilot.travel(-10);
        } else if (this.state == 0) {
            this.state = 1;
        } else if (this.state == 1 && feature.getRangeReading().getRange() < 50) {
            this.state = 2;
            pilot.travel(500, true);
        }
        // use a world wide var to stop when 
    }

    public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue) {
        LCD.drawString(" "+aNewValue,3,4);
        if (aNewValue >= 860) {
            this.state = 3;
            pilot.travel(-10);
            pilot.rotate(20);
            this.state = 1;
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