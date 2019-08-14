<!DOCTYPE html>
<%@page import="com.covalense.emp.dto.EmpExperienceInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.covalense.emp.dto.EmpEducationInfo"%>
<%@page import="com.covalense.emp.dto.EmpAddressInfo"%>
<%@page import="com.covalense.emp.dto.EmpInfoBean"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

</head>
<%
	
EmpInfoBean empInfoBean=(EmpInfoBean)session.getAttribute("infoBean");
%>
<body style="background: lightgoldenrodyellow">
	<form action="../employee/employeeSubmit" method="post">
		<span>
			<p class="h3" style="margin-left: 40%">EMPLOYEE INFORMATION</p>
			<hr> <!-- EmployeeInfo-->
			<div class="row">
				<div class="col">
					<label for="exampleInputEmail1">ID</label> <input type="number"
						class="form-control" placeholder="ID"
						value="<%=empInfoBean.getId()%>" required name="id">
				</div>
				<div class="col">
					<label for="exampleInputEmail1">ACCOUNT NUMBER</label> <input
						type="text" class="form-control" placeholder="ACCOUNT NUMBER"
						value="<%=empInfoBean.getAcno()%>" name="acno">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="exampleInputEmail1">NAME</label> <input type="text"
						class="form-control" placeholder="NAME"
						value="<%=empInfoBean.getName()%>" name="infoBean.name">
				</div>
				<div class="col">
					<label for="exampleInputEmail1">EMAIL ID</label> <input type="text"
						class="form-control" placeholder="EMAIL ID"
						value="<%=empInfoBean.getEmail()%>" name="email">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="exampleInputEmail1">AGE</label> <input type="text"
						class="form-control" placeholder="AGE"
						value="<%=empInfoBean.getAge()%>" name="age">
				</div>
				<div class="col">
					<label for="exampleInputEmail1">DESIGNATION</label> <input
						type="text" class="form-control" placeholder="DESIGNATION"
						value="<%=empInfoBean.getDesignation()%>" name="designation">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="inputGender">Gender</label> <select id="inputGender"
						class="form-control" name="gender">
						<%if(empInfoBean.getGender().equals("male")){%>
						<option value="male"  selected="selected">male</option>
						<option value="female">female</option>
						<%}else{  %>
						<option value="male">female</option>
						<option value="female" selected="selected">female</option>
						<%} %>
					</select>
				</div>
				<div class="col">
					<label for="exampleInputEmail1">Date of Birth</label> <input
						type="date" class="form-control" placeholder="dd-mm-yyyy" value="<%=empInfoBean.getDob()%>"
						name="dob">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="exampleInputEmail1">SALARY</label> <input type="text"
						class="form-control" placeholder="SALARY"  value="<%=empInfoBean.getSalary()%>" name="salary">
				</div>
				<div class="col">
					<label for="exampleInputEmail1">DEPAETMENT ID</label> <input
						type="text" class="form-control" placeholder="DEPAETMENT ID" value="<%=empInfoBean.getDepartmentInfoBean()%>"
						name="deptid">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="exampleInputEmail1">PHONE NUMBER</label> <input
						type="text" class="form-control" placeholder="PHONE NUMBER" value="<%=empInfoBean.getPhone()%>"
						name="phone">
				</div>
				<div class="col">
					<label for="exampleInputEmail1">MANAGER ID</label> <input
						type="text" class="form-control" placeholder="MANAGER ID" value="<%=empInfoBean.getMngId()%>"
						name="managerid">
				</div>
			</div>
			<div class="row">

				<div class="col-6">
					<label for="exampleInputEmail1">JOINING DATE</label> <input
						type="date" class="form-control" placeholder="JOINING DATE" value="<%=empInfoBean.getJoiningDate()%>"
						name="joiningDate">
				</div>
			</div>
			<div class="col-6">
				<label for="exampleInputEmail1">Password</label> <input
					type="password" class="form-control"
					placeholder="Enter The Password" value="<%=empInfoBean.getPassword()%>" name="password">
			</div>
			<div class="col-6">
				<label for="exampleInputEmail1">Confirm Password</label> <input
					type="password" class="form-control"
					placeholder="Enter The Confirm Password" name="confirmPassword">
			</div> <!-- EMPLOYEE OTHER INFORMATION -->
			<p class="h3" style="margin-left: 40%">EMPLOYEE OTHER INFORMATION</p>
			<hr>
			<div class="row">

				<div class="col">
					<label for="exampleInputemergenum">Emergency Contact Number</label>
					<input type="text" class="form-control"
						placeholder="Please Enter Emergency Contact Number" value="<%=empInfoBean.getEmpOtherInfoBean().getEmergency_contact_number()%>"
						name="empotherinfo.emergency_contact_number">
				</div>
				<div class="col">
					<label for="exampleInputmotname">Mother Name</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Mother Name"  value="<%=empInfoBean.getEmpOtherInfoBean().getMother_name()%>"
						name="empOtherInfoBean.mother_name">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="exampleInputPan">Pan Number</label> <input type="text"
						class="form-control" placeholder="Please Enter Pan Number" value="<%=empInfoBean.getEmpOtherInfoBean().getPan()%>"
						name="empOtherInfoBean.pan">
				</div>
				
				<div class="col">
					<label for="exampleInputspouse">Spouse Name</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Spouse Name" value="<%=empInfoBean.getEmpOtherInfoBean().getSpouse_name()%>"
						name="empOtherInfoBean.spouse_name">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="inputStatus">Marital Status</label> <select
						id="inputStatus" class="form-control"
						name="empOtherInfoBean.is_married">
						
						<%if(empInfoBean.getEmpOtherInfoBean().getIs_married().equals("married")){%>
						<option value="married"  selected="selected">married</option>
						<option value="unmarried">unmarried</option>
						<option value="divorcee">divorcee</option>
						<%}else if(empInfoBean.getGender().equals("unmarried")){  %>
						<option value="married">married</option>
						<option value="unmarried" selected="selected">unmarried</option>
						<option value="divorcee">divorcee</option>
						<%}else{  %>
						<option value="married">married</option>
						<option value="unmarried">unmarried</option>
						<option value="divorcee"  selected="selected">divorcee</option>
						<%} %>
						
						
					</select>
				</div>
				<div class="col">
					<label for="inputnationality">Nationality</label> <select
						id="inputnationality" class="form-control"
						name="empOtherInfoBean.nationality">
						
						<%if(empInfoBean.getEmpOtherInfoBean().getNationality().equals("indian")){%>
						<option value="indian"  selected="selected">male</option>
						<option value="other">female</option>
						<%}else{  %>
						<option value="indian">female</option>
						<option value="other" selected="selected">female</option>
						<%} %>
						
						
					</select>
				</div>
				<div class="col">
					<label for="exampleInputpassport">Passport Number</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Passport Number" value="<%=empInfoBean.getEmpOtherInfoBean().getPassport()%>"
						name="empOtherInfoBean.passport">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="inputbloodgrp">Blood Group</label> <select
						id="inputbloodgrp" class="form-control"
						name="empOtherInfoBean.blood_group">
						
						<%if(empInfoBean.getEmpOtherInfoBean().getBlood_group().equals("AB+")){%>
						<option value="AB+"  selected="selected">AB+</option>
						<option value="AB-">AB-</option>
						<option value="A+">A+</option>
						<option value="A-">A-</option>
						<option value="o+">o+</option>
						<option value="o-">o-</option>
						<%}else if(empInfoBean.getEmpOtherInfoBean().getBlood_group().equals("AB-")){  %>
						<option value="AB-"  selected="selected">AB-</option>
						<option value="AB+">AB+</option>
						<option value="A+">A+</option>
						<option value="A-">A-</option>
						<option value="o+">o+</option>
						<option value="o-">o-</option>
						<%}else if(empInfoBean.getEmpOtherInfoBean().getBlood_group().equals("A+")){  %>
						<option value="A+"  selected="selected">A+</option>
						<option value="AB+">AB+</option>
						<option value="AB-">AB-</option>
						<option value="A-">A-</option>
						<option value="o+">o+</option>
						<option value="o-">o-</option>
						<%}else if(empInfoBean.getEmpOtherInfoBean().getBlood_group().equals("A-")){  %>
						<option value="A-"  selected="selected">A-</option>
						<option value="AB+">AB+</option>
						<option value="AB-">AB-</option>
						<option value="A+">A+</option>
						<option value="o+">o+</option>
						<option value="o-">o-</option>
						<%}else if(empInfoBean.getEmpOtherInfoBean().getBlood_group().equals("o+")){  %>
						<option value="o+"  selected="selected">o+</option>
						<option value="AB+">AB+</option>
						<option value="AB-">AB-</option>
						<option value="A+">A+</option>
						<option value="A-">A-</option>
						<option value="o-">o-</option>
						
						<%}else{  %>
						<option value="o-"  selected="selected">o-</option>
						<option value="AB+">AB+</option>
						<option value="AB-">AB-</option>
						<option value="A+">A+</option>
						<option value="A-">A-</option>
						<option value="o+">o+</option>
						<%} %>
					
					</select>
				</div>
				<div class="col">
					<label for="inputreligion">Religion</label> <select
						id="inputreligion" class="form-control"
						name="empOtherInfoBean.religion">
						<%if(empInfoBean.getEmpOtherInfoBean().getReligion().equals("hindu")){%>
						<option value="hindu"  selected="selected">hindu</option>
						<option value="christian">christian</option>
						<option value="muslim">muslim</option>
						
						<%}else if(empInfoBean.getEmpOtherInfoBean().getReligion().equals("christian")){  %>
						<option value="christian"  selected="selected">christian</option>
						<option value="hindu">hindu</option>
						<option value="muslim">muslim</option>
						
						<%}else{  %>
						<option value="muslim"  selected="selected">muslim</option>
						<option value="hindu">hindu</option>
						<option value="christian">christian</option>
						
						<%} %>
					
					</select>
				</div>
				<div class="col">
					<label for="exampleInputaadhar">Aadhar Number</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Aadhar Number"  value="<%=empInfoBean.getEmpOtherInfoBean().getAadhar()%>"
						name="empOtherInfoBean.aadhar">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="inputphysicallych">Physically Challnged</label> <select
						id="inputphysicallych" class="form-control"
						name="empOtherInfoBean.is_challenged">
						
						<%if(empInfoBean.getGender().equals("yes")){%>
						<option value="yes"  selected="selected">yes</option>
						<option value="no">no</option>
						<%}else{  %>
						<option value="yes">yes</option>
						<option value="no" selected="selected">no</option>
						<%} %>
						
					</select>
				</div>
				<div class="col">
					<label for="exampleInputfather">Father Number</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Father Number" value="<%=empInfoBean.getEmpOtherInfoBean().getFather_name()%>"
						name="empOtherInfoBean.father_name">
				</div>

	</div>
				<!-- EMPLOYEE ADDRESS INFORMATION -->
				<%
			List<EmpAddressInfo> addressInfoBean=empInfoBean.getAdressInfoBean();
				int i=0;
				for(EmpAddressInfo addressInfo:addressInfoBean){
				%>
		
			<h4 class="text-center border-bottom">EMPLOYEE ADDRESS
				INFORMATION</h4>

			<div class="form-row">

				<div class="form-group col-md-6">
					<label for="inputPassword4">Address Type</label> <input
						type="password" class="form-control" id="inputPassword4"
						placeholder="Enter Address Type"
						name="adressInfoBean[<%=i%>].pkBean.addressType">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">City</label> <input type="password"
						class="form-control" id="inputPassword4" placeholder="Enter City"
						name="adressInfobean<%=i%>.city">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputPassword4"> State</label> <input type="password"
						class="form-control" id="inputPassword4" placeholder="Enter State"
						name="adressInfobean[<%=i%>].state">
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Address1</label> <input type="email"
						class="form-control" id="inputEmail4" placeholder="Enter Address1"
						name="adressInfobean[<%=i%>].address1">
				</div>
				<div class="form-group col-md-6">
					<label for="inputEmail4">Address2</label> <input type="email"
						class="form-control" id="inputEmail4" placeholder="Enter Address2"
						name="adressInfobean[<%=i%>].address2">
				</div>
			</div>
			<div class="form-row">

				<div class="form-group col-md-6">
					<label for="inputPassword4">Country</label> <input type="password"
						class="form-control" id="inputPassword4"
						placeholder="Enter Country" name="adressInfobean[<%=i%>].country">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Pincode</label> <input type="password"
						class="form-control" id="inputPassword4"
						placeholder="Enter Pincode" name="adressInfobean[<%=i%>].pincode">
				</div>
			</div>


			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">LandMark </label> <input type="email"
						class="form-control" id="inputEmail4"
						placeholder="Enter Address LandMark"
						name="adressInfobean[<%=i%>].landmark">
				</div>
</div>
			</div>
			<%
			i++;
					}
			%> <!--  EMPLOYEE ADDRESS INFORMATION
			
			<h4 class="text-center border-bottom">EMPLOYEE ADDRESS
				INFORMATION</h4>

			<div class="form-row">

				<div class="form-group col-md-6">
					<label for="inputPassword4">Address Type</label> <input
						type="password" class="form-control" id="inputPassword4"
						placeholder="Enter Address Type"
						name="adressInfobean[1].pkBean.addressType">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">City</label> <input type="password"
						class="form-control" id="inputPassword4" placeholder="Enter City"
						name="adressInfobean[1].city">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputPassword4"> State</label> <input type="password"
						class="form-control" id="inputPassword4" placeholder="Enter State"
						name="adressInfobean[1].state">
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Address1</label> <input type="email"
						class="form-control" id="inputEmail4" placeholder="Enter Address1"
						name="adressInfobean[1].address1">
				</div>
				<div class="form-group col-md-6">
					<label for="inputEmail4">Address2</label> <input type="email"
						class="form-control" id="inputEmail4" placeholder="Enter Address2"
						name="adressInfobean[1].address2">
				</div>
			</div>
			<div class="form-row">

				<div class="form-group col-md-6">
					<label for="inputPassword4">Country</label> <input type="password"
						class="form-control" id="inputPassword4"
						placeholder="Enter Country" name="adressInfobean[1].country">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Pincode</label> <input type="password"
						class="form-control" id="inputPassword4"
						placeholder="Enter Pincode" name="adressInfobean[1].pincode">
				</div>
			</div>


			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">LandMark </label> <input type="email"
						class="form-control" id="inputEmail4"
						placeholder="Enter Address LandMark"
						name="adressInfobean[1].landmark">
				</div>

			</div>  -->
			
			<%
			List<EmpEducationInfo> empEducationInfo=empInfoBean.getEducationInfoBean();
				int j=0;
				for(EmpEducationInfo educationInfo:empEducationInfo){
				%>
		
			 <i class="fa fa-twitter-square"></i>
			<h4 class="text-center border-bottom">Educational Details</h4>



			<div class="col-sm- my-1">
				<div class="input-group">
					<div class="input-group-prepend">
						<div class="input-group-text">Educational Type</div>
					</div>
					<input type="text" class="form-control"
						id="inlineFormInputGroupUsername"
						placeholder="Enter Educational Type"
						name="educationInfoBean<%=j%>.educationPKBean.educationType">
				</div>
				<br>


				<div class="col-sm- my-1">
					<div class="input-group">
						<div class="input-group-prepend">
							<div class="input-group-text">Branch</div>
						</div>
						<input type="text" class="form-control"
							id="inlineFormInputGroupUsername"
							placeholder="Enter Degree Branch"
							name="educationInfoBean<%=j%>.branch">
					</div>
					<br>

					<div class="col-sm- my-1">
						<div class="input-group">
							<div class="input-group-prepend">
								<div class="input-group-text">Institute</div>
							</div>
							<input type="text" class="form-control"
								id="inlineFormInputGroupUsername"
								placeholder="Enter University Name"
								name="educationInfoBean<%=j%>.institute">
						</div>
						<br>


						<div class="col-sm- my-1">
							<div class="input-group">
								<div class="input-group-prepend">
									<div class="input-group-text">Year of Passing</div>
								</div>
								<input type="text" class="form-control"
									id="inlineFormInputGroupUsername" placeholder="dd-mm-yyyy"
									name="educationInfoBean<%=j%>.passout">
							</div>
							<%
							j++;
							}%>
							<!-- <br> <i class="fa fa-twitter-square"></i>
							<h4 class="text-center border-bottom">Educational Details</h4>



							<div class="col-sm- my-1">
								<div class="input-group">
									<div class="input-group-prepend">
										<div class="input-group-text">Educational Type</div>
									</div>
									<input type="text" class="form-control"
										id="inlineFormInputGroupUsername"
										placeholder="Enter Educational Type"
										name="educationInfoBean[1].educationPKBean.educationType">
								</div>
								<br>



								<div class="col-sm- my-1">
									<div class="input-group">
										<div class="input-group-prepend">
											<div class="input-group-text">Branch</div>
										</div>
										<input type="text" class="form-control"
											id="inlineFormInputGroupUsername"
											placeholder="Enter Degree Branch"
											name="educationInfoBean[1].branch">
									</div>
									<br>




									<div class="col-sm- my-1">
										<div class="input-group">
											<div class="input-group-prepend">
												<div class="input-group-text">Institute</div>
											</div>
											<input type="text" class="form-control"
												id="inlineFormInputGroupUsername"
												placeholder="Enter University Name"
												name="educationInfoBean[1].institute">
										</div>
										<br>


										<div class="col-sm- my-1">
											<div class="input-group">
												<div class="input-group-prepend">
													<div class="input-group-text">Year of Passing</div>
												</div>
												<input type="text" class="form-control"
													id="inlineFormInputGroupUsername" placeholder="dd-mm-yyyy"
													name="educationInfoBean[1].passout">
											</div> -->
											<br> <i class="fa fa-twitter-square"></i>

