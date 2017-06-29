<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ attribute name="list" required="true" type="java.util.List"%>


<c:forEach items="${list}" var="item" varStatus="loop">
	<div class="card">
		<div class="card-header" role="tab" id="heading${loop.index}">
			<h5>
				<a class="collapsed" data-toggle="collapse" data-parent="#accordion"
					href="#collapse${loop.index}" aria-expanded="false"
					aria-controls="collapse${loop.index}"> ${item.title} </a>
			</h5>
		</div>

		<div id="collapse${loop.index}" class="collapse" role="tabpanel"
			aria-labelledby="heading${loop.index}">
			<div class="card-block">${item.description}</div>

			<c:if test="${not empty item.list}">
				<div class="card-block ml-5">
					<c:forEach items="${item.list}" var="subItem">
						<p class="mt-0">
							<a href="#">${subItem.title}</a> ${ subItem.description}
						</p>
					</c:forEach>
				</div>
			</c:if>
		</div>

	</div>
</c:forEach>
