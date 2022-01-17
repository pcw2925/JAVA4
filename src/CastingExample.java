
public class CastingExample {
	// 강제 타입 변환 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue =440321;
		char charValue =(char) intValue;
		System.out.println(charValue);
		
		long longValue =500;
		intValue =(int) longValue;
		System.out.println(intValue);
		
		double doubleValue =3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
