<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="/WEB-INF/app.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- Compiled and minified Materialize CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
<!-- icons -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link href="<app:uri src="/assets/css/global.css"/>" rel="stylesheet">
<link href="<app:uri src="/assets/css/materialize.clockpicker.css"/>"
	rel="stylesheet">
<!-- Compiled and minified Materialize JavaScript -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dino Planner - Login</title>
</head>
<body>
	<%@ include file="../header.jsp"%>


	<main>

	<div class="container">
		<h3>Créer un événement</h3>

		<form action="addEventAction" method="Post">
			<div class="row">
				<div class="input-field col s12">
					<i class="material-icons prefix">label</i>
					<label for="name">Intitulé</label> <input id="name" type="text"
						name="name">
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12">
					<i class="material-icons prefix">location_on</i>
					<label for="address">Adresse</label> <input id="address"
						type="text" name="address">
				</div>
			</div>
			<div class="row">
				<div class="input-field col s4">
					<i class="material-icons prefix">today</i>
					<label for="start_date">Date de début</label> <input
						id="start_date" type="date" class="datepicker" name="start_date">
				</div>
				<div class="input-field col s2">
					<label for="start_time">Heure de début</label> <input
						id="start_time" type="time" class="timepicker" name="start_time">
				</div>
				<div class="input-field col s4">
					<i class="material-icons prefix">today</i>
					<label for="end_date">Date de fin</label> <input id="end_date"
						type="date" class="datepicker" name="end_date">
				</div>
				<div class="input-field col s2">
					<label for="end_time">Heure de fin</label> <input id="end_time"
						type="time" class="timepicker" name="end_time">
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12">
					<i class="material-icons prefix">description</i>
					<label for="description">Description</label>
					<textarea id="description" class="materialize-textarea"
						name="description"></textarea>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s3">
					<input type="checkbox" class="filled-in" id="publication"
						name="publication" checked="checked" /> <label for="publication">Publication
						immédiate</label>
				</div>
			</div>
			<div class="row" style="margin-top:60px;">
				<div class="center">
					<button class="btn waves-effect waves-light" type="submit"
						name="action" id="connect">
						Publier l'événement <i class="material-icons right">send</i>
					</button>
				</div>
			</div>
		</form>


	</div>

	</main>

	<%@ include file="../footer.jsp"%>

	<script type="text/javascript"
		src="<app:uri src="/assets/js/lib/jquery-2.1.1.min.js"/>"></script>
	<script type="text/javascript"
		src="<app:uri src="/assets/js/lib/materialize.min.js"/>"></script>
	<script type="text/javascript"
		src="<app:uri src="/assets/js/lib/materialize.clockpicker.js"/>"></script>
	<script type="text/javascript"
		src="<app:uri src="/assets/js/addEvent.js"/>"></script>

</body>
</html>