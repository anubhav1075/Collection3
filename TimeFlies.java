import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class TimeFlies {
    
	public static void main(String[] args) {
    Date d = new Date();
    DateFormat df = new SimpleDateFormat("dd MMM yyyy");
    String s=df.format(d);
    System.out.println(s);
	}    
}