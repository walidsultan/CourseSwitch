<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="crudLinks">
	<a href="<spring:url value="/userStories/add"/>">Add Course</a>
</div>

<c:forEach items="${courses}" var="course">
	<div class="item">
		<div class="thumbnail">
			<div class="caption">
				<h3>${course.registeredCourse.name}</h3>

				<p>
					Start Date:
					<fmt:formatDate value="${course.registeredCourse.endDate}"
						var="formattedStartDate" type="date" pattern="MM-dd-yyyy" />${formattedStartDate}</p>
				<p>
					End Date:
					<fmt:formatDate value="${course.registeredCourse.startDate}" var="formattedEndDate"
						type="date" pattern="MM-dd-yyyy" />${formattedEndDate}</p>

				<p>
				
				<p>

					<a class="btn"
						href="<spring:url value="/RegisteredCourses/preferredCourses/${course.id}"/>">Preferred Courses</a>


					<a class="btn deleteCourse"
						deleteUrl="<spring:url value="/RegisteredCourses/delete/${course.id}"/>">Delete</a>

				</p>

			</div>
		</div>
	</div>
</c:forEach>

