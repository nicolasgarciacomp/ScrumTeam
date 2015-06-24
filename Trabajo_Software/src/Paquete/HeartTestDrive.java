package Paquete;
  
public class HeartTestDrive {
    
    public static void main (String[] args) {
        HeartModel heartModel=  HeartModel.getinstancia();
        ControllerInterface model = new HeartController(heartModel);
    }
}