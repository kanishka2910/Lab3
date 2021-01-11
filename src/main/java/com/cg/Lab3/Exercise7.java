/*Create a method to accept date and print the duration in days, months and years
with regards to current system date.
* @author-L.S.Kanishka*/

package com.cg.Lab3;

import java.time.*;
public class Exercise7 {

	public static void calcDifference(LocalDate current) {
		LocalDate now = LocalDate.now();
		 
        Period diff = Period.between(current, now);
 
     System.out.printf("Difference is %d years, %d months and %d days ", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
		
	}
	public static void main(String[] args)
    {
        LocalDate present = LocalDate.of(2017, 01, 01);
        calcDifference(present);
        
  }
}