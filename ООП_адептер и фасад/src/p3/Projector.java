package p3;

public class Projector {
	String description;
	StreamingPlayer player;
	
	public Projector(String description, StreamingPlayer player) {
		this.description = description;
		this.player = player;
	}
 
	public void on() {
		System.out.println(description + " вкл");
	}
 
	public void off() {
		System.out.println(description + " выкл");
	}
 //широкоэкранный режим
	public void wideScreenMode() {
		System.out.println(description + " полноэкранный режим");
	}

	public void tvMode() {
		System.out.println(description + " стандартный режим");
	}
  
        public String toString() {
                return description;
        }
}
