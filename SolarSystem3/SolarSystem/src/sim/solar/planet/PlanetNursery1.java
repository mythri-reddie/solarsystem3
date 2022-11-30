package sim.solar.planet;

import java.util.ArrayList; 

public class PlanetNursery1 implements NurseryInterface {
  
     
    public String GetAuthor () {
     return "name1"; 
    }
    
    public String GetTitle () {
      return "Title1"; 
    }     
     
    public ArrayList<PlanetInterface> Produce () {
       int angle;
      int orbit;
     int increment;
   int green;
     int blue; 
int planetSize;
 int red;

        ArrayList<PlanetInterface> planetList = new ArrayList<>();
        angle = 0; 
        int numPlanets = 90;  // sets number of planets created and range of i 
        for (int i=0; i<numPlanets; i++) {
            angle    = angle + 5;   // controls offset between planets
            orbit     =  240;   // controls distance to center of solar system
            increment  = 1;         // controls speed of planet rotation
            planetSize  = 10;       // size of the planet
            red      = 240 - 2*i;   // planet color 
            green    = 240 - 2*i;   // planet color
            blue     = 60  + 2*i;   // planet color
            planetList.add(new Planet (angle, orbit, increment, planetSize, red, green, blue));
         }
         
         return planetList; 
    }
}

