package structural.proxy.proxyjava;

public class RealImage implements Image {
   private String image = "VERY_HEAVY_IMAGE";
   
   public String getImage() {
    return image;
   }

   public int getSize() {
    return image.length();
   }
}
