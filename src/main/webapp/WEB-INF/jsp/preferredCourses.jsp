<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javascript"
	src="/courseswitch/resource/js/jquery.blockUI.js"></script>

<script type="text/javascript" src="/courseswitch/resource/js/preferredCourses.js"></script>

<form:form modelAttribute="registeredCourse" class="form-horizontal">
	<fieldset>
		<legend>Preferred Courses</legend>
		<form:input id="registeredCourseId" path="registeredCourse.id" type="hidden" />
		
		<div class="form-group">
			<label class="control-label col-lg-2" for="name">Name: </label>
			<div class="col-lg-10">
					<div class="readonly">
						<b><c:out value="${registeredCourse.registeredCourse.name}" /></b>
						<form:input path="registeredCourse.name" type="hidden" />
					</div>
			</div>
		</div>
		<br/>
		<div class="form-group">
			<label class="control-label col-lg-2" for="name">Start Date: </label>
			<div class="col-lg-10">
					<div class="readonly">
					<fmt:formatDate value="${registeredCourse.registeredCourse.endDate}"
						var="formattedStartDate" type="date" pattern="MM-dd-yyyy" />
						<c:out value="${formattedStartDate}" />
						<form:input path="registeredCourse.startDate" type="hidden" />
					</div>
			</div>
		</div>
		<br/>
		<div class="form-group">
			<label class="control-label col-lg-2" for="name">End Date: </label>
			<div class="col-lg-10">
					<div class="readonly">
					
					<fmt:formatDate value="${registeredCourse.registeredCourse.startDate}"
						var="formattedEndDate" type="date" pattern="MM-dd-yyyy" />
						<c:out value="${formattedEndDate}" />
						<form:input path="registeredCourse.endDate" type="hidden" />
					</div>
			</div>
		</div>

<div class="form-group">
			<label class="control-label col-lg-2" for="name">Preferred Courses: </label>
			<div class="col-lg-10 preferredCourses">
				<c:forEach items="${preferredCourses}" var="course">
										<div class="prefCourse">${course.preferredCourse.name}</div>
									</c:forEach>
			
						
			</div>
			<a class="btn addPreferredCourse" >Add Preferred Course</a>
		</div>
		

	</fieldset>
</form:form>

			
	<div id="divSelectCourse" class="dialog">
		<div class="dialogHeader">
			<label>Select Preferred Course</label> <a class="closeDialog link">X</a>
		</div>
		<div class="dialogBody">
			<p>
				Course Name:   <select id="selectPrefCourses"> 
									<option value="0">Select Course</option>
									<c:forEach items="${allCourses}" var="course">
										<option value="${course.id}">${course.name}</option>
									</c:forEach>
							</select>
	                  	
			</p>
		</div>
		<div class="dialogFooter">
		
			 <a class="submit link">Submit</a>
			 <a class="closeDialog link">Close</a>
		</div>

	</div>