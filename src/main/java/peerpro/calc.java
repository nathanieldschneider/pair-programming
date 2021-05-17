package peerpro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class calc {
public String calculator(String s) {
	StringBuilder sb = new StringBuilder();
	List<Integer> intlist = intParser(s);
	int lowest = intlist.get(0);
	int middle = intlist.get(1);
	int highest = intlist.get(2);
	
	if(lowest * middle == highest) {
		sb.append(lowest + "*" + middle + "=" + highest + "\n");
		sb.append(highest + "/" + middle + "=" + lowest + "\n");
		sb.append(highest + "/" + lowest + "=" + middle + "\n");
		sb.append(middle + "*" + lowest + "=" + highest + "\n");
		
		
	}
	
	if(lowest + middle == highest) {
		sb.append(lowest + "+" + middle + "=" + highest + "\n");
		sb.append(highest + "-" + middle + "=" + lowest + "\n");
		sb.append(highest + "-" + lowest + "=" + middle + "\n");
		sb.append(middle + "+" + lowest + "=" + highest + "\n");
		
		
	}
	
	return sb.toString();
	}
public List<Integer> intParser(String s) {
	
	String snospace = s.replaceAll("\s+","");
	String[] strings = snospace.split(",");
	List<Integer> l = new ArrayList<Integer>();
	
	for(String t : strings) {
		l.add(Integer.parseInt(t));
		
	}
	Collections.sort(l);
	return l;
}
}
