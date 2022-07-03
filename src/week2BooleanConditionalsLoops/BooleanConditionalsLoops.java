package week2BooleanConditionalsLoops;

public class BooleanConditionalsLoops {
	
	public static void main(String [] args) {
		int age = 14;
		System.out.println(age >= 16);
		age = 16;
		System.out.println(age >= 16);
		
		boolean hasLicense = false;
		if(age >= 16 && hasLicense)
			System.out.println("You can drive.");
		else
			System.out.println("You cannot drive.");
		
		double costOfMilk = 2.49;
		int thirstLevel = 6;
		
		if(costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk please!");
		}
		else {
			System.out.println("No thanks :)");
		}
		
		int numberOfCookies = 15;
		int numberOfChildren = 4;
		
		if(numberOfCookies % numberOfChildren == 0) {
			System.out.println("Sad face");
		}
		else if(numberOfCookies % numberOfChildren < 2) {
			System.out.println("Yes!");
		}
		else if(numberOfCookies % numberOfChildren < 5) {
			System.out.println("Whoohooo!");
		}
		else if(numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		}
		
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = 0.10;
				break;
			case "GOLD":
				loyaltyMemberDiscount = 0.15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = 0.25;
				break;
			default:
				loyaltyMemberDiscount = 0.0;
				break;	
		}
		System.out.println("Your member discount is: " + loyaltyMemberDiscount);
		
		double billTotal = 640.50;
		double adjustedTotal = billTotal - (billTotal * loyaltyMemberDiscount);
		System.out.println("Your total before the discount is: " + billTotal);
		System.out.println("Your loyalty discount is: " + loyaltyMemberDiscount + "%, which makes your discount: " + billTotal * loyaltyMemberDiscount);
		System.out.println("You grant total is: " + adjustedTotal);
		if(adjustedTotal > 500 && loyaltyMemberStatus == "SILVER") {
			loyaltyMemberStatus = "GOLD";
		}
		else if(adjustedTotal > 500 && loyaltyMemberStatus == "GOLD") {
			loyaltyMemberStatus = "PLATINUM";
		}
		System.out.println("You loyalty member status level is: " + loyaltyMemberStatus);
		
		String username = "Tommy123";
		String password = "12345";
		
		if(username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("Login successful.");
		}
		else {
			System.out.println("Access denied.");
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		for(int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " EVEN");
			}
			else if(i % 2 == 1) {
				System.out.println(i + " ODD");
			}
		}
		int i = 100;
		while(i > 0) {
			System.out.println("The current number is: " + i + ". When divided by 3, the remainder is: " + i % 3);
			i--;
		}
	}
}