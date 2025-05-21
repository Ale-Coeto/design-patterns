package structural.flyweight.flyweightjava;

import java.util.ArrayList;
import java.util.Collection;

public class ParticleFactory {
   private static ArrayList<ParticleFlyweight> flyweightCollection = new ArrayList<>(); 

   public static ParticleFlyweight getFlyweight(String color, String texture) {

    for (ParticleFlyweight flyweight : flyweightCollection) {
        if (flyweight.getColor().equals(color) && flyweight.getTexture().equals(texture)) {
            System.out.println("Re-using flyweight");
            return flyweight;
        }
    }

    System.out.println("Making new flyweight");
    ParticleFlyweight particleFlyweight = new ParticleFlyweight(color, texture);
    flyweightCollection.add(particleFlyweight);
    return particleFlyweight;
        
   }
}
