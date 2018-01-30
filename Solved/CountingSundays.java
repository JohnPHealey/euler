package Solved;

/**
* Solution to Problem #19 on Project Euler
* Calculates how many Sundays fell on the first of the month in the twentieth century
* @author: John Healey, 2016-08-25
*/
public class CountingSundays {
	public static void main(String [] args) {
		int[] monthIncrements = { 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3 };
		int year = 1900;
		int startDay = 2;
		int total = 0;
		while (year < 2001) {
			if (year == 2000) {
				monthIncrements[1] = 1;
				for (int i = 0; i < monthIncrements.length - 1; i++) {
					startDay += monthIncrements[i];
					if (startDay > 7) {
						startDay -= 7;
					}
					if (startDay == 1) {
						total++;
					}
					System.out.println(startDay);
				}
			}
			else {
				if (isLeapYear(year)) {
					monthIncrements[1] = 1;
				}
				else {
					monthIncrements[1] = 0;
				}
				for (int i = 0; i < monthIncrements.length; i++) {
					startDay += monthIncrements[i];
					if (startDay > 7) {
						startDay -= 7;
					}
					if (startDay == 1 && year > 1900) {
						total++;
					}
					System.out.println(startDay);
				}
			}
			year++;
		}
		System.out.println(isLeapYear(2000));
		System.out.println(total);
	}
	
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
				return false;
			}
			return true;
		}
		else {
			return false;
		}
	}
}
