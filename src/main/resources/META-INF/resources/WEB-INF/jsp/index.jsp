<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<script src="/static/js/jquery.js"></script> <!-- jQuery -->
		<script src="/static/js/bootstrap.min.js"></script> <!-- Bootstrap -->
		<script src="/static/js/jquery-ui.min.js"></script> <!-- jQuery UI -->
		<script src="/static/js/jquery.dataTables.min.js"></script>
		<link rel="stylesheet" type="text/css" href="/static/css/jquery.dataTables.css">
		<link rel="stylesheet" type="text/css" href="/static/css/style.css">
		<script src="static/races.js"></script> <!-- Custom codes -->
     </head>
	<body>
		<select name="raceSelect" id="raceSelect"></select>
		<br>
		<br>
		<br>
		<table id="property-overview">
			<thead>
	            <tr>
	                <th>id</th>
	                <th>name</th>
	                <th>rank</th>
	            </tr>
	        </thead>

			<%--<tfoot>--%>
			<%--<tr>--%>
				<%--<th>id</th>--%>
				<%--<th>name</th>--%>
				<%--<th>rank</th>--%>
			<%--</tr>--%>
			<%--</tfoot>--%>
			<tbody>
			<%--<tr>--%>
				<%--<td>1</td>--%>
				<%--<td>test</td>--%>
				<%--<td>test</td>--%>
			<%--</tr>--%>
			<%--<tr>--%>
				<%--<td>1</td>--%>
				<%--<td>test</td>--%>
				<%--<td>test</td>--%>
			<%--</tr>--%>
			<%--<tr>--%>
				<%--<td>1</td>--%>
				<%--<td>test</td>--%>
				<%--<td>test</td>--%>
			<%--</tr>--%>
			<%--<tr>--%>
				<%--<td>1</td>--%>
				<%--<td>test</td>--%>
				<%--<td>test</td>--%>
			<%--</tr>--%>
			<%--<tr>--%>
				<%--<td>1</td>--%>
				<%--<td>test</td>--%>
				<%--<td>test</td>--%>
			<%--</tr>--%>
			<%--<tr>--%>
				<%--<td>1</td>--%>
				<%--<td>test</td>--%>
				<%--<td>test</td>--%>
			<%--</tr>--%>
			</tbody>
		</table>
	</body>
</html>