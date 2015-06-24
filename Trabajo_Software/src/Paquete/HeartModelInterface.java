package Paquete;

public interface HeartModelInterface {
	int getHeartRate();
        int getContador();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}