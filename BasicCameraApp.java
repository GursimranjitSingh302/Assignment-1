/**
 * ACS-3913-770 - Assignment 1 F2026
 */
 
public class BasicCameraApp extends CameraApp{
    public BasicCameraApp(){
        setShareStrategy(new EmailShare());
    }

    public void edit(){
        System.out.println("Basic photo editing");
    }
}
