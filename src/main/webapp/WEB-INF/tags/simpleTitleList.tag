<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ attribute name="list" required="true" type="java.util.List"%>


	<c:forEach items="${list}" var="item" varStatus="loop">
		<h2>${item.title}</h2>

		<c:forEach items="${item.list}" var="subitem">
			<p>
				<a href="#">${subitem.title}</a> ${ subitem.description}
			</p>
		</c:forEach>
	</c:forEach>

