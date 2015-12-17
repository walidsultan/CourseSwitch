$(document)
		.ready(
				function() {

					$('.addPreferredCourse').click(function() {
						var chartWidth = 400;
						var chartHeight = 200;

						$.blockUI({
							message : $('#divSelectCourse'),
							css : {
								border : 'none',
								top : ($(window).height() - chartHeight) / 2,
								left : ($(window).width() - chartWidth) / 2,
								width : chartWidth
							},
							onBlock : function() {
								$(".blockOverlay").on('click', function() {
									$.unblockUI();
								})
							},
							overlayCSS : {
								cursor : 'default'
							}

						});
					});

					$('#divSelectCourse .submit')
							.click(
									function() {
										var prefCourseId = $(
												'#selectPrefCourses').val();
										var regCourseId = $(
												'#registeredCourseId').val();

										$
												.ajax({
													url : '/courseswitch/RegisteredCourses/preferredCourses/Add',
													type : 'GET',
													data : {
														preferredCourseId : prefCourseId,
														registeredCourseId : regCourseId
													},
													dataType : 'text json',
													contentType : "application/json",
													success : function(response) {

													},
													error : function(error) {
														if (error.statusText == "OK") {
															if (error.responseText == "success") {
																
															} else if (error.responseText == "match") {

																var r = window
																		.confirm("Match found, do you want to switch your course?");

																if (r == true) {

																} else {
																	
																}

															}
															
															$(
															'.preferredCourses')
															.append(
																	'<div class="prefCourse">'
																			+ $(
																					"#selectPrefCourses option:selected")
																					.text()
																			+ '</div>')
													$.unblockUI();
														}
													}
												});
									});
				});
