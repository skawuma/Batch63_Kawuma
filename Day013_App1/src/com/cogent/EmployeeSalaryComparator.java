package com.cogent;

import java.util.Comparator;

/**
 * @author samuelkawuma
 *Oct 5, 2022
 *9:00:07 PM
 */

public class EmployeeSalaryComparator implements Comparator<EmployeeDirectory> {

	@Override
	public int compare(EmployeeDirectory o1, EmployeeDirectory o2) {
if (o1.getEmpSal()==o2.getEmpSal())
		return 0;

	else if(o1.getEmpSal()>o2.getEmpSal())
		return 1;
	else
		return-1;
	
}

}