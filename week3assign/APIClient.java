package week3.assign;

public class APIClient {
	
	public void  sendRequest(String endPoint) {
		System.out.println(endPoint);
	}
	
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println(endPoint + " " + requestBody + " request is " + requestStatus );
	}

	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("End request");
		api.sendRequest("End request", "request objective", true);

	}

}
