<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../mycss/mycss.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../manager/headbar.jsp"%>

	<div class="container">
		<h3>您好，经理</h3>



		<table border="0" style="margin: 0 auto; margin-top: 100px">
			<tr>
				<td style="background-color: #eee; width: 400px;">
					<div align="center">
						<img src="../icon/employee.png" width="150" height="150"">
						<h4>
							<a href="../manager/employeeManagement.jsp">店员管理</a>
						</h4>
						<span class="text-muted">管理店员信息</span>
					</div>
				</td>

				<td style="background-color: #eee; width: 400px;">
					<div align="center">
						<img src="../icon/buyer.png" width="150" height="150">
						<h4>
							<a href="../manager/buyerManagement.jsp">采购员管理</a>
						</h4>
						<span class="text-muted">管理采购员信息</span>
					</div>
				</td>

				<td style="background-color: #eee; width: 400px;">
					<div align="center">
						<img src="../icon/list.png" width="150" height="150">
						<h4>
							<a href="../manager/listShow.jsp">清单明细</a>
						</h4>
						<span class="text-muted">查看销售单、采购单</span>
					</div>
				</td>
			</tr>

			<tr>

			</tr>
		</table></div>
</body>
</html>