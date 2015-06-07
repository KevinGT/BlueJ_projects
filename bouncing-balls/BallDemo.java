import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Random;

/**
 * Class BallDemo - provides two short demonstrations showing how to use the 
 * Canvas class. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private BouncingBall[] ballArray;
    private int ballNumber;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", 600, 500);
        myCanvas.setVisible(true);
    }
 
    /**
     * Demonstrate some of the drawing operations that are
     * available on a Canvas object.
     */
    public void drawDemo()
    {
        myCanvas.setFont(new Font("helvetica", Font.BOLD, 14));
        myCanvas.setForegroundColor(Color.red);

        myCanvas.drawString("We can draw text, ...", 20, 30);
        myCanvas.wait(1000);

        myCanvas.setForegroundColor(Color.black);
        myCanvas.drawString("...draw lines...", 60, 60);
        myCanvas.wait(500);
        myCanvas.setForegroundColor(Color.gray);
        myCanvas.drawLine(200, 20, 300, 50);
        myCanvas.wait(500);
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(220, 100, 370, 40);
        myCanvas.wait(500);
        myCanvas.setForegroundColor(Color.green);
        myCanvas.drawLine(290, 10, 320, 120);
        myCanvas.wait(1000);

        myCanvas.setForegroundColor(Color.gray);
        myCanvas.drawString("...and shapes!", 110, 90);

        myCanvas.setForegroundColor(Color.red);

        // the shape to draw and move
        int xPos = 10;
        Rectangle rect = new Rectangle(xPos, 150, 30, 20);

        // move the rectangle across the screen
        for(int i = 0; i < 200; i ++) {
            myCanvas.fill(rect);
            myCanvas.wait(10);
            myCanvas.erase(rect);
            xPos++;
            rect.setLocation(xPos, 150);
        }
        // at the end of the move, draw once more so that it remains visible
        myCanvas.fill(rect);
    }

    /**
     * Simulate two bouncing balls
     */
    public void bounce(int ballNumber)
    {
        // example array construction
        // Student[] studentArray = new Student[7];
        BouncingBall[] ballArray = new BouncingBall[ballNumber];
        int i;
        int ground = 400;   // position of the ground line
        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.drawLine(50, ground, 550, ground);
        
        // generating random numbers here
        // want to generate 2 random numbers for each new BallArray object
        

        
        // create and show the balls
        for(i = 0;i < ballNumber;i++)
        {
            Random rand = new Random();
            int rNumber = rand.nextInt(300);
            int xAxis = rNumber;
            int rNumber1 = rand.nextInt(400);
            int yAxis = rNumber1;
            int rNumber2 = rand.nextInt(32);
            int size = rNumber2;
            ballArray[i] = new BouncingBall(xAxis, yAxis, size, Color.blue, ground, myCanvas);
            ballArray[i].draw();
        }
        
        // make them bounce
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            for(i = 0;i < ballNumber;i++)
            {
                ballArray[i].move();
            }
            
            // stop once ball has travelled a certain distance on x axis
            if(ballArray[0].getXPosition() >= 550) {
                finished = true;
                for(i=0;i < ballNumber; i++)
                {
                    ballArray[i].erase();
                }
            }
        }
    }
}