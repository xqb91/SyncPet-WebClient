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
            <div class="col-md-12">
                <h2>Paso 1</h2>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Información de Propietario</h3>
                    </div>
                    <div class="panel-body">
                        <form action="seleccionPaciente" method="post">
                            <div class="form-group">
                                <label for="txtRut">Rut del Propietario</label>
                                <input type="text" class="form-control" id="txtRut" name="txtRut" placeholder="12.345.678-9" onblur="validarPaso2(this.value);">
                                <p class="help-block">¿Aún no registrado? <a href="#" data-toggle="modal" data-target="#registroModal">Registrame</a></p>
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
                    <p>Copyright &copy; 2016 StarLabs Syncpet WebClient :: Powered by Alejandro Astroza & Victor Araya</p>
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
                    <h4 class="modal-title" id="myModalLabel"><img src="imagenes/logoWebClient.png" width="15%" alt="Home" title="Volver al Home" /> Registro de Propietario</h4>
                </div>
                <div class="modal-body">
                    <div class="row">
          
                        <div class="col-md-6">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Información del Propietario</h3>
                                </div>
                                <div class="panel-body">
                                    <form action="registroPropietario" method="post">
                                        <div class="form-group">
                                            <label for="txtRutPropietario">Rut del Propietario</label>
                                            <input type="text" class="form-control input-sm" id="txtRutPropietario" name="txtRutPropietario" placeholder="12.345.678-9" onblur="validarRegistro(this.value);">
                                        </div>
                                        <div class="form-group">
                                            <label for="txtNombres">Nombres</label>
                                            <input type="text" class="form-control input-sm" id="txtNombres" name="txtNombres" placeholder="Juan Pablo">
                                        </div>
                                        <div class="form-group">
                                            <label for="txtApaterno">Apellido Paterno</label>
                                            <input type="text" class="form-control input-sm" id="txtApaterno" name="txtApaterno" placeholder="Montero">
                                        </div>
                                        <div class="form-group">
                                            <label for="txtAmaterno">Apellido Materno</label>
                                            <input type="text" class="form-control input-sm" id="txtAmaterno" name="txtAmaterno" placeholder="Ureta">
                                        </div>
                                        <div class="form-group">
                                            <label for="txtClinicaReg">Clínica Veterinaria</label>
                                            <select class="form-control" id="txtClinicaReg" name="txtClinicaReg">
                                                <option value="0">Seleccione</option>
                                                <c:forEach var="c" items="${listadoClinica}">
                                                    <option value="<c:out value="${c.getIdSucursal()}"></c:out>"><c:out value="${c.getNombre()}"></c:out></option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                </div>
                            </div>
                        </div>
                        
                        
                        <div class="col-md-6">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Información de Contacto</h3>
                                </div>
                                <div class="panel-body">
                                    <form>
                                        <div class="form-group">
                                            <label for="txtCorreo">Correo Electrónico</label>
                                            <input type="email" class="form-control input-sm" id="txtCorreo" name="txtCorreo" placeholder="ejemplo@syncpet.cl">
                                        </div>
                                        <div class="form-group">
                                            <label for="txtTelefono">Teléfono fijo</label>
                                            <input type="number" class="form-control input-sm" id="txtTelefono" name="txtTelefono" placeholder="228180000">
                                        </div>
                                        <div class="form-group">
                                            <label for="txtCelular">Celular</label>
                                            <input type="number" class="form-control input-sm" id="txtCelular" name="txtCelular" placeholder="961234567">
                                        </div>
                                        <div class="form-group">
                                            <label for="txtDireccion">Dirección</label>
                                            <input type="text" class="form-control input-sm" id="txtDireccion" name="txtDireccion" placeholder="Avenida Los Pinos #345">
                                        </div>
                                        <div class="form-group">
                                            <label for="cmbCiudad">Comuna</label>
                                            <select class="form-control input-sm" id="cmbCiudad" name="cmbCiudad">
                                                <c:forEach var="d" items="${listadoCiudades}">
                                                    <option value="<c:out value="${d.getIdComuna()}"></c:out>"><c:out value="${d.getNombre()}"></c:out></option>
                                                </c:forEach>
                                            </select>
                                        </div>
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
