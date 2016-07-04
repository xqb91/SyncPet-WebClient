<%-- 
    Document   : reserva
    Created on : 03-07-2016, 18:54:55
    Author     : Victor Manuel Araya
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <img src="imagenes/logo_aplicacion_slide.png" width="25%" alt="Home" title="Volver al Home" />
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
            <div class="col-md-12">
                <h1>Reserva de Hora</h1>
                <p>Reserve su hora en linea de forma rápida y fácil mediante el siguien formulario. Por favor rellene el formulario siguiendo cada uno de los pasos que aparecen en pantalla.</p>
                <a class="btn btn-primary btn-sm" href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Volver a la página principal</a>
            </div>
            <!-- /.col-md-4 -->
        </div>
        <!-- /.row -->

        <hr>

        <!-- Call to Action Well -->
        <div class="row">
            <div class="col-lg-12">
                <div class="well text-center">
                    <c:if test="${mensaje == null}">
                        <c:out value="Rellene el siguiente formulario siguiendo cada uno de los pasos para reservar una hora exitosamente..."></c:out>
                    </c:if>
                    <c:if test="${!mensaje.isEmpty()}">
                        <c:out value="${mensaje}"></c:out>
                    </c:if>
                </div>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->

        <!-- Content Row -->
        <div class="row">
            <!-- /.col-md-4 -->
            <div class="col-md-6">
                <h2>Paso 1</h2>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Información de Propietario</h3>
                    </div>
                    <div class="panel-body">
                        <table class="table table-bordered">
                            <tr>
                                <td>Nombre</td>
                                <td><c:out value="${propietario.getNombres()}"></c:out> <c:out value="${propietario.getApaterno()}"></c:out> <c:out value="${propietario.getAmaterno()}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Dirección</td>
                                <td><c:out value="${propietario.getDireccion()}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Comuna</td>
                                <td><c:out value="${propietario.getComuna().getNombre()}"></c:out></td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            
            <div class="col-md-6">
                <h2>Paso 2</h2>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Seleccione su mascota a atender</h3>
                    </div>
                    <div class="panel-body">
                        <form action="seleccionPaciente" method="post">
                            <div class="form-group">
                                <label for="txtRut">Rut del Propietario</label>
                                <select class="form-control">
                                    <c:forEach var="ma" items="${listaPacientes}">
                                        <option value="<c:out value="${ma.getIdMascota()}"></c:out>"><c:out value="${ma.getNombre()}"></c:out></option>
                                    </c:forEach>
                                </select>
                                <p class="help-block"><a href="#" data-toggle="modal" data-target="#registroModal">Registrar nuevo paciente</a></p>
                            </div>
                            <button type="submit" class="btn btn-default btn-sm">Continuar</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- /.row -->

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; 2016 StarLabs :: Creado por Victor Araya y Alejandro Astroza</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- Modal -->
    <div class="modal fade bs-example-modal-lg" id="registroModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel"><img src="imagenes/logo_aplicacion_slide.png" width="15%" alt="Home" title="Volver al Home" /> Registro de Paciente</h4>
                </div>
                <div class="modal-body">
                    <div class="row">
          
                        <div class="col-md-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Información del Paciente</h3>
                                </div>
                                <div class="panel-body">
                                    <form action="registroPaciente" method="post">
                                        <div class="form-group">
                                            <label for="txtNombrePaciente">Nombre del paciente</label>
                                            <input type="text" class="form-control input-sm" id="txtNombrePaciente" name="txtNombrePaciente" placeholder="Bucky" required="required">
                                        </div>
                                        <div class="form-group">
                                            <label for="txtFechaNacimiento">Fecha de Nacimiento</label>
                                            <input type="date" class="form-control input-sm" id="txtFechaNacimiento" name="txtFechaNacimiento" placeholder="DD-MM-YYYY" required="required">
                                        </div>
                                        <div class="form-group">
                                            <label for="cmbRaza">Raza</label>
                                            <select class="form-control" id="cmbRaza" name="cmbRaza">
                                                <c:forEach var="c" items="${listaRazas}">
                                                    <option value="<c:out value="${c.getIdRaza()}"></c:out>"><c:out value="${c.getNombre()}"></c:out></option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="cmbCaracter">Carácter</label>
                                            <select class="form-control" id="cmbCaracter" name="cmbCaracter">
                                                <c:forEach var="c" items="${listaCaracter}">
                                                    <option value="<c:out value="${c.getIdCaracter()}"></c:out>"><c:out value="${c.getNombre()}"></c:out></option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="cmbSexo">Sexo</label>
                                            <select class="form-control" id="cmbSexo" name="cmbSexo">
                                                <option value="M">Macho</option>
                                                <option value="H">Hembra</option>
                                                <option value="+">Hermafrodita</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="txtNumeroChip">Número de Chip Subdérmico (opcional)</label>
                                            <input type="number" class="form-control input-sm" id="txtNumeroChip" name="txtNumeroChip" placeholder="Número de 15 dígitos">
                                        </div>
                                        <div class="form-group">
                                            <label for="cmbGrupoSanguineo">Grupo Sanguíneo</label>
                                            <select class="form-control" id="cmbCaracter" name="cmbGrupoSanguineo">
                                                <c:forEach var="c" items="${listaGrupoSanguineo}">
                                                    <option value="<c:out value="${c}"></c:out>"><c:out value="${c}"></c:out></option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <input type="hidden" name="txtPropietario" value="${propietario.getIdPropietario()}" />
                                </div>
                            </div>
                        </div> 
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger btn-xs" data-dismiss="modal">Cancelar</button>
                    <button type="submit" class="btn btn-primary btn-xs">Registrar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    
    
    
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
