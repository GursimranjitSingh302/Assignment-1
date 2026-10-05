/**
 * ACS-3913-770 - Assignment 1 F2026
 */

public class AdvancedCameraApp extends CameraApp{
    public AdvancedCameraApp(){
        setShareStrategy(new TextShare());
    }

    public void edit(){
        System.out.println("Advanced photo editing");
    }
}
