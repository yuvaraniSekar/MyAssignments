package week4assign;

public class JavaConnection extends MySqlConnection{
	
	@Override
	public void connect() {
		System.out.println("Connect with database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect the database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute and update the database");
		
	}
public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
	}


}
