package com.samplepojo;

public class MainClass {

	public void employeeData() {
		Employee e = new Employee();
		e.setEmpid(1);
		e.setEmpname("Haggu");
		e.setDept("SalesMan");
		e.setSalary(30000);
		e.setCity("Sangamner");

		System.out.println(
				e.getEmpid() + " " + e.getEmpname() + " " + e.getSalary() + " " + e.getDept() + " " + e.getCity());
	}

	public void patientData() {
		Patient p = new Patient();
		p.setPat_id(1);
		p.setPat_name("Suresh");
		p.setAge(42);
		p.setHosp_name("Dinanath Hospital");
		p.setReason("Cancer");

		System.out.println(p.getPat_id() + " " + p.getPat_name() + " " + p.getAge() + " " + p.getHosp_name() + " "
				+ p.getReason());
	}

	public void productData() {
		Product pp = new Product();
		pp.setProd_id(1);
		pp.setProd_name("Note Book");
		pp.setProd_price(90);
		pp.setProd_brand("Classmate");
		pp.setProd_color("Yellow");
		
		System.out.println(pp.getProd_id()+" "+pp.getProd_name()+" "+pp.getProd_price()+" "+pp.getProd_brand()+" "+pp.getProd_color());
	}

	public static void main(String[] args) {

		MainClass mc = new MainClass();
		mc.employeeData();

		mc.patientData();
		
		mc.productData();

	}

}
