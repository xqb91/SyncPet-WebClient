/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.starlabs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicios.SrvPropietarios_Service;

/**
 *
 * @author Victor Manuel Araya
 */
@WebServlet(name = "ServletRegistroPropietario", urlPatterns = {"/registroPropietario"})
public class ServletRegistroPropietario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("reservar");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            RequestDispatcher rd = request.getRequestDispatcher("reserva.jsp");
            //recibiendo la informacion desde el formulario
            String rut          = request.getParameter("txtRutPropietario");
            String nombres      = request.getParameter("txtNombres");
            String apaterno     = request.getParameter("txtApaterno");
            String amaterno     = request.getParameter("txtAmaterno");
            
            String correo       = request.getParameter("txtCorreo");
            
            int sucursal = 0;
            if(!request.getParameter("txtClinicaReg").isEmpty()) {
                sucursal         = Integer.parseInt(request.getParameter("txtClinicaReg"));
            }
            int telefono = 0;
            if(!request.getParameter("txtTelefono").isEmpty()) {
                 telefono        = Integer.parseInt(request.getParameter("txtTelefono"));
            }
            int celular = 0;
            if(!request.getParameter("txtCelular").isEmpty()) {
                celular         = Integer.parseInt(request.getParameter("txtCelular"));
            }
            String direccion    = request.getParameter("txtDireccion");
            int comuna          = Integer.parseInt(request.getParameter("cmbCiudad"));
            if(comuna == 0) {
                request.setAttribute("mensaje", "No ha seleccionado ninguna comuna");
                rd.forward(request, response);
            }else{
                if(rut.isEmpty()) {
                    request.setAttribute("mensaje", "El rut del propietario esta vacío");
                    rd.forward(request, response);
                }else{
                    if(nombres.isEmpty()) {
                        request.setAttribute("mensaje", "Los nombres del propietario están vacios");
                        rd.forward(request, response);
                    }else{
                        if(apaterno.isEmpty()) {
                            request.setAttribute("mensaje", "El apellido paterno del propietario no ha sido especificado");
                            rd.forward(request, response);
                        }else{
                            if(amaterno.isEmpty()) {
                                request.setAttribute("mensaje", "El apellido materno del propietario no se ha especificado");
                                rd.forward(request, response);
                            }else{
                                if(correo.isEmpty()) {
                                    request.setAttribute("mensaje", "El correo electrónico del propietario no ha sido especificado");
                                    rd.forward(request, response);
                                }else{
                                    if(direccion.isEmpty()) {
                                        request.setAttribute("mensaje", "La dirección del propietario no ha sido especificado");
                                        rd.forward(request, response);
                                    }else{
                                        if(sucursal == 0) {
                                            request.setAttribute("mensaje", "No se ha seleccionado ninguna sucursal");
                                            rd.forward(request, response); 
                                        }else{
                                            //todo correcto
                                            SrvPropietarios_Service s = new SrvPropietarios_Service();
                                            if(s.getSrvPropietariosPort().retornaInformacionPropietario(rut) == null) {
                                                if(s.getSrvPropietariosPort().registraPropietario(rut, nombres, apaterno, amaterno, correo, telefono, celular, direccion, comuna, sucursal)) {
                                                    request.setAttribute("mensaje", "Propietario registrado con éxito");
                                                    rd.forward(request, response);
                                                }else{
                                                    request.setAttribute("mensaje", "Ocurrió un error al registrar al propietario");
                                                    rd.forward(request, response);
                                                }
                                            }else{
                                                request.setAttribute("mensaje", "Este propietario ya se encuentra registrado");
                                                rd.forward(request, response);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        } catch (Exception e) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
