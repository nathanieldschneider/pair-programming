package peerpro;

public class Placement {
	
public static void main (String[]args) {
	System.out.println(dogs(7));
}
public static String dogs(int x) {
	
	
	StringBuilder sb = new StringBuilder();
	
	
	for(int i = 1; i < 101; i++) {
		if(i == x) {
			continue;
		}
		sb.append(placer(i) + ", ");
	}
	return sb.toString();
	
}
public static String placer(int y) {
	StringBuilder sb = new StringBuilder();
	int s = y%10;
	switch (s) {
	case 1: 
		sb.append(y + "st");
		break;
	case 2:
		sb.append(y + "nd");
		break;
	case 3: 
		sb.append(y + "rd");
		break;
		
	default:
		sb.append(y + "th");
		break;
	}
	return sb.toString();
}
 
}