<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	
	<%@ include file="common.jsp" %>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                     Witaj na portalu!
                </div>
                <div class="panel-body">
                	<form action="zamowienie" method="get">
                		<input type="radio" name ="restauracjaRBtn" value="restauracja1" checked>Restauracja1<br>
						<input type="radio" name ="restauracjaRBtn" value="restauracja2">Restauracja2<br>
						<input type="radio" name ="restauracjaRBtn" value="restauracja3">Restauracja3<br>
						<button class="btn btn-info pull-center" type="submit">Zatwierdz</button>
					</form>
                </div>
            </div>
        </div>
     </div>
</div>

</body>
</html>