package structural.flyweight.flyweightjava;

public class Demo {
   public static void main(String [] args) {

    SampleBullet bullet1 = new SampleBullet("blue", "metal", 0, 0);
    SampleBullet bullet2 = new SampleBullet("blue", "metal", 4, 8);
    bullet1.drawBullet();
    bullet2.drawBullet();
    
   } 
}
