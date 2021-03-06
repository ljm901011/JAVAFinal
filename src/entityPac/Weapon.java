package entityPac;
import configPac.Config;
import worldMapPac.WorldMap;

public class Weapon extends Entity {

	public Weapon(int i, int j, WorldMap map){
		icon = 'W';
		row = i;
		col = j;
		this.map = map;
	}
	public void inputCommand(){
		System.out.print(Config.weaponMenu);
		String s = Config.scan.nextLine();
		s = s.toUpperCase();
		switch(s){
		case Config.GET: case Config.sGET:
			this.map.player.increaseAttackPower(30); 
			this.map.player.setWeapon();
			this.map.arrayMap[row][col] = null;
			System.out.println(Config.weaponGet);
			break;
		case Config.NOTHING: case Config.sNOTHING: break;
		default: System.out.println(Config.inputError); break;
		}
	}

}
