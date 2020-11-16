package employee.controller;

import java.util.Scanner;

import employee.action.Action;

public class EmployeeController {
	public void processRequest(Action action,Scanner sc) {
		try {
			action.excute(sc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