<%
			List<EmpExperienceInfo> empExperienceInfo=empInfoBean.getExperienceInfoBean();
				int k=0;
				for(EmpExperienceInfo experienceInfo:empExperienceInfo){
				%>
											<h4 class="text-center border-bottom">Employee
												Experience Details</h4>

											<div class="col-sm- my-1">
												<div class="input-group">
													<div class="input-group-prepend">
														<div class="input-group-text">Company Name</div>
													</div>
													<input type="text" class="form-control"
														id="inlineFormInputGroupUsername"
														placeholder="Enter Company Name"
														name="experienceInfoBean<%=k%>.experiencePKBean.companyName">
												</div>
												<br>

												<div class="col-sm- my-1">
													<div class="input-group">
														<div class="input-group-prepend">
															<div class="input-group-text">Year Of Experience</div>
														</div>
														<input type="text" class="form-control"
															id="inlineFormInputGroupUsername"
															placeholder="Enter Designation"
															name="experienceInfoBean<%=k%>.yearOfExperience">
													</div>
													<br>

													<div class="col-sm- my-1">
														<div class="input-group">
															<div class="input-group-prepend">
																<div class="input-group-text">Designation</div>
															</div>
															<input type="text" class="form-control"
																id="inlineFormInputGroupUsername"
																placeholder="dd-mm-yyyy"
																name="experienceInfoBean<%=k%>.designation">
														</div>
														<br>


														<div class="col-sm- my-1">
															<div class="input-group">
																<div class="input-group-prepend">
																	<div class="input-group-text">Technology</div>
																</div>
																<input type="text" class="form-control"
																	id="inlineFormInputGroupUsername"
																	placeholder="dd-mm-yyyy"
																	name="experienceInfoBean<%=k%>.technology">
															</div>
															<%
															k++;}%>
															<!-- <br> <i class="fa fa-twitter-square"></i>

															<h4 class="text-center border-bottom">Employee
																Experience Details</h4>

															<div class="col-sm- my-1">
																<div class="input-group">
																	<div class="input-group-prepend">
																		<div class="input-group-text">Company Name</div>
																	</div>
																	<input type="text" class="form-control"
																		id="inlineFormInputGroupUsername"
																		placeholder="Enter Company Name"
																		name="experienceInfoBean[1].experiencePKBean.companyName">
																</div>
																<br>

																<div class="col-sm- my-1">
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<div class="input-group-text">Year Of
																				Experience</div>
																		</div>
																		<input type="text" class="form-control"
																			id="inlineFormInputGroupUsername"
																			placeholder="Enter Designation"
																			name="experienceInfoBean[1].yearOfExperience">
																	</div>
																	<br>

																	<div class="col-sm- my-1">
																		<div class="input-group">
																			<div class="input-group-prepend">
																				<div class="input-group-text">Designation</div>
																			</div>
																			<input type="text" class="form-control"
																				id="inlineFormInputGroupUsername"
																				placeholder="dd-mm-yyyy"
																				name="experienceInfoBean[1].designation">
																		</div>
																		<br>


																		<div class="col-sm- my-1">
																			<div class="input-group">
																				<div class="input-group-prepend">
																					<div class="input-group-text">Technology</div>
																				</div>
																				<input type="text" class="form-control"
																					id="inlineFormInputGroupUsername"
																					placeholder="dd-mm-yyyy"
																					name="experienceInfoBean[1].technology">
																			</div>
																			<br>





																		</div>
																	</div>

																	<div class="row" style="padding-left: 21px;">
																		<button type="button"
																			class="btn btn-default btn-md col-sm-5"
																			style="border: 1px solid gray">Reset</button>
																		<button type="submit"
																			class="btn btn-default btn-md col-sm-6"
																			style="border: 1px solid gray">Submit</button>
																	</div>


																</div>
															</div> -->
		</span>
	</form>
</body>
</html>
