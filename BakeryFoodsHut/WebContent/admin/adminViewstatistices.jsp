<%@include file="../template/temp_admin/adminheader.jsp"%>

<%@include file="../template/temp_admin/adminsidebar.jsp"%>

<div class="content">
	<div class="header">
		<div style="margin-bottom: 4px;" class="titleright">
			<h1 style="text-align: center;" class="page-title">***Statistics
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

			<div class="col-xs-11">
				<div class="table-responsive">


					<script type="text/javascript"
						src="https://www.gstatic.com/charts/loader.js"></script>
					<script type="text/javascript">
			google.charts.load('current', {
				'packages' : [ 'corechart' ]
			});
			google.charts.setOnLoadCallback(drawChart);
			function drawChart() {
				var data = google.visualization.arrayToDataTable([
						[ 'Gender', 'Number' ],
				
		<%out.println("['" + "af" + "',  " + "55" + "],");%>
		<%out.println("['" + "af" + "',  " + "4" + "],");%>
		<%out.println("['" + "af" + "',  " + "30" + "],");%>
		
			]);
				var options = {
					title : 'Percentage of Male and Female Employee',
					is3D : true,
				// pieHole: 0.4  
				};
				var chart = new google.visualization.PieChart(document
						.getElementById('piechart1_div'));
				chart.draw(data, options);
			}
		</script>

					<script type="text/javascript">
			google.charts.load('current', {
				'packages' : [ 'corechart' ]
			});
			google.charts.setOnLoadCallback(drawChart);
			function drawChart() {
				var data = google.visualization.arrayToDataTable([
						[ 'Gender', 'Number' ],
		
						
		<%out.println("['" + "af" + "',  " + "55" + "],");%>
		<%out.println("['" + "af" + "',  " + "4" + "],");%>
		<%out.println("['" + "af" + "',  " + "30" + "],");%>
		
		
			]);
				var options = {
					title : 'Percentage of Male and Female Employee',
					is3D : true,
				// pieHole: 0.4  
				};
				var chart = new google.visualization.PieChart(document
						.getElementById('piechart2_div'));
				chart.draw(data, options);
			}
		</script>


					<script type="text/javascript">
			google.charts.load('current', {
				'packages' : [ 'corechart' ]
			});
			google.charts.setOnLoadCallback(drawChart);
			function drawChart() {
				var data = google.visualization.arrayToDataTable([
						[ 'Gender', 'Number' ],
		
						
		<%out.println("['" + "af" + "',  " + "55" + "],");%>
		<%out.println("['" + "af" + "',  " + "4" + "],");%>
		<%out.println("['" + "af" + "',  " + "30" + "],");%>
		
		<%out.println("['" + "af" + "',  " + "55" + "],");%>
		<%out.println("['" + "af" + "',  " + "4" + "],");%>
		<%out.println("['" + "af" + "',  " + "30" + "],");%>
		
		
			]);
				var options = {
					title : 'Percentage of Male and Female Employee',
					is3D : true,
				// pieHole: 0.4  
				};
				var chart = new google.visualization.PieChart(document
						.getElementById('piechart3_div'));
				chart.draw(data, options);
			}
		</script>


					<script type="text/javascript">
			google.charts.load('current', {
				'packages' : [ 'corechart' ]
			});
			google.charts.setOnLoadCallback(drawChart);
			function drawChart() {
				var data = google.visualization.arrayToDataTable([
						[ 'Gender', 'Number' ],
		
						
		<%out.println("['" + "af" + "',  " + "55" + "],");%>
		<%out.println("['" + "af" + "',  " + "4" + "],");%>
		<%out.println("['" + "af" + "',  " + "30" + "],");%>
		
		
		
			]);
				var options = {
					title : 'Percentage of Male and Female Employee',
					is3D : true,
				// pieHole: 0.4  
				};
				var chart = new google.visualization.LineChart(document
						.getElementById('piechart4_div'));
				chart.draw(data, options);
			}
		</script>
					<div class="container">
						<div class="row col-md-offset-2">

							<h3
								style="text-align: center; font-weight: bold; margin-bottom: 30px;">***Overall
								statistic***</h3>
							<div class="col-md-3 col-md-offset-9">
								<div class="button_alignment">
									<div style="margin-bottom: 10px;" class="t"></div>
								</div>
							</div>
							<table class="columns">
								<tr>
									<td><div id="piechart1_div"
											style="border: 1px solid #ccc; width: 320px; height: 200px;">sager</div></td>
									<td><div id="piechart2_div"
											style="border: 1px solid #ccc; width: 320px; height: 200px;">dasf</div></td>
									<td><div id="piechart3_div"
											style="border: 1px solid #ccc; width: 320px; height: 200px;">dsaf</div></td>
								</tr>
							</table>
							<table class="columns">
								<tr>
									<td><div id="piechart4_div" style="border: 1px solid #ccc">asfd</div></td>
								</tr>
							</table>
						</div>
					</div>
				</div>
				<%@include file="../template/temp_admin/adminfooter.jsp"%>
			</div>
		</div>
		</body>
		</html>