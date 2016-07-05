<%-- 
    Document   : consulta
    Created on : 05-07-2016, 3:19:48
    Author     : Victor Manuel Araya
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" href="imagenes/logo_mini.png" />

    <title>SyncPet :: Toma de Horas en Línea</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/small-business.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script>
        function validaRut(rut){
            rut = rut.replace(".", "");
            rut = rut.replace(".", "");
            var rexp = new RegExp(/^([0-9])+\-([kK0-9])+$/);
            if(rut.match(rexp)){
                var RUT = rut.split("-");
                var elRut = RUT[0];
                elRut = elRut.split("");
                var factor = 2;
                var suma = 0;
                var dv;
                for(i=(elRut.length-1); i>=0; i--){
                    factor = factor > 7 ? 2 : factor;
                    suma += parseInt(elRut[i])*parseInt(factor++);
                }
                dv = 11 -(suma % 11);
                if(dv == 11){
                    dv = 0;
                }else if (dv == 10){
                    dv = "k";
                }
                if(dv == RUT[1].toLowerCase()){
                    return true;
                }else{         
                    alert("El rut es incorrecto");
                    return false;
                }
            }else{     
                alert("Formato incorrecto");
                return false;
            }
        }
        
        function formato_rut(rut)
        {
            var sRut1 = rut;   	//contador de para saber cuando insertar el . o la -
            var nPos = 0; //Guarda el rut invertido con los puntos y el guión agregado
            var sInvertido = ""; //Guarda el resultado final del rut como debe ser
            var sRut = "";
            for(var i = sRut1.length - 1; i>= 0; i-- )
            {
                    sInvertido += sRut1.charAt(i);
                    if (i == sRut1.length - 1 )
                            sInvertido += "-";
                    else if (nPos == 3)
                    {
                            sInvertido += ".";
                            nPos = 0;
                    }
                    nPos++;
            }
            for(var j = sInvertido.length - 1; j >= 0; j-- )
            {
                    if (sInvertido.charAt(sInvertido.length - 1) != ".")
                            sRut += sInvertido.charAt(j);
                    else if (j != sInvertido.length - 1 )
                            sRut += sInvertido.charAt(j);
            }
            //Pasamos al campo el valor formateado
            return sRut.toUpperCase();
        }
        
        function validarRegistro(rut) {
            if(rut.length != 0) {
                document.getElementById("txtRutPropietario").value = formato_rut(rut);
                rut = document.getElementById("txtRutPropietario").value;
                if(!validaRut(rut)) {
                    document.getElementById("txtRutPropietario").value = "";
                    document.getElementById("txtRutPropietario").focus();
                }else{
                    document.getElementById("txtNombres").focus();
                }
            }
        }
        
        function validarPaso2(rut) {
            if(rut.length != 0) {
                document.getElementById("txtRut").value = formato_rut(rut);
                rut = document.getElementById("txtRut").value;
                if(!validaRut(rut)) {
                    document.getElementById("txtRut").value = "";
                    document.getElementById("txtRut").focus();
                }else{
                    document.getElementById("cmbPaciente").focus();
                }
            }
        }
        
    </script>
</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#" title="Volver al Home">
                    <img src="imagenes/logoWebClient.png" width="25%" alt="Home" title="Volver al Home" />
                </a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="#">&nbsp;</a></li>
                    <li><a href="#">&nbsp;</a></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

        <!-- Heading Row -->
        <div class="row">
            <div class="col-md-6">
                <img class="img-responsive img-rounded" src="imagenes/logoWebClient.png" alt="">
            </div>
            <!-- /.col-md-8 -->
            <div class="col-md-6">
                <h2>Consulta de Hora Agendada</h2>
                <p align="justify">Por favor ingrese su rut para obtener la información de los diferentes agendamientos realizados ordenados desde el más nuevo al mas antiguo.</p>
                <form action="consultaAgenda" method="post">
                    <div class="form-group">
                      <label for="txtRutPropietario">Rut Propietario</label>
                      <input type="text" class="form-control" id="txtRutPropietario" name="txtRutPropietario" placeholder="12.345.678-9" onblur="validarRegistro(this.value);" onclick="this.value= ''; ">
                      <p class="help-block">${mensaje}</p>
                    </div>
                    <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-send" aria-hidden="true"></span> Consultar</button>
                    <a class="btn btn-default btn" href="reservar"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Volver al Home</a>
                </form>
            </div>
            <!-- /.col-md-4 -->
        </div>
        <!-- /.row -->

        <hr>
        <c:if test="${propietario != null}">
            <!-- Call to Action Well -->
            <div class="row" id="resultados">
                <div class="col-lg-12">
                    <div class="well text-center">
                        <b>Aquí esta la información sobre su última consulta médica agendada!</b>
                    </div>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        
            <!-- Content Row -->
            <div class="row">
                <div class="col-md-4">
                    <h2>Información General</h2>
                    <table class="table table-bordered">
                        <tr>
                            <td>Propietario</td>
                            <td><c:out value="${propietario.getNombres()}"></c:out> <c:out value="${propietario.getApaterno()}"></c:out></td>
                        </tr>
                        <tr>
                            <td>Paciente</td>
                            <td><c:out value="${detalle.getMascota().getNombre()}"></c:out></td>
                        </tr>
                        <tr>
                            <td>Fecha</td>
                            <td><fmt:formatDate pattern="dd" value="${fecha}" /> de <fmt:formatDate pattern="MMMMMM" value="${fecha}" /> de <fmt:formatDate pattern="yyyy" value="${fecha}" /></td>
                        </tr>
                        <tr>
                            <td>Hora</td>
                            <td><fmt:formatDate pattern="HH:mm:ss" value="${fecha}" /> Horas</td>
                        </tr>
                    </table>
                </div>
                <!-- /.col-md-4 -->
                <div class="col-md-4">
                    <h2>Sucursal</h2>
                    <table class="table table-bordered">
                        <tr>
                            <td>Sucursal</td>
                            <td><c:out value="${agenda.getSucursal().getNombre()}"></c:out></td>
                        </tr>
                        <tr>
                            <td>Dirección</td>
                            <td><c:out value="${agenda.getSucursal().getDireccion()}"></c:out></td>
                        </tr>
                        <tr>
                            <td>Comuna</td>
                            <td><c:out value="${agenda.getSucursal().getComuna().getNombre()}"></c:out></td>
                        </tr>
                    </table>
                </div>
                <!-- /.col-md-4 -->
                <div class="col-md-4">
                    <h2>Especialista</h2>
                    <table class="table table-bordered">
                        <tr>
                            <td>Dr.</td>
                            <td><c:out value="${detalle.getVeterinario().getNombres()}"></c:out> <c:out value="${detalle.getVeterinario().getApaterno()}"></c:out> <c:out value="${detalle.getVeterinario().getAmaterno()}"></c:out></td>
                        </tr>
                        <tr>
                            <td>Especialidad</td>
                            <td><c:out value="${detalle.getVeterinario().getEspecialidad()}"></c:out></td>
                        </tr>
                    </table>
                </div>
                <!-- /.col-md-4 -->
            </div>
            <!-- /.row -->
        </c:if>
            
            
        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; 2016 StarLabs Syncpet WebClient :: Powered by Alejandro Astroza & Victor Araya</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
