package algo0203;

import java.util.Comparator;

public class StuComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int id=o1.id.compareTo(o2.id);// 문자열 우선순위 Lexico
		if(id!=0) {
			return id;  // 음수 또는 양수
		}else {// 0이면 이름으로 우선순위
			return o1.name.compareTo(o2.name);
		}
	}

}