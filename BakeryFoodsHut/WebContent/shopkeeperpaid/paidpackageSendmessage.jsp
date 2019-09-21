
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>
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
		<div class="container">
			<div class="row col-md-offset-2">
				<h3
					style="text-align: center; font-weight: bold; margin-bottom: 30px;">***Send
					message to Bakery Food's Hut Settings ***</h3>
				<div class="col-md-3 col-md-offset-9">
					<div class="button_alignment">
						<div style="margin-bottom: 10px;" class="t"></div>
					</div>
				</div>

				<form>
					<div class="col-md-8 col-md-offset-3">
						<div class="form-group">
							<div class="col-sm-10">
								<input type="hidden" id="useremail" value="<%=username%>">
								<label for="inputUserName" class="control-label">Write
									your comment </label>
								<textarea
									style="border: 1px solid #39302B; height: 215px; margin-bottom: 18px;"
									class="form-control" rows="5" id="comment" required></textarea>
							</div>
						</div>

						<div class="form-group">
							<br />
							<div class="col-md-11">
								<button
									style="background: #22202E; border: 2px solid #22202E; color: #FFFFFF;"
									type="submit" class="btn" id="SENDMESSAGE_BFH">Send
									Message</button>
								<a href="../ManageShopkeeperpage?action=CANCELSHOPKEEPER"
									style="background: #22202E; border: 2px solid #22202E; color: #FFFFFF;"
									type="submit" class="btn">Cancel</a>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript"
	src="<c:url value="../resources/js/jquery.js" />"></script>
<script type="text/javascript">
	$(document).ready(function() {

		$('#SENDMESSAGE_BFH').click(function() {
			var useremail = $('#useremail').val();
			var comment = $('#comment').val();

			if ($.trim(comment) == '') {

				alert("Sorry,Empty field found!!");

			} else {

				$.ajax({
					method : 'POST',
					data : {
						useremail : useremail,
						comment : comment,
						action : 'BFH_SENDMESSAGE'
					},
					url : '../ManageShopkeeperPaid',
					dataType : "text",
					success : function(result) {
						alert("Successfully, Send your message!!");
						$('#comment').val("");
					}
				});
				return false;
			}
		});
	});
</script>

<%@include file="../template/temp_shopkeeper/freepackagefooter.jsp"%>