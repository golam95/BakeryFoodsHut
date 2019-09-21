
<%@include file="template/header.jsp"%>
<%@page import="com.bakeryfoodshut.serviceImpl.PostServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Post"%>
<%@page import="java.util.List"%>

<section class="banner_area">
	<section class="our_chefs_area">
		<div id="imageCarousel" class="carousel slide" data-interval="2000"
			data-ride="carousel" data-pause="hover">
			<div class="carousel-inner">
				<div class="item active">
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 10px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/img_1.png" />"
									class="img-circle" alt="Cinque Terre">

							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 10px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=Biscuit">Biscuit</a>
							</div>
						</div>
					</div>
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 10px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/img_bread.png" />"
									class="img-circle" alt="Cinque Terre">
							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 14px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=Bread">Bread</a>
							</div>
						</div>
					</div>
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 10px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/img_cake.png" />"
									class="img-circle" alt="Cinque Terre">
							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 16px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=Cake">Cake</a>
							</div>
						</div>
					</div>
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 10px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/img_cokkie.png" />"
									class="img-circle" alt="Cinque Terre">
							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 12px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=Cookie">Cookie</a>
							</div>
						</div>
					</div>
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 10px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/img_toast.png" />"
									class="img-circle" alt="Cinque Terre">
							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 16px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=Toast Biscuit">Toast</a>
							</div>
						</div>
					</div>
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 10px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/img_sweets.png" />"
									class="img-circle" alt="Cinque Terre">
							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 12px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=Bakery Sweets">Sweets</a>
							</div>
						</div>
					</div>
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 10px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/img_chanacur.png" />"
									class="img-circle" alt="Cinque Terre">
							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 5px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=chanachur">chanachur</a>
							</div>
						</div>
					</div>
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 13px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/bun.png" />"
									class="img-circle" alt="Cinque Terre">
							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 27px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=Bun">Bun</a>
							</div>
						</div>
					</div>
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 10px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/img_roll.png" />"
									class="img-circle" alt="Cinque Terre">
							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 24px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=Bread roll">Roll</a>
							</div>
						</div>
					</div>
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 10px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/img_pies.png" />"
									class="img-circle" alt="Cinque Terre">
							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 24px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=pies">pies</a>
							</div>
						</div>
					</div>
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 10px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/img_drycake.png" />"
									class="img-circle" alt="Cinque Terre">
							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 9px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=Dry Cake">Dry
									Cake</a>
							</div>
						</div>
					</div>
					<div class="col-md-1">
						<div class="item_food">
							<div class="round-area">
								<img style="width: 55px; margin-left: 10px; margin-top: 10px;"
									src="<c:url value="/resources/image/shop/slider_pastries.png" />"
									class="img-circle" alt="Cinque Terre">
							</div>
							<div style="padding: 4px;" class="title_name">
								<a
									style="color: white; margin-left: 22px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
									href="searchfooditempost.jsp?getsearchValue=Pastries">Pastries</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</section>


