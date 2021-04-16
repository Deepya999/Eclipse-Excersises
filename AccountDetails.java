package com;

public class AccountDetails {
	double accno;
	String accname;
	String bankname;
	float ca;
	float da;
	float totalamount;
	public double getAccno() {
		return accno;
	}

	public void setAccno(double accno) {
		this.accno = accno;
	}

	public String getAccname() {
		return accname;
	}


	public void setAccname(String string) {
		this.accname = string;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public float getCa() {
		return ca;
	}

	public void setCa(float ca) {
		this.ca = ca;
	}

	public float getDa() {
		return da;
	}

	public void setDa(float da) {
		this.da = da;
	}
	public float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails obj=new AccountDetails();
		obj.setAccno(833383835);
		obj.setAccname("deepya");
		obj.setBankname("AXIS BANK");
		obj.setCa(200678);
		obj.setDa(10000);
		obj.setTotalamount(10987);
		System.out.println("ACCOUNT DETAILS are ");

		System.out.println("Accno is "+ obj.getAccno());
		System.out.println("Accname is "+ obj.getAccname());
		System.out.println("Bankname is "+ obj.getBankname());
		System.out.println("Credited amount is "+ obj.getCa());
		System.out.println("Debited amount is "+ obj.getDa());
		System.out.println("Total balance is "+ obj.getTotalamount());
	}

	
	

}
