package main;

import java.awt.Rectangle;

/**
 * The <code>RoadBounds</code> class contains all
 * of the roads' bounds. It is made up of multiple invisible
 * <code>Rectangle</code>'s located at all locations where the 
 * car should not be able to drive over.
 * 
 * @author Joshua Bautista
 * @version 1/14/2020
 */
public class RoadBounds {

    /**
     * An 2D int array that contains each <code>Rectangle</code> road bound's
     * <em>x-position, y-position, width, and height.</em>
     */
    private final int[][] roadBoundsAttributes = {{439, 305, 231, 87}, {719, 429, 108, 166}, {541, 426, 129, 69}, {541, 528, 119, 67},
                                            {155, 192, 387, 53}, {155, 85, 386, 63}, {271, 443, 219, 51}, {267, 529, 223, 57}, 
                                            {720, 632, 106, 149}, {877, 534, 155, 119}, {877, 690, 157, 90}, {1084, 544, 263, 118},
                                            {825, 746, 50, 35}, {1083, 689, 270, 92}, {881, 373, 267, 122}, {1, 631, 668, 146},
                                            {671, 758, 48, 20}, {1035, 763, 48, 17}, {1355, 766, 50, 13}, {1397, 524, 183, 255}, 
                                            {1389, 505, 191, 42}, {1207, 453, 374, 52}, {1210, 368, 370, 83}, {1375, 83, 205, 272}, 
                                            {1199, 194, 112, 125}, {819, 190, 327, 133}, {719, 192, 106, 196}, {593, 193, 128, 76}, 
                                            {1, 528, 218, 99}, {2, 405, 217, 83}, {1, 301, 388, 92}, {1, 491, 13, 42},
                                            {1, 190, 105, 106}, {1, 155, 18, 37}, {1, 1, 103, 154}, {106, 2, 485, 36},
                                            {591, 4, 730, 145}, {1321, 3, 201, 40}, {1487, 40, 64, 54}};
    
    /**
     * A <code>Rectangle</code> array that contains all of the 
     * road bound <code>Rectangle</code> object's.
     */
    private Rectangle[] bounds;
    
    /**
     * Initializes and creates all of the road bounds.
     */
    public RoadBounds() {
        bounds = new Rectangle[39];
        createRoadBounds();
    }

    /**
     * Creates all of the road bounds.
     */
    private void createRoadBounds() {
        for (int i = 0; i < 39; i++) {
            int x = roadBoundsAttributes[i][0];
            int y = roadBoundsAttributes[i][1];
            int width = roadBoundsAttributes[i][2];
            int height = roadBoundsAttributes[i][3];
            bounds[i] = new Rectangle(x, y, width, height);
        }
    }
    
    /**
     * Returns the <code>bounds</code> property that is a
     * <code>Rectangle</code> array that contains each of the 
     * road bound rectangles.
     * 
     * @return a <code>Rectangle</code> array that represent
     * each of the road's bounds.
     */
    public Rectangle[] getBounds() {
        return bounds;
    }
}
