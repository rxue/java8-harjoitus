package ruixue.practice.ocpkasi.core_java.util;

import java.util.ListResourceBundle;

public class ClassResource extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{"name", "Jesus"}	
		};
	}

}
