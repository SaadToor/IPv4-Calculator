package Saad.Toor.IPv4;

public class Main {
	
	public static void main(String args[]){
		String fileName = "IPv4.txt";
		String num;
		String input;
		IPv4 ipv4 = new IPv4(fileName);
		
		System.out.println();
		System.out.println("What will you like to do? \n(Please select a number accordingly)");
		System.out.println("1.Find the amount of binary bits required to define the amount of subnets!");
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		input = sc.nextLine();
		
		
		if(input.matches("1")){
			System.out.println("How many subnets will you like defined?");
			num = sc.nextLine();
			ipv4.subnetCalculation(Integer.valueOf(num).intValue());
			System.out.println(ipv4.getBinary() + " binary digits are required to define " + num + " subnets");
		}
	}
}