<section class="Productsection_item">

	<div class="container">
		<div class="row">

			<div class="col-md-12 col-sm-12">
				<div class="col-md-3 col-sm-3">


					<div class="section-showproduct-left">

						<h3 style="text-align: center; margin-bottom: 20px;">Search
							by Location</h3>

						<div id="accordion" class="panel-group">

							<div class="panel panel-default">
								<div
									style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
									class="myheader">
									<span
										style="margin-left: 8px; font-size: 15px; font-weight: bold;">Rajshahi</span>
									<a href="#pane_1" data-toggle="collapse"
										data-parent="#accordion"> <span
										style="padding-top: 7px; margin-left: 125px; color: #AD610D; font-size: 20px;"
										class="glyphicon glyphicon-plus-sign"></span>
									</a>
								</div>

								<div id="pane_1" class="panel-collapse collapse in">
									<div style="border: 1px solid #FFFFFF;" class="panel-body">
										<ul>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Joypurhat"><span
													class="glyphicon glyphicon-ok-sign"></span> Joypurhat</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Bogra"><span
													class="glyphicon glyphicon-ok-sign"></span> Bogra</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Naogaon"><span
													class="glyphicon glyphicon-ok-sign"></span> Naogaon</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Natore"><span
													class="glyphicon glyphicon-ok-sign"></span> Natore</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Nawabganj"><span
													class="glyphicon glyphicon-ok-sign"></span> Nawabganj</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Pabna"><span
													class="glyphicon glyphicon-ok-sign"></span> Pabna</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Sirajganj"><span
													class="glyphicon glyphicon-ok-sign"></span> Sirajganj</a></li>

										</ul>
									</div>
								</div>
							</div>









							<div class="panel panel-default">
								<div
									style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
									class="myheader">
									<span
										style="margin-left: 8px; font-size: 15px; font-weight: bold;">Dhaka
										City</span> <a href="#pane_21" data-toggle="collapse"
										data-parent="#accordion"> <span
										style="padding-top: 7px; margin-left: 110px; color: #AD610D; font-size: 20px;"
										class="glyphicon glyphicon-plus-sign"></span>
									</a>
								</div>

								<div id="pane_21" class="panel-collapse collapse">
									<div style="border: 1px solid #FFFFFF;" class="panel-body">
										<ul>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Airport"><span
													class="glyphicon glyphicon-ok-sign"></span> Airport</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Aminbazar"><span
													class="glyphicon glyphicon-ok-sign"></span> Aminbazar</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Adabar"><span
													class="glyphicon glyphicon-ok-sign"></span> Adabar</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Banani"><span
													class="glyphicon glyphicon-ok-sign"></span> Banani</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Badda"><span
													class="glyphicon glyphicon-ok-sign"></span> Badda</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Bashundhara"><span
													class="glyphicon glyphicon-ok-sign"></span> Bashundhara</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Boshila"><span
													class="glyphicon glyphicon-ok-sign"></span> Boshila</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Baridhara"><span
													class="glyphicon glyphicon-ok-sign"></span> Baridhara</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Charcharia"><span
													class="glyphicon glyphicon-ok-sign"></span> Charcharia</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Dhanmondi"><span
													class="glyphicon glyphicon-ok-sign"></span> Dhanmondi</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Dohar"><span
													class="glyphicon glyphicon-ok-sign"></span> Dohar</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Elenbari"><span
													class="glyphicon glyphicon-ok-sign"></span> Elenbari</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Farmgate"><span
													class="glyphicon glyphicon-ok-sign"></span> Farmgate</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Gulshan-1"><span
													class="glyphicon glyphicon-ok-sign"></span> Gulshan-1</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Gabtoli"><span
													class="glyphicon glyphicon-ok-sign"></span> Gabtoli</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Gulshan"><span
													class="glyphicon glyphicon-ok-sign"></span> Gulshan</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Hazratpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Hazratpur</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Hazaribag"><span
													class="glyphicon glyphicon-ok-sign"></span> Hazaribag</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Hizla"><span
													class="glyphicon glyphicon-ok-sign"></span> Hizla</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Jatrabari"><span
													class="glyphicon glyphicon-ok-sign"></span> Jatrabari</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Khilgaon"><span
													class="glyphicon glyphicon-ok-sign"></span> Khilgaon</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Keraniganj"><span
													class="glyphicon glyphicon-ok-sign"></span> Keraniganj</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Kalabagan"><span
													class="glyphicon glyphicon-ok-sign"></span> Kalabagan</a></li>


											<li><a
												href="searchfooditempost.jsp?getsearchValue=Karwan Bazar"><span
													class="glyphicon glyphicon-ok-sign"></span> Karwan Bazar</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Kallyanpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Kallyanpur</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Khilkhet"><span
													class="glyphicon glyphicon-ok-sign"></span> Khilkhet</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Kakrail"><span
													class="glyphicon glyphicon-ok-sign"></span> Kakrail</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Kafrul"><span
													class="glyphicon glyphicon-ok-sign"></span> Kafrul</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Lalkuthi"><span
													class="glyphicon glyphicon-ok-sign"></span> Lalkuthi</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Lalmatia"><span
													class="glyphicon glyphicon-ok-sign"></span> Lalmatia</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Mirpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Mirpur</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Motijheel"><span
													class="glyphicon glyphicon-ok-sign"></span> Motijheel</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Matuail"><span
													class="glyphicon glyphicon-ok-sign"></span> Matuail</a></li>


											<li><a
												href="searchfooditempost.jsp?getsearchValue=Mohakhali DOHS"><span
													class="glyphicon glyphicon-ok-sign"></span> Mohakhali DOHS</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Mohakhali"><span
													class="glyphicon glyphicon-ok-sign"></span> Mohakhali</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Monipur"><span
													class="glyphicon glyphicon-ok-sign"></span> Monipur</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Mohammadpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Mohammadpur</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Matuail"><span
													class="glyphicon glyphicon-ok-sign"></span> Matuail</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Nawabganj"><span
													class="glyphicon glyphicon-ok-sign"></span> Nawabganj</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Paikpara"><span
													class="glyphicon glyphicon-ok-sign"></span> Paikpara</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Pirerbag"><span
													class="glyphicon glyphicon-ok-sign"></span> Pirerbag</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Matuail"><span
													class="glyphicon glyphicon-ok-sign"></span> Matuail</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Rampura"><span
													class="glyphicon glyphicon-ok-sign"></span> Rampura</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Rayer Bazaar"><span
													class="glyphicon glyphicon-ok-sign"></span> Rayer Bazaar</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Sujapur"><span
													class="glyphicon glyphicon-ok-sign"></span> Sujapur</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Shyamoli"><span
													class="glyphicon glyphicon-ok-sign"></span> Shyamoli</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Savar"><span
													class="glyphicon glyphicon-ok-sign"></span> Savar</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Sutrapur"><span
													class="glyphicon glyphicon-ok-sign"></span> Sutrapur</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Sher-E-Bangla Nagar"><span
													class="glyphicon glyphicon-ok-sign"></span> Sher-E-Bangla
													Nagar</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Ibrahimpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Ibrahimpur</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Uttara"><span
													class="glyphicon glyphicon-ok-sign"></span> Uttara</a></li>

										</ul>
									</div>
								</div>
							</div>
























							<div class="panel panel-default">
								<div
									style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
									class="myheader">
									<span
										style="margin-left: 8px; font-size: 15px; font-weight: bold;">Rangpur</span>
									<a href="#pane_2" data-toggle="collapse"
										data-parent="#accordion"> <span
										style="padding-top: 7px; margin-left: 126px; color: #AD610D; font-size: 20px;"
										class="glyphicon glyphicon-plus-sign"></span>
									</a>
								</div>

								<div id="pane_2" class="panel-collapse collapse">
									<div style="border: 1px solid #FFFFFF;" class="panel-body">
										<ul>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Dinajpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Dinajpur</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Gaibandha"><span
													class="glyphicon glyphicon-ok-sign"></span> Gaibandha</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Kurigram"><span
													class="glyphicon glyphicon-ok-sign"></span> Kurigram</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Lalmonirhat"><span
													class="glyphicon glyphicon-ok-sign"></span> Lalmonirhat</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Nilphamari"><span
													class="glyphicon glyphicon-ok-sign"></span> Nilphamari</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Panchagarh"><span
													class="glyphicon glyphicon-ok-sign"></span> Panchagarh</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Thakurgaon"><span
													class="glyphicon glyphicon-ok-sign"></span> Thakurgaon</a></li>

										</ul>
									</div>
								</div>
							</div>

							<div class="panel panel-default">
								<div
									style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
									class="myheader">
									<span
										style="margin-left: 8px; font-size: 15px; font-weight: bold;">Barisal</span>
									<a href="#pane_3" data-toggle="collapse"
										data-parent="#accordion"> <span
										style="padding-top: 7px; margin-left: 137px; color: #AD610D; font-size: 20px;"
										class="glyphicon glyphicon-plus-sign"></span>
									</a>
								</div>

								<div id="pane_3" class="panel-collapse collapse">
									<div style="border: 1px solid #FFFFFF;" class="panel-body">
										<ul>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Barguna"><span
													class="glyphicon glyphicon-ok-sign"></span> Barguna</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Bhola"><span
													class="glyphicon glyphicon-ok-sign"></span> Bhola</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Jhalokati"><span
													class="glyphicon glyphicon-ok-sign"></span> Jhalokati</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Patuakhali"><span
													class="glyphicon glyphicon-ok-sign"></span> Patuakhali</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Pirojpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Pirojpur</a></li>

										</ul>
									</div>
								</div>
							</div>


							<div class="panel panel-default">
								<div
									style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
									class="myheader">
									<span
										style="margin-left: 8px; font-size: 15px; font-weight: bold;">Chittagong</span>
									<a href="#pane_4" data-toggle="collapse"
										data-parent="#accordion"> <span
										style="padding-top: 7px; margin-left: 108px; color: #AD610D; font-size: 20px;"
										class="glyphicon glyphicon-plus-sign"></span>
									</a>
								</div>

								<div id="pane_4" class="panel-collapse collapse">
									<div style="border: 1px solid #FFFFFF;" class="panel-body">
										<ul>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Bandarban"><span
													class="glyphicon glyphicon-ok-sign"></span> Bandarban</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Brahmanbaria"><span
													class="glyphicon glyphicon-ok-sign"></span> Brahmanbaria</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Chandpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Chandpur</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Comilla"><span
													class="glyphicon glyphicon-ok-sign"></span> Comilla</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Cox's Bazar"><span
													class="glyphicon glyphicon-ok-sign"></span> Cox's Bazar</a></li>
											<li><a href="searchfooditempost.jsp?getsearchValue=Feni"><span
													class="glyphicon glyphicon-ok-sign"></span> Feni</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Khagrachhari"><span
													class="glyphicon glyphicon-ok-sign"></span> Khagrachhari</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Lakshmipur"><span
													class="glyphicon glyphicon-ok-sign"></span> Lakshmipur</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Noakhali"><span
													class="glyphicon glyphicon-ok-sign"></span> Noakhali</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Rangamati"><span
													class="glyphicon glyphicon-ok-sign"></span> Rangamati</a></li>
										</ul>
									</div>
								</div>
							</div>

							<div class="panel panel-default">
								<div
									style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
									class="myheader">
									<span
										style="margin-left: 8px; font-size: 15px; font-weight: bold;">Dhaka</span>
									<a href="#panel_5" data-toggle="collapse"
										data-parent="#accordion"> <span
										style="padding-top: 7px; margin-left: 142px; color: #AD610D; font-size: 20px;"
										class="glyphicon glyphicon-plus-sign"></span>
									</a>
								</div>

								<div id="panel_5" class="panel-collapse collapse">
									<div style="border: 1px solid #FFFFFF;" class="panel-body">
										<ul>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Faridpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Faridpur</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Gazipur"><span
													class="glyphicon glyphicon-ok-sign"></span> Gazipur</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Gopalganj"><span
													class="glyphicon glyphicon-ok-sign"></span> Gopalganj </a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Jamalpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Jamalpur</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Kishoreganj"><span
													class="glyphicon glyphicon-ok-sign"></span> Kishoreganj</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Madaripur"><span
													class="glyphicon glyphicon-ok-sign"></span> Madaripur</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Manikganj"><span
													class="glyphicon glyphicon-ok-sign"></span> Manikganj</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Munshiganj"><span
													class="glyphicon glyphicon-ok-sign"></span> Munshiganj</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Mymensingh"><span
													class="glyphicon glyphicon-ok-sign"></span> Mymensingh</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Narayanganj"><span
													class="glyphicon glyphicon-ok-sign"></span> Narayanganj</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Netrokona"><span
													class="glyphicon glyphicon-ok-sign"></span> Netrokona</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Rajbari"><span
													class="glyphicon glyphicon-ok-sign"></span> Rajbari</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Shariatpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Shariatpur</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Sherpurs"><span
													class="glyphicon glyphicon-ok-sign"></span> Sherpurs</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Tangail"><span
													class="glyphicon glyphicon-ok-sign"></span> Tangail</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Narsingdi"><span
													class="glyphicon glyphicon-ok-sign"></span> Narsingdi</a></li>
										</ul>
									</div>
								</div>
							</div>


							<div class="panel panel-default">
								<div
									style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
									class="myheader">
									<span
										style="margin-left: 8px; font-size: 15px; font-weight: bold;">Khulna</span>
									<a href="#panel_6" data-toggle="collapse"
										data-parent="#accordion"> <span
										style="padding-top: 7px; margin-left: 138px; color: #AD610D; font-size: 20px;"
										class="glyphicon glyphicon-plus-sign"></span>
									</a>
								</div>

								<div id="panel_6" class="panel-collapse collapse">
									<div class="panel-body">
										<ul>


											<li><a
												href="searchfooditempost.jsp?getsearchValue=Bagerhat"><span
													class="glyphicon glyphicon-ok-sign"></span> Bagerhat</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Chuadanga"><span
													class="glyphicon glyphicon-ok-sign"></span> Chuadanga</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Jessore"><span
													class="glyphicon glyphicon-ok-sign"></span> Jessore</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Jhenaida"><span
													class="glyphicon glyphicon-ok-sign"></span> Jhenaida</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Kushtia"><span
													class="glyphicon glyphicon-ok-sign"></span> Kushtia</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Magura"><span
													class="glyphicon glyphicon-ok-sign"></span> Magura</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Meherpur"><span
													class="glyphicon glyphicon-ok-sign"></span> Meherpur</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Narail"><span
													class="glyphicon glyphicon-ok-sign"></span> Narail</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Satkhira"><span
													class="glyphicon glyphicon-ok-sign"></span> Satkhira</a></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="panel panel-default">
								<div
									style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
									class="myheader">
									<span
										style="margin-left: 8px; font-size: 15px; font-weight: bold;">Sylhet
									</span> <a href="#panel_7" data-toggle="collapse"
										data-parent="#accordion"> <span
										style="padding-top: 7px; margin-left: 144px; color: #AD610D; font-size: 20px;"
										class="glyphicon glyphicon-plus-sign"></span>
									</a>
								</div>
								<div id="panel_7" class="panel-collapse collapse">
									<div class="panel-body">
										<ul>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Habiganj"><span
													class="glyphicon glyphicon-ok-sign"></span> Habiganj</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Moulvibazar"><span
													class="glyphicon glyphicon-ok-sign"></span> Moulvibazar</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Sunamganj"><span
													class="glyphicon glyphicon-ok-sign"></span> Sunamganj</a></li>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="section-showproduct-left">
						<h3 style="text-align: center; margin-bottom: 20px;">Search
							by Category</h3>
						<div id="accordion" class="panel-group">

							<div class="panel panel-default">
								<div
									style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
									class="myheader">
									<span
										style="margin-left: 8px; font-size: 15px; font-weight: bold;">Consumer</span>
									<a href="#panelBodyFour" data-toggle="collapse"
										data-parent="#accordion"> <span
										style="padding-top: 7px; margin-left: 112px; color: #AD610D; font-size: 20px;"
										class="glyphicon glyphicon-plus-sign"></span>
									</a>
								</div>

								<div id="panelBodyFour" class="panel-collapse collapse">
									<div style="border: 1px solid #FFFFFF;" class="panel-body">
										<ul>
											<li><a href="searchfooditempost.jsp?getsearchValue=All"><span
													class="glyphicon glyphicon-ok-sign"></span> All</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Children"><span
													class="glyphicon glyphicon-ok-sign"></span> Children</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Middle-Aged"><span
													class="glyphicon glyphicon-ok-sign"></span> Middle-Aged</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Adult"><span
													class="glyphicon glyphicon-ok-sign"></span> Adult</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Diabetes
													patients"><span
													class="glyphicon glyphicon-ok-sign"></span> Diabetes
													patients</a></li>
										</ul>
									</div>
								</div>
							</div>

							<div class="panel panel-default">
								<div
									style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
									class="myheader">
									<span
										style="margin-left: 8px; font-size: 15px; font-weight: bold;">Price</span>
									<a href="#panelBodytwo" data-toggle="collapse"
										data-parent="#accordion"> <span
										style="padding-top: 7px; margin-left: 153px; color: #AD610D; font-size: 20px;"
										class="glyphicon glyphicon-plus-sign"></span>
									</a>
								</div>

								<div id="panelBodytwo" class="panel-collapse collapse">
									<div class="panel-body">
										<ul>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Low price"><span
													class="glyphicon glyphicon-ok-sign"></span> Low price</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=High price"><span
													class="glyphicon glyphicon-ok-sign"></span> High price</a></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="panel panel-default">
								<div
									style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
									class="myheader">
									<span
										style="margin-left: 8px; font-size: 15px; font-weight: bold;">Discount
									</span> <a href="#panelBodythree" data-toggle="collapse"
										data-parent="#accordion"> <span
										style="padding-top: 7px; margin-left: 124px; color: #AD610D; font-size: 20px;"
										class="glyphicon glyphicon-plus-sign"></span>
									</a>
								</div>
								<div id="panelBodythree" class="panel-collapse collapse">
									<div class="panel-body">
										<ul>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=10 percent"><span
													class="glyphicon glyphicon-ok-sign"></span> 10 percent</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=20 percent"><span
													class="glyphicon glyphicon-ok-sign"></span> 20 percent</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=30 percent"><span
													class="glyphicon glyphicon-ok-sign"></span> 30 percent</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=40 percent"><span
													class="glyphicon glyphicon-ok-sign"></span> 40 percent</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=50 percent"><span
													class="glyphicon glyphicon-ok-sign"></span> 50 </a></li>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="section-showproduct-left">
						<img
							src="	<c:url value="/resources/image/shop/discountbanner.PNG" />"
							alt="Cinque Terre" width="240" height="382">
					</div>
				</div>
				<div class="col-md-9 col-sm-9">
					<%
						PostServiceImpl retrivepost = new PostServiceImpl();
						String getsearchValue = "";
						int coutsearchProduct = 0;
						if (request.getParameter("getsearchValue") != null) {
							getsearchValue = (String) request.getParameter("getsearchValue");
						}
						for (Post p : retrivepost.searchListPost(getsearchValue)) {
							coutsearchProduct += 1;
					%>
					<div class="section-showproduct-right">
						<div class="section-element">
							<div class="col-md-3 col-sm-3">
								<img src="uploads/post/<%=p.getImg()%>" alt="<%=p.getImg()%>"
									width=200 height=100 />
							</div>
							<div class="col-md-4 col-sm-4">
								<h4>
									Product Name: <span><%=p.getProductName()%></span>
								</h4>
								<h5 style="font-weight: bold;">
									Email: <span><%=p.getShopkeeperEmail()%></span>
								</h5>
								<h5 style="margin-bottom: 12px; font-weight: bold;">
									Shop Location: <span><%=p.getPostArea()%></span>
								</h5>
								<h5>
									Date: <span><%=p.getPostDate()%></span>
								</h5>
							</div>
							<div class="col-md-2 col-sm-2">
								<h5
									style="margin-top: 15px; font-size: 15px; margin-bottom: 16px;">Quantity</h5>
								<h2
									style="font-size: 14px; font-weight: bold; margin-top: 5px; margin-bottom: 27px; margin-left: 5px;"><%=p.getPostQuantity()%>
									<%=p.getPostWeight()%>.
								</h2>

								<%
									if (p.getPostQuantity() <= 0) {
								%>
								<h5 style="color: red;">Not Available</h5>

								<%
									} else {
								%>
								<h5 style="color: green;">Available</h5>
								<%
									}
								%>
							</div>
							<div class="col-md-3 col-sm-3">
								<h4 style="margin-left: 39px; margin-bottom: 4px;">
									<a
										style="font-size: 14px; padding: 4px; border: 1px solid #AD610D; color: #AD610D; border-radius: 2px;"
										href="shopkeeperOwnerprofile.jsp?ownerDetails=<%=p.getShopkeeperEmail()%>">Contact
										Me</a>
								</h4>
								<h5 style="margin-left: 40px; color: #211D31;">
									(<%=p.getPrice()%>
									Tk.)
									<%=p.getPostWeight()%></h5>
								<%
									if (p.getPostDiscount().equals("0 percent")) {
								%>
								<br />
								<%
									} else {
								%>

								<%
									if (p.getPostDiscount().equals("10 percent")) {
								%>
								<h6
									style="font-weight: bold; margin-top: 5px; text-align: center; color: red; margin-bottom: 9px;">
									Discount: 10%</h6>
								<%
									} else if (p.getPostDiscount().equals("20 percent")) {
								%>
								<h6
									style="font-weight: bold; margin-top: 5px; text-align: center; color: red; margin-bottom: 9px;">
									Discount: 20%</h6>

								<%
									} else if (p.getPostDiscount().equals("30 percent")) {
								%>
								<h6
									style="font-weight: bold; margin-top: 5px; text-align: center; color: red; margin-bottom: 9px;">
									Discount: 30%</h6>

								<%
									} else if (p.getPostDiscount().equals("40 percent")) {
								%>
								<h6
									style="font-weight: bold; margin-top: 5px; text-align: center; color: red; margin-bottom: 9px;">
									Discount: 40%</h6>
								<%
									} else if (p.getPostDiscount().equals("50 percent")) {
								%>
								<h6
									style="font-weight: bold; margin-top: 5px; text-align: center; color: red; margin-bottom: 9px;">
									Discount: 50%</h6>

								<%
									}
								%>

								<%
									}
								%>
								<%
									if (p.getPostQuantity() <= 0) {
								%>
								<p
									style="background: #331A00; border-radius: 3px; color: #D0DDC2; margin-left: 50px; width: 81px; text-align: center; font-size: 14px;">View
									Details</p>

								<%
									} else {
								%>

								<a
									style="padding: 5px; background: #331A00; border-radius: 3px; color: #D0DDC2; margin-left: 50px;"
									href="viewpostDetails.jsp?viewpostDetails=<%=p.getPostId()%>">View
									Details</a>
								<%
									}
								%>

							</div>
						</div>
					</div>

					<%
						}
					%>

					<%
						if (coutsearchProduct == 0) {
					%>
					<h3
						style="font-weight: bold; padding-top: 18px; padding-left: 100px; font-size: 30px;">Sorry,
						Search item not found!!</h3>
					<%
						}
					%>

				</div>
			</div>
		</div>
	</div>
</section>
<%@include file="template/footer1.jsp"%>