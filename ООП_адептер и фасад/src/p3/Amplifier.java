package p3;

//Усилитель
public class Amplifier {
	String description;
	Tuner tuner;
	StreamingPlayer player;
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " вкл");
	}
 
	public void off() {
		System.out.println(description + " выкл");
	}

	//установить стереозвук
	public void setStereoSound() {
		System.out.println(description + " стерео вкл");
	}

	//установить объемный звук
	public void setSurroundSound() {
		System.out.println(description + " объмный звук");
	}

	//установить громкость
	public void setVolume(int level) {
		System.out.println(description + " громкость " + level);
	}

	public void setTuner(Tuner tuner) {
		System.out.println(description + " setting tuner to " + tuner);
		this.tuner = tuner;
	}

	//потоковый плеер
	public void setStreamingPlayer(StreamingPlayer player) {
		System.out.println(description + " потоковый плеер с " + player);
		this.player = player;
	}
 
	public String toString() {
		return description;
	}
}
