package testerClasses;

import java.util.Comparator;

public class StringComparator1 implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return arg1.compareTo(arg0);
	}

}
