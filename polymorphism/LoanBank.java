package polymorphism;
class Bank{
	int loanAmount() {
		return 0;
	}
}
class IOB extends Bank{
	int loanAmount() {
		return 200000;
	}
}
class HDFC extends Bank{
	int loanAmount() {
		return 500000;
	}
}
class SIB extends Bank{
	int loanAmount() {
		return 700000;
	}
}
public class LoanBank {
	public static void main(String[] args) {
//      Bank b;
//      b=new HDFC();
		Bank b=new HDFC();
      
      int loan=b.loanAmount();
      System.out.println(loan);
	}
}
