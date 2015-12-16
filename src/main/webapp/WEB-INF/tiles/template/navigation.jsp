<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<li><a href="<spring:url value="/"/>"><spring:message
			code="navigation.home.label" /></a></li>

<security:authorize access="hasRole('admin')">
	<li><a href="<spring:url value="/assignblockcourse/"/>"><spring:message
				code="navigation.assignblockcourse.label" /></a></li>
	<li><a href="<spring:url value="/registerstudent/"/>"><spring:message
				code="navigation.registerstudent.label" /></a></li>
</security:authorize>

<security:authorize access="hasRole('student')">
	<li><a href="<spring:url value="/AdminSubsystem/Student"/>"><spring:message
				code="navigation.student.label" /></a></li>
</security:authorize>

<security:authorize access="isAuthenticated()">
	<li><a href="<spring:url value="/logout"/>"><spring:message
				code="navigation.logout.label" /></a></li>
</security:authorize>

<security:authorize access="isAnonymous()">
	<li><a href="<spring:url value="/login"/>"><spring:message
				code="navigation.login.label" /></a></li>
</security:authorize>