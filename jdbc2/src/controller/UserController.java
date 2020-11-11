package controller;

import java.util.Scanner;

import Action.Action;

public class UserController {
	public void processRequest(Action action, Scanner sc) {
		try {
			action.execute(sc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
