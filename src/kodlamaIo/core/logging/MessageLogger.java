package kodlamaIo.core.logging;

public class MessageLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Mesaj ile loglandı: " + data);
		
	}

}
