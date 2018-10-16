package ruixue.ocpkasi.core_java.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class OverlappingInputStream {
	
	public void overlappingInputStream() throws IOException {
		InputStream is = new FileInputStream("x.txt");
		InputStream bufferedInputStream = new BufferedInputStream(is);
		InputStream overlappedBufferedInputStream = new BufferedInputStream(bufferedInputStream);
	}

}
