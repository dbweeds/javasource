package employee.action;

import java.util.Scanner;

public interface Action {
	public void excute(Scanner sc) throws Exception;
	public boolean loginexcute(Scanner sc) throws Exception;
}
