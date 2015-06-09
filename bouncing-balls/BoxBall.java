import java.awt.*;
import java.awt.geom.*;

/**
 * Class BoxBall - creates a graphical ball that will bounce around inside a box so 
 * that the balls always stay inside the box.
 * 
 * the position and speed of the balls will also be determined by the BoxBall Class
 *
 * This movement can be initiated by repeated calls to the "move" method.
 * 
 * @author Bruce Quig
 * @author Michael Kolling (mik)
 * @author David J. Barnes
 *
 * @version 2008.03.30
 * 
 * @author Kevin Talbot (code adapted from authors as listed above)
 * @version 8th June 2015
 */
public class BoxBall
{
    // 
    //private static final int GRAVITY = 3;  // effect of gravity

    //private int ballDegradation = 2;
    //private Ellipse2D.Double circle;
    //private Color color;
    //private int diameter;
    //private int xPosition;
    //private int yPosition;
    //private final int groundPosition;      // y position of ground
    //private Canvas canvas;
    //private int ySpeed = 1;                // initial downward speed
    
    // previous variables
    private Ellipse2D.Double circle;
    private Color color;
    private int diameter;
    private int xPosition;
    private int yPosition;
    private Canvas canvas;
    // new variables set by Kevin
    private int xAxisWidth;
    private int yAxisHeight;
    private int ySpeed = 1;
    private int xSpeed = 1;
    // variable to understand position - might need to be a method
    private final int position;
    


    /**
     * Constructor for objects of class BoxBall
     *
     * @param xPos  the horizontal coordinate of the ball
     * @param yPos  the vertical coordinate of the ball
     * @param ballDiameter  the diameter (in pixels) of the ball
     * @param ballColor  the color of the ball
     * @param wallPos  the position of the rectangle walls (where the ball will bounce)
     * @param drawingCanvas  the canvas to draw this ball on
     * 
     */
    public BoxBall(int xPos, int yPos, int ballDiameter, Color ballColor,
                   int xWidth, int yHeight, Canvas drawingCanvas)
    {
        // initialise instance variables
        xPosition = xPos; // starting position horizontal axis
        yPosition = yPos; // starting position vertical axis
        diameter = ballDiameter; // ball diameter
        color = ballColor; // ball colour
        xAxisWidth = xWidth; // width of rectangle
        yAxisHeight = yHeight; // height of rectangle
        
        // need to think about how to calculate ball position so it bounces off walls
        wallPos = (xPosition, yPosition);
        
        // 
        canvas = drawingCanvas;
      
        // thinking about where I implement ball speed - am thinking in the move method() below
        
    }

    /**
     * Draw this ball at its current position onto the canvas.
     **/
    public void draw()
    {
        canvas.setForegroundColor(color);
        canvas.fillCircle(xPosition, yPosition, diameter);
    }

    /**
     * Erase this ball at its current position.
     **/
    public void erase()
    {
        canvas.eraseCircle(xPosition, yPosition, diameter);
    }    

    /**
     * Move this ball according to its position and speed and redraw.
     **/
    public void move()
    {
        // remove from canvas at the current position
        erase();
            
        // compute new position
        // ySpeed += GRAVITY; // NO GRAVITY IN THE BOX
        yPosition += ySpeed;
        xPosition +=2;

        // check if it has hit the ground
        if(yPosition >= (groundPosition - diameter) && ySpeed > 0) {
            yPosition = (int)(groundPosition - diameter);
            ySpeed = -ySpeed + ballDegradation; 
        }

        // draw again at new position
        draw();
    }    

    /**
     * return the horizontal position of this ball
     */
    public int getXPosition()
    {
        return xPosition;
    }

    /**
     * return the vertical position of this ball
     */
    public int getYPosition()
    {
        return yPosition;
    }
}
