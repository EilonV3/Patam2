package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface ClientHandler {
	
	public void handleClient(InputStream inFromClient, OutputStream outToClient);
	
}
