import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Programmers {
	    public static String solution(String s) {
	        List<Integer> list = new ArrayList<>();
	        StringTokenizer st = new StringTokenizer(s);
	        while(st.hasMoreTokens()) {
	            list.add(Integer.parseInt(st.nextToken()));
	        }
	        return Collections.min(list) + " " + Collections.max(list);
	    }

	public static void main(String[] args) {
		System.out.println(solution("-2 1 2 3 4"));
	}

}
