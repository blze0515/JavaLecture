package chap19_enum;

import chap19_enum.enums.Season;

public class _07_EnumEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season season = Season.SUMMER;
		
		season.printSeasonMonth();
		
		season = Season.FALL;
		
		season.printSeasonMonth();
	}

}
