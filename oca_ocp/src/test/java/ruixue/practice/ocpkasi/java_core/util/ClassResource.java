package ruixue.practice.ocpkasi.java_core.util;

import java.util.ListResourceBundle;

public class ClassResource extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{"name", "Jesus"}	
		};
	}

}
