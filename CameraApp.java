/**
 * ACS-3913-770 - Assignment 1 F2026
 */

public abstract class CameraApp{
    private ShareStrategy shareStrategy;

    public CameraApp(){
    }

    public abstract void edit();

    public void capture(){
        System.out.println("Capture a photo");
    }

    public void save(){
        System.out.println("Save a photo");
    }

    public void share(){
        shareStrategy.share();
    }

    public void setShareStrategy(ShareStrategy shareStrategy){
        this.shareStrategy = shareStrategy;
    }
}
