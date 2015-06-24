package djview;
  
public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = HeartModel.getInstance();
        @SuppressWarnings("unused")
		ControllerInterface model = new HeartController(heartModel);
    }
}
