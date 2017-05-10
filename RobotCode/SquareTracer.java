import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

public class SquareTracer
{
    public DifferentialPilot pilot;
    
    public void  drawSquare(float length)
    {
        for (int i = 0; i < 4 ; i++)
        {
            pilot.travel(length);
            pilot.rotate(90);                 
        }
    }
    
    public static void main(String[] args)
    {
        SquareTracer sq = new SquareTracer();
        sq.pilot = new DifferentialPilot(5.45f, 5.6f, 11.4f, Motor.A, Motor.C, false);
        sq.drawSquare(23);
    }
}