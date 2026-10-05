/**
 * ACS-3913-770 - Assignment 1 F2026
 */

public class PartADriver{
    public static void main(String[] args){
        AdvancedCameraApp advanced = new AdvancedCameraApp();

        advanced.capture();
        advanced.save();
        advanced.share();
        advanced.edit();

        advanced.setShareStrategy(new InstagramShare());
        advanced.share();
    }
}
