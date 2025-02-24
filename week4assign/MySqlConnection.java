package week4assign;

public abstract class MySqlConnection implements DatabaseConnection{
	public void executeQuery() {
		System.out.println("execute the sql querry");
	}
}
