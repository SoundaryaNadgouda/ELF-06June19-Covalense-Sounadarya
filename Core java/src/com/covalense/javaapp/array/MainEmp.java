package com.covalense.javaapp.array;


import lombok.extern.java.Log;
@Log
public class MainEmp {

	public static void main(String[] args) {
		Emp []e = new Emp[4];

		Emp e1 = new Emp();
		e1.setName("soundarya");
		e1.setAge(34);
		e1.setSal(23000);

		Emp e2 = new Emp();
		e2.setName("soujanya");
		e2.setAge(23);
		e2.setSal(26000);

		Emp e3 = new Emp();
		e3.setName("shivani");
		e3.setAge(13);
		e3.setSal(30000);

		Emp e4 = new Emp();
		e4.setName("xyz");
		e4.setAge(53);
		e4.setSal(31000);

		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		e[3] = e4;

		for (Emp em : e) {
			log.info(" "+em.getName());
			log.info(" "+em.getAge());
			log.info(" "+em.getSal());
		}

	}

}
