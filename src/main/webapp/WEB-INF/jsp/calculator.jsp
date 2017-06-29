<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="initial-scale=1, shrink-to-fit=no, width=device-width"
	name="viewport">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>BP Calculators &middot; BMDL</title>
<!-- css -->
<!-- add material font (roboto) and material icon as needed -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,500,500i"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!-- add material css | replace bootstrap.css -->
<link href="/css/material.min.css" rel="stylesheet">
<!-- additional css for documentation -->
<link href="https://v4-alpha.getbootstrap.com/assets/css/docs.min.css"
	rel="stylesheet">
<link href="/css/project.min.css" rel="stylesheet">
<!-- Javascript -->
<script type='text/javascript'
	src="//cdnjs.cloudflare.com/ajax/libs/modernizr/2.7.1/modernizr.min.js"></script>
<script type="text/javascript" src="/js/project.js"></script>



<!-- js -->
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.15.0/jquery.validate.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>
<!-- add material js on top of bootstrap.js -->
<script src="/js/material.min.js"></script>
<!-- additional js for documentation -->
<script src="/js/project.min.js"></script>
<!-- additional js for form validation *******(Make page sepcific) -->
<script src="/js/form-validation-md.min.js"></script>
<!-- Calculators filter-->
<script src="/js/calc.js"></script>
<!-- Calculators filter-->
<script src="/js/flexibility.js"></script>
<!-- Popover initialisation, Setting & Content - so no XSS attacks-->
</head>
<body>

	<div class="tab-content">
		<div class="calculators">
			<div class="card d-inline-block mb-3">
				<div class="card-block p-0">
					<ul class="nav nav-tabs">
						<li class="nav-item"><a class="nav-link active"
							data-toggle="tab" href="#calculators" role="tab">A - Z</a></li>
						<li class="nav-item"><a class="nav-link" data-toggle="tab"
							href="#bySpecialty" role="tab">By Specialty</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="tab-pane active" id="calculators" role="tabpanel">
			<h2 id="Calculators-Search">Calculators Search</h2>
			<div class="calculators">
				<form action="#">
					<div class="form-search search-only">
						<input id="myInput" onkeyup="searchCalc()"
							class="form-control search-query pl-3"
							placeholder="Search for calculators" type="text"> <span
							class="material-icons">&#xE8B6;</span>
					</div>
				</form>
			</div>
			<div class="card">
				<div class="card-block">
					<div id="atoz-list">
						<t:simpleTitleList list="${calculatorList}"></t:simpleTitleList>
					</div>
				</div>
			</div>
		</div>
		<div class="tab-pane" id="bySpecialty" role="tabpanel">
			<div id=accordion role="tablist" aria-multiselectable="true">
				<t:collapsedList list="${calculatorBySpecialtyList}"></t:collapsedList>
			</div>

		</div>
	</div>

</body>
</html>