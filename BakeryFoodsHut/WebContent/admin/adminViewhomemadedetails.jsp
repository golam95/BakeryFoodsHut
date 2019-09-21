<%@include file="../template/temp_admin/adminheader.jsp"%>

<%@include file="../template/temp_admin/adminsidebar.jsp"%>

<div class="content">
	<div class="header">
		<div style="margin-bottom: 4px;" class="titleright">
			<h1 style="text-align: center;" class="page-title">***View User
				Information***</h1>
			<div style="margin-top: 38px;" class="manageoption">
				<a
					style="padding: 5px; background: #4E2614; border: 4px solid #DAB776; border-radius: 5px; margin-left: 47px; color: #FFFFFF; font-weight: bold;"
					href="<c:url value="../ManageAdminpage?action=ADMINDASHBOARD" />">Home</a>
			</div>
		</div>
	</div>

	<div class="main-content">
		<div class="row">
			<div class="form-group">
				<div class="addsearch_left">
					<a class="form-control" href="addEmp.html"><span
						class="glyphicon glyphicon-plus-sign"></span> Add UserInfo</a>
				</div>
				<div class="addsearch_right">
					<input class="form-control" placeholder="Search..." type="search"
						id="inputUserName" />
				</div>
			</div>
			<div class="col-xs-11">
				<div class="table-responsive">
					<table style="margin-left: 40px;"
						class="table table-striped table-bordered table-hover">
						<thead>
							<tr class="active">
								<th
									style="text-align: center; background-color: #583535; color: white;">Id</th>
								<th
									style="text-align: center; background-color: #583535; color: white;">UserName</th>
								<th
									style="text-align: center; background-color: #583535; color: white;">Email</th>
								<th
									style="text-align: center; background-color: #583535; color: white;">HouseNo</th>

								<th
									style="text-align: center; background-color: #583535; color: white;">Status</th>


								<th
									style="width: 150px; text-align: center; background-color: #583535; color: white;">Action</th>
							</tr>
						<tbody>

							<tr class="primary">
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">1</td>
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">Raid</td>
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">raid@gmail.com</td>

								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">62/B</td>

								<td
									style="color: red; text-align: center; font-weight: bold; font-size: 12px;"><a
									style="font-weight: bold; color: white; padding: 5px; background: red; border-radius: 5px;"
									href="">Block</a></td>

								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">
									<a
									style="padding: 10px; background-color: green; border-radius: 5px; text-decoration: none; color: white;"
									class="glyphicon glyphicon-send"></a> <a
									style="padding: 10px; background-color: red; border-radius: 5px; text-decoration: none; color: white;"
									class="glyphicon glyphicon-remove"></a>

								</td>
							</tr>
							
							
							
							<tr class="primary">
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">2</td>
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">Ratul</td>
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">ratul@gmail.com</td>

								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">59/B</td>

								<td
									style="color: red; text-align: center; font-weight: bold; font-size: 12px;"><a
									style="font-weight: bold; color: white; padding: 5px; background: red; border-radius: 5px;"
									href="">Block</a></td>

								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">
									<a
									style="padding: 10px; background-color: green; border-radius: 5px; text-decoration: none; color: white;"
									class="glyphicon glyphicon-send"></a> <a
									style="padding: 10px; background-color: red; border-radius: 5px; text-decoration: none; color: white;"
									class="glyphicon glyphicon-remove"></a>

								</td>
							</tr>
							
							<tr class="primary">
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">2</td>
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">Ratul</td>
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">ratul@gmail.com</td>

								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">59/B</td>

								<td
									style="color: red; text-align: center; font-weight: bold; font-size: 12px;"><a
									style="font-weight: bold; color: white; padding: 5px; background: red; border-radius: 5px;"
									href="">Block</a></td>

								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">
									<a
									style="padding: 10px; background-color: green; border-radius: 5px; text-decoration: none; color: white;"
									class="glyphicon glyphicon-send"></a> <a
									style="padding: 10px; background-color: red; border-radius: 5px; text-decoration: none; color: white;"
									class="glyphicon glyphicon-remove"></a>

								</td>
							</tr>
							
							<tr class="primary">
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">2</td>
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">golam</td>
								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">golam@gmail.com</td>

								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">59/B</td>

								<td
									style="color: red; text-align: center; font-weight: bold; font-size: 12px;"><a
									style="font-weight: bold; color: white; padding: 5px; background: red; border-radius: 5px;"
									href="">Block</a></td>

								<td
									style="color: black; text-align: center; font-weight: bold; font-size: 12px;">
									<a
									style="padding: 10px; background-color: green; border-radius: 5px; text-decoration: none; color: white;"
									class="glyphicon glyphicon-send"></a> <a
									style="padding: 10px; background-color: red; border-radius: 5px; text-decoration: none; color: white;"
									class="glyphicon glyphicon-remove"></a>

								</td>
							</tr>
							
							
						</tbody>
						</thead>
					</table>

				</div>
			</div>
		</div>
		<%@include file="../template/temp_admin/adminfooter.jsp"%>
	</div>
</div>
</body>
</html>

