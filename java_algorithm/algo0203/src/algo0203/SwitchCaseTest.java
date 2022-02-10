package algo0203;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		// byte short       int char String 만 됩니다.
		int a=0;
		
		long la = 2L + Integer.MAX_VALUE;
		
		byte bb=10;
		byte cc=20;
		byte dd=10+20;
		byte ee=(byte)(bb+20);
		System.out.println(ee);
		
		char ca='A';
		System.out.println((char)(ca+3));
		System.out.println('8'-'0');
		
		boolean bas=true;
		
		switch (a/10*10) { // fallthrough : 브레이크없으면 쭉떨어진다.

		//default: System.out.println("default"); break;
		case 10:
		case 20:
		case 30:
		case 40:
		case 50: System.out.println("F"); break;
		case 60: System.out.println("D"); break;
		case 70: System.out.println("C"); break;
		case 80: System.out.println("B"); break;
		case 90:
		case 100: System.out.println("A"); break;
		default: System.out.println("default"); break;

		}
	}

}
