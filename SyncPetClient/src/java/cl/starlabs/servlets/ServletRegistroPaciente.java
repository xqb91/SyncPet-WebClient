/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.starlabs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import servicios.SrvMascotas_Service;

/**
 *
 * @author Victor Manuel Araya
 */
@WebServlet(name = "ServletRegistroPaciente", urlPatterns = {"/registroPaciente"})
public class ServletRegistroPaciente extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            RequestDispatcher rd = request.getRequestDispatcher("reservar");
            //recuperando informacion
            if(request.getParameter("txtNombrePaciente").isEmpty()) {
                request.setAttribute("mensaje", "El nombre del paciente esta vacío");
                rd.forward(request, response);
            }else{
                String nombre           = request.getParameter("txtNombrePaciente");
                GregorianCalendar cal            = new GregorianCalendar();
                if(request.getParameter("txtFechaNacimiento").isEmpty()) {
                    request.setAttribute("mensaje", "la fecha de nacimiento del paciente esta vacía");
                    rd.forward(request, response);
                }else{
                    String fechaNac         = request.getParameter("txtFechaNacimiento");
                    if(request.getParameter("cmbRaza").isEmpty()) {
                        request.setAttribute("mensaje", "No hay una raza seleccionada");
                        rd.forward(request, response);
                    }else{
                        int raza                = Integer.parseInt(request.getParameter("cmbRaza"));
                        if(request.getParameter("cmbCaracter").isEmpty()) {
                            request.setAttribute("mensaje", "No hay ucn caracter seleccionado");
                            rd.forward(request, response);
                        }else{
                            int caracter            = Integer.parseInt(request.getParameter("cmbCaracter"));
                            if(request.getParameter("cmbSexo").isEmpty()) {
                                request.setAttribute("mensaje", "No hay sexo seleccionado");
                                rd.forward(request, response);
                            }else{
                                char sexo               = request.getParameter("cmbSexo").charAt(0);
                                    if(request.getParameter("txtNumeroChip").isEmpty()) 
                                    {
                                        int nroChip = 0;
                                    }else{
                                        int nroChip             = Integer.parseInt(request.getParameter("txtNumeroChip"));
                                        if(request.getParameter("cmbGrupoSanguineo").isEmpty()) {
                                            request.setAttribute("mensaje", "No hay grupo sanguineo seleccionado");
                                            rd.forward(request, response);
                                        }else{
                                            String grupo            = request.getParameter("cmbGrupoSanguineo");

                                            //definiendo fecha de nacimiento a partir de string
                                            cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(fechaNac.split("-")[2]));
                                            cal.set(Calendar.MONTH, Integer.parseInt(fechaNac.split("-")[1]));
                                            cal.set(Calendar.YEAR, Integer.parseInt(fechaNac.split("-")[0]));
                                            XMLGregorianCalendar newdate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
                                            int pro = Integer.parseInt(request.getParameter("txtPropietario"));
                                            //consumo el webservice
                                            SrvMascotas_Service s = new SrvMascotas_Service();
                                            if(s.getSrvMascotasPort().registrarMascota(nombre, newdate, sexo, nroChip, pro, raza, caracter, raza, grupo)) {
                                                request.setAttribute("mensaje", "El paciente fué registrado... comience la operación nuevamente por favor.");
                                                rd.forward(request, response);
                                            }else{
                                                request.setAttribute("mensaje", "Ocurrió un error al registrar al paciente");
                                                rd.forward(request, response);
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
