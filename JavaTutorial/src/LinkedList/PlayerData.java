package LinkedList;

import java.util.ArrayList;

public class PlayerData {

	public static void main(String[] args) {
		
		Players play = new Players();
		
		play.setPlayerName("Sachin");
		play.setPlayerAge(45);
		
		Players play2 = new Players();
		
		play2.setPlayerName("Surya");
		play2.setPlayerAge(29);
		
		Players play3 = new Players();
		
		play3.setPlayerName("Dhoni");
		play3.setPlayerAge(35);
		
		ArrayList <Players> obj = new ArrayList<Players>();
		
		obj.add(play);
		obj.add(play2);
		obj.add(play3);
		
		for (Players xyz: obj) {
			int age = xyz.getAge();
			if(age >30) {
				String ans = xyz.getPlayerName();
				System.out.println(ans);
			}
		}

	}

}
