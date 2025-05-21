package structural.proxy.proxyjava;

public class ProxyImage implements Image{

    private RealImage realImage = null;

    public String getImage() {
        if (validAccess()) {
            if (realImage != null) {
                return realImage.getImage();
            } else {
                System.out.println("Now loading the real image.");
                realImage = new RealImage();
                return realImage.getImage();
            }
        }
         
        return null;
    }

    public int getSize() {
        if (validAccess()) {
            if (realImage != null) {
                return realImage.getSize();
            } else {
                System.out.println("Now creating the image.");
                realImage = new RealImage();
                return realImage.getSize();
            }
        }
        return 0;
    }

    public boolean validAccess() {
        return true;
    }
    
}
