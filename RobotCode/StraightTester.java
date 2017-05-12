import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

public class StraightTester
{
    DifferentialPilot pilot;

    public void  straight(float length)
    {
        pilot.travel(length);
    }

    public static void main(String[] args)
    {
        StraightTester sq = new StraightTester();
        sq.pilot = new DifferentialPilot(5.315f, 5.355f, 11.4f, Motor.A, Motor.C, false); //left slightly stronger .05
        sq.straight(150);
    }
}