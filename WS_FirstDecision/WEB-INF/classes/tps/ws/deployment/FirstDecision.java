package tps.ws.deployment;

public class FirstDecision {
	public String decision(int rentalPrice, int salary){
		if (salary < rentalPrice*2) {
			return "Refused";
			}
		else {
			return "Accepted";	
			}
	}	
}