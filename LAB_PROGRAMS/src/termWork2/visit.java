package termWork2;
import java.time.LocalDate;
public class visit {
	Customer customer;
	LocalDate date;
	double serviceExpenses;
	double productExpenses;
	
	public visit(Customer c, String name,LocalDate date) {
		this.date=date;
		customer=c;
		customer.name=name;
	}
	public void setserviceExpenses(double serviceExpenses) {
		this.serviceExpenses=serviceExpenses;
	}
	public double getserviceExpenses() {
		return serviceExpenses;
	}
	public void setProductExpenses(double productExpenses) {
		this.productExpenses=productExpenses;
	}
	public double getproductExpenses() {
		return productExpenses;
	}
	public double gettotalExpenses() {
		return serviceExpenses+productExpenses;
	}
	public String toString() {
		return customer.toString()
				+"	DATE OF VISIT: "+date
				+"	SERVICE EXPENSES: "+serviceExpenses
				+"	PRODUCT EXPENSES: "+productExpenses;
	}

}
