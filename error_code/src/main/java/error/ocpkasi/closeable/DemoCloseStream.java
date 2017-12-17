package error.ocpkasi.closeable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DemoCloseStream {

	public static void main(String[] args) throws IOException {
		Writer w = null;
		BufferedWriter bw = null;
		try {
			w = new FileWriter("couch.txt");
			bw = new BufferedWriter(w);
		} finally {
			bw.close();
			w.flush();
		}

	}

}
