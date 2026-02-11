package Tutorial11;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo3 {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();

		arr.add(100);
		arr.add("cucumber");
		arr.add("selenium");
		arr.add(null);
		arr.add("ha");
		arr.add(true);
		arr.add(45.6f);

		Iterator it = arr.iterator();

		while (it.hasNext()) {
			Object value = it.next();

			System.out.println(value);
		}

	}

}
