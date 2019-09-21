
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>

<%
	ManageStaticesServiceImpl statisticservice = new ManageStaticesServiceImpl();
%>

<div id="body-container">
	<div id="body-content">
		<div class="body-nav body-nav-horizontal body-nav-fixed">
			<%@include
				file="../template/temp_paidshopkeeper/paidpackageoption.jsp"%>
		</div>
		<section
			style="height: 30px; background: #95540B; border-bottom: 2px solid #95540B; margin-top: 24px;"
			class="style-page"></section>
		<%@include
			file="../template/temp_paidshopkeeper/paidpackagesiderbar.jsp"%>

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
				
		<%out.println("['" + "Total Post" + "',  " + statisticservice.TotalPost(username) + "],");%>
		<%out.println("['" + "Total Van" + "',  " + statisticservice.Totalvechile(username) + "],");%>
		
		]);
				var options = {
					title : 'Percentage of post and van',
					is3D : true,
				// pieHole: 0.4  
				};
				var chart = new google.visualization.BarChart(document
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
		
						
		<%out.println("['" + "Offline Order" + "',  " + statisticservice.Totallocalstoreorder(username) + "],");%>
		<%out.println("['" + "Online Order" + "',  " + statisticservice.TotalOrder(username) + "],");%>
		
		
		
			]);
				var options = {
					title : 'Percentage of Offline order and Online order',
					is3D : true,
				// pieHole: 0.4  
				};
				var chart = new google.visualization.BarChart(document
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
		<%out.println("['" + "Employee" + "',  " + statisticservice.TotalEmployee(username) + "],");%>
		<%out.println("['" + "Resignation" + "',  " + statisticservice.TotalResignationemp(username) + "],");%>
		
		]);
				var options = {
					title : 'Percentage of employee and resignation employee',
					is3D : true,
				// pieHole: 0.4  
				};
				var chart = new google.visualization.BarChart(document
						.getElementById('piechart3_div'));
				chart.draw(data, options);
			}
		</script>

		<div class="container">
			<div class="row col-md-offset-1">
				<h3
					style="text-align: center; font-weight: bold; margin-bottom: 30px;">***Overall
					statistic***</h3>
				<div class="col-md-3 col-md-offset-9">
					<div class="button_alignment">
						<div style="margin-bottom: 10px;" class="t"></div>
					</div>
				</div>
				<table class="columns">
					<br />

					<tr>
						<td><div id="piechart1_div"
								style="border: 1px solid #ccc; width: 340px; height: 220px;margin-left:18px;"></div></td>
						<td><div id="piechart2_div"
								style="border: 1px solid #ccc; width: 340px; height: 220px;"></div></td>
						<td><div id="piechart3_div"
								style="border: 1px solid #ccc; width: 340px; height: 220px;"></div></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</div>
<%@include file="../template/temp_shopkeeper/freepackagefooter.jsp"%>