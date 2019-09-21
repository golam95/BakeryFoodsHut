
<%@include file="../template/temp_admin/adminheader.jsp"%>
<%@include file="../template/temp_admin/adminsidebar.jsp"%>


<div style="margin-top: 10px;" class="content">
	<div class="imageslider">
		<img src="<c:url value="/resources/image/logo.png" />" alt="Not Found" />
	</div>
	<div class="listofitem">
		<div class="container">
			<div class="row">
				<div class="col-md-3">
					<div class="customDiv">
						<h2>Total User</h2>
						<h1>10</h1>
					</div>
				</div>
				<div class="col-md-3">
					<div class="customDiv">
						<h2>Bakery Shop</h2>
						<h1>4</h1>
					</div>
				</div>
				<div class="col-md-3">
					<div class="customDiv">
						<h2>BSTI Approved</h2>
						<h1>44</h1>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-3">
					<div class="customDiv">
						<h2>Total Post</h2>
						<h1>44</h1>
					</div>
				</div>
				<div class="col-md-3">
					<div class="customDiv">
						<h2>NOT APPROVED</h2>
						<h1>6</h1>
					</div>
				</div>
				<div class="col-md-3">
					<div class="customDiv">
						<h2>Home made</h2>
						<h1>44</h1>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="../template/temp_admin/adminfooter.jsp"%>