package termWork2;

public class discountRate {
	public static double serviceDiscountPremium=0.2;
	public static double serviceDiscountGold=0.15;
	public static double serviceDiscountSilver=0.1;
	public static double productDiscountMember=0.1;
	
	public double getserviceDiscountRate(String type) {
		switch(type) {
		case "Premium":return serviceDiscountPremium;
		case "Gold":return serviceDiscountGold;
		case "Silver":return serviceDiscountSilver;
		default:return 0;
		}
	}
	public double getproductDiscountRate(String type) {
		switch(type) {
			case "Premium":
			case "Gold":
			case "Silver":return productDiscountMember;
			default:return 0;
		}
	}
		
}
	
	

