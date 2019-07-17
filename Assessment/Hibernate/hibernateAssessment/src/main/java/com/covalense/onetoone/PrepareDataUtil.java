package com.covalense.onetoone;

import org.hibernate.SessionFactory;

import com.covalense.hibernate.dto.StudentInfoBean;
import com.covalense.hibernate.dto.StudentOtherInfo;
import com.covalense.hibernate.util.HibernateUtil;


import lombok.extern.java.Log;
@Log
public class PrepareDataUtil {
	
	private PrepareDataUtil() {}
	public static StudentInfoBean  prepareData(int id) {
	StudentInfoBean bean=new StudentInfoBean();
	bean.setRollnum(id);
	bean.setName("soundarya");
    bean.setAge(23);
      bean.setEmailId("abc@gmail.com");
    bean.setGender("female");
     bean.setMobileNo(346565);
   
  StudentOtherInfo otherInfoBean=new StudentOtherInfo();
  
  otherInfoBean.setRollNum(id);
  otherInfoBean.setFatherName("adivesh");
  
  otherInfoBean.setMotherName("neelambika");
  otherInfoBean.setNationality("indian");
  otherInfoBean.setReligion_name("hindu");
  
  bean.setOtherinfo(otherInfoBean);
  return bean;
	}

}
