<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Layout Page</title>
</head>
<body>
	<table border="0" style="border-collapse: collapse;" cellpadding="2"
		cellspacing="2" align="center" width="100%">
		<tbody>
			<tr>
				<td width="20%" rowspan="4"><tiles:insertAttribute
						name="navigation" /></td>
				<td width="80%" height="20%"><tiles:insertAttribute
						name="header" /></td>
			</tr>
			<tr>
				<td width=20% rowspan="1"><tiles:insertAttribute name="include" />
				</td>
			</tr>
			<tr>
				<td width=80% height="60%"><tiles:insertAttribute
						name="content" /></td>
			</tr>
			<tr>
				<td width=20% height="20%"><tiles:insertAttribute name="footer" />
				</td>
			</tr>
			
			
		</tbody>
	</table>
</body>