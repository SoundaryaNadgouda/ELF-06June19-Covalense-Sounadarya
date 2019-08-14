<!DOCTYPE html>
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
<body style="background: lightgoldenrodyellow">
	<form action="../employee/employeeSubmit" method="post">
		<span>
			<p class="h3" style="margin-left: 40%">EMPLOYEE INFORMATION</p>
			<hr> <!-- EmployeeInfo-->
			<div class="row">
				<div class="col">
					<label for="id">ID</label> <input type="number"
						class="form-control" placeholder="ID" name="id">
				</div>
				<div class="col">
					<label for="acno">ACCOUNT NUMBER</label> <input
						type="number" class="form-control" placeholder="ACCOUNT NUMBER"
						name="acno">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="name">NAME</label> <input type="text"
						class="form-control" placeholder="NAME" name="name">
				</div>
				<div class="col">
					<label for="email">EMAIL ID</label> <input type="email"
						class="form-control" placeholder="EMAIL ID" name="email">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="age">AGE</label> <input type="number"
						class="form-control" placeholder="AGE" name="age">
				</div>
				<div class="col">
					<label for="designation">DESIGNATION</label> <input
						type="text" class="form-control" placeholder="DESIGNATION"
						name="designation">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="gender">Gender</label> <select id="gender"
						class="form-control" name="gender">
						<option selected>--select one--</option>
						<option value="male" name="gender">male</option>
						<option value="female" name="gender">female</option>
						<option value="other" name="gender">other</option>
					</select>
				</div>
				<div class="col">
					<label for="dob">Date of Birth</label> <input
						type="date" class="form-control" placeholder="dd-mm-yyyy"
						name="dob">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="salary">SALARY</label> <input type="number"
						class="form-control" placeholder="SALARY" name="salary">
				</div>
				<div class="col">
					<label for="deptid">DEPAETMENT ID</label> <input
						type="text" class="form-control" placeholder="DEPAETMENT ID"
						name="departmentInfoBean.deptid">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="phone">PHONE NUMBER</label> <input
						type="number" class="form-control" placeholder="PHONE NUMBER"
						name="phone">
				</div>
				<div class="col">
					<label for="exampleInputEmail1">MANAGER ID</label> <input
						type="text" class="form-control" placeholder="MANAGER ID"
						name="mngId.id">
				</div>
			</div>
			<div class="row">

				<div class="col-6">
					<label for="exampleInputEmail1">JOINING DATE</label> <input
						type="date" class="form-control" placeholder="JOINING DATE"
						name="joiningDate">
				</div>
			</div>
			<div class="col-6">
				<label for="exampleInputEmail1">Password</label> <input
					type="password" class="form-control"
					placeholder="Enter The Password" name="password">
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
						placeholder="Please Enter Emergency Contact Number"
						name="empotherinfo.emergency_contact_number">
				</div>
				<div class="col">
					<label for="exampleInputmotname">Mother Name</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Mother Name"
						name="empOtherInfoBean.mother_name">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="exampleInputPan">Pan Number</label> <input type="text"
						class="form-control" placeholder="Please Enter Pan Number"
						name="empOtherInfoBean.pan">
				</div>
				<div class="col">
					<label for="exampleInputemergeName">Emergency Contact
						Number</label> <input type="text" class="form-control"
						placeholder="Please Enter Emergency Contact Name"
						name="empOtherInfoBean.emergency_contact_number">
				</div>
				<div class="col">
					<label for="exampleInputspouse">Spouse Name</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Spouse Name"
						name="empOtherInfoBean.spouse_name">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="inputStatus">Marital Status</label> <select
						id="inputStatus" class="form-control"
						name="empOtherInfoBean.is_married">
						<option selected>Married</option>
						<option value="married">Married</option>
						<option value="unmarried">Unmarried</option>
						<option value="divorcee">Divorcee</option>
					</select>
				</div>
				<div class="col">
					<label for="inputnationality">Nationality</label> <select
						id="inputnationality" class="form-control"
						name="empOtherInfoBean.nationality">
						<option selected>---Select One---</option>
						<option value="indian">Indian</option>
						<option value="other">Other</option>
					</select>
				</div>
				<div class="col">
					<label for="exampleInputpassport">Passport Number</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Passport Number"
						name="empOtherInfoBean.passport">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="inputbloodgrp">Blood Group</label> <select
						id="inputbloodgrp" class="form-control"
						name="empOtherInfoBean.blood_group">
						<option selected>---Select One---</option>
						<option value="AB+">AB+</option>
						<option value="AB-">AB-</option>
						<option value="A+">A+</option>
						<option value="A-">A-</option>
						<option value="o+">o+</option>
						<option value="o-">o-</option>
					</select>
				</div>
				<div class="col">
					<label for="inputreligion">Religion</label> <select
						id="inputreligion" class="form-control"
						name="empOtherInfoBean.religion">
						<option selected>---Select One---</option>
						<option value="hindu">Hindu</option>
						<option value="christian">Christian</option>
						<option value="muslim">Muslim</option>
					</select>
				</div>
				<div class="col">
					<label for="exampleInputaadhar">Aadhar Number</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Aadhar Number"
						name="empOtherInfoBean.aadhar">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="inputphysicallych">Physically Challnged</label> <select
						id="inputphysicallych" class="form-control"
						name="empOtherInfoBean.is_challenged">
						<option selected>---Select One---</option>
						<option value="yes">Yes</option>
						<option value="no">No</option>
					</select>
				</div>
				<div class="col">
					<label for="exampleInputfather">Father Number</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Father Number"
						name="empOtherInfoBean.father_name">
				</div>


				<!-- EMPLOYEE ADDRESS INFORMATION -->
			</div>
			<h4 class="text-center border-bottom">EMPLOYEE ADDRESS
				INFORMATION</h4>

			<div class="form-row">

				<div class="form-group col-md-6">
					<label for="AdressType1">Address Type</label> <input
						type="text" class="form-control" id="AdressType1"
						placeholder="Enter Address Type"
						name="adressInfoBean[0].pkBean.addressType">
				</div>
				<div class="form-group col-md-6">
					<label for="city">City</label> <input type="text"
						class="form-control" id="city" placeholder="Enter City"
						name="adressInfobean[0].city">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="state"> State</label> <input type="text"
						class="form-control" id="state" placeholder="Enter State"
						name="adressInfobean[0].state">
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="Adress1">Address1</label> <input type="text"
						class="form-control" id="Adress1" placeholder="Enter Address1"
						name="adressInfobean[0].address1">
				</div>
				<div class="form-group col-md-6">
					<label for="Adress2">Address2</label> <input type="text"
						class="form-control" id="Adress2" placeholder="Enter Address2"
						name="adressInfobean[0].address2">
				</div>
			</div>
			<div class="form-row">

				<div class="form-group col-md-6">
					<label for="country">Country</label> <input type="text"
						class="form-control" id="country"
						placeholder="Enter Country" name="adressInfobean[0].country">
				</div>
				<div class="form-group col-md-6">
					<label for="pincode">Pincode</label> <input type="number"
						class="form-control" id="pincode"
						placeholder="Enter Pincode" name="adressInfobean[0].pincode">
				</div>
			</div>


			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="landmark">LandMark </label> <input type="text"
						class="form-control" id="landmark"
						placeholder="Enter Address LandMark"
						name="adressInfobean[0].landmark">
				</div>

			</div> <!-- EMPLOYEE ADDRESS INFORMATION -->
			</div>
			<h4 class="text-center border-bottom">EMPLOYEE ADDRESS
				INFORMATION</h4>

			<div class="form-row">

				<div class="form-group col-md-6">
					<label for="AdressType">Address Type</label> <input
						type="text" class="form-control" id="AdressType"
						placeholder="Enter Address Type"
						name="adressInfobean[1].pkBean.addressType">
				</div>
				<div class="form-group col-md-6">
					<label for="city">City</label> <input type="text"
						class="form-control" id="city" placeholder="Enter City"
						name="adressInfobean[1].city">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="state"> State</label> <input type="text"
						class="form-control" id="state" placeholder="Enter State"
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

			</div> <i class="fa fa-twitter-square"></i>
			<h4 class="text-center border-bottom">Educational Details</h4>



			<div class="col-sm- my-1">
				<div class="input-group">
					<div class="input-group-prepend">
						<div class="input-group-text">Educational Type</div>
					</div>
					<input type="text" class="form-control"
						id="inlineFormInputGroupUsername"
						placeholder="Enter Educational Type"
						name="educationInfoBean[0].educationPKBean.educationType">
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
							name="educationInfoBean[0].branch">
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
								name="educationInfoBean[0].institute">
						</div>
						<br>


						<div class="col-sm- my-1">
							<div class="input-group">
								<div class="input-group-prepend">
									<div class="input-group-text">Year of Passing</div>
								</div>
								<input type="text" class="form-control"
									id="inlineFormInputGroupUsername" placeholder="dd-mm-yyyy"
									name="educationInfoBean[0].passout">
							</div>
							<br> <i class="fa fa-twitter-square"></i>
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
											</div>
											<br> <i class="fa fa-twitter-square"></i>

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
														name="experienceInfoBean[0].experiencePKBean.companyName">
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
															name="experienceInfoBean[0].yearOfExperience">
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
																name="experienceInfoBean[0].designation">
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
																	name="experienceInfoBean[0].technology">
															</div>
															<br> <i class="fa fa-twitter-square"></i>

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
															</div>
		</span>
	</form>
</body>
</html>