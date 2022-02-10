package algo0203;

import java.util.Comparator;

public class StuComp2 implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		return o1.compareTo(o2);
	}

}
