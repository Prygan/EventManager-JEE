<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="/WEB-INF/app.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav>
	<div class="nav-wrapper purple lighten-2" style="padding-left: 20px">
		<a href="<app:uri src="/"/>" class="brand-logo">Dino Planner</a>
		<ul id="nav-mobile" class="right hide-on-med-and-down">
			<%-- <li><a href="<app:uri src="/events"/>">Parcourir les évènements</a></li> --%>
			<c:choose>
				<c:when test="${sessionScope.containsKey(\"user\")}">
					<li><a href="<app:uri src="/addevent"/>">Nouvel événement</a></li>
					<li><a href="<app:uri src="/myevents"/>">Mes événements</a></li>
					<li><a href="<app:uri src="/logout"/>">Déconnexion</a></li>
				</c:when>
				<c:otherwise>
					<li class="${isLoginPage}"><a href="<app:uri src="/login"/>">S'identifier</a></li>
					<li class="${isSignupPage}"><a href="<app:uri src="/signup"/>">Créer
							un compte</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</nav>

<div class="hspace-50"></div>

<div class="container">
	<c:if test="${app:flashExist(sessionScope, \"error\")}">
		<div class="alert alert-error">${app:consumeFlash(sessionScope, "error")}</div>
	</c:if>

	<c:if test="${app:flashExist(sessionScope, \"info\")}">
		<div class="alert alert-info">${app:consumeFlash(sessionScope, "info")}</div>
	</c:if>

	<c:if test="${app:flashExist(sessionScope, \"success\")}">
		<div class="alert alert-success">${app:consumeFlash(sessionScope, "success")}</div>
	</c:if>
</div>