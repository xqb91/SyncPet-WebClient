/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.starlabs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicios.Propietario;
import servicios.SrvAgendamiento;
import servicios.SrvAgendamiento_Service;
import servicios.SrvPropietarios_Service;

/**
 *
 * @author Victor Manuel Araya
 */
@WebServlet(name = "ServletConsulta", urlPatterns = {"/consultaAgenda"})
public class ServletConsulta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("consulta.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            RequestDispatcher rd = request.getRequestDispatcher("consulta.jsp");
            //recuperando rut
            String rut = request.getParameter("txtRutPropietario");
            if(rut.isEmpty()) {
                request.setAttribute("mensaje", "El campo de rut esta vacío");
                rd.forward(request, response);
            }else{
                request.setAttribute("mensaje", null);
                //buscando elementos
                SrvPropietarios_Service sprop = new SrvPropietarios_Service();
                SrvAgendamiento_Service sagen = new SrvAgendamiento_Service();
                
                Propietario prop = sprop.getSrvPropietariosPort().retornaInformacionPropietario(rut);
                if(prop == null) {
                    request.setAttribute("mensaje", "El propietario con el rut especificado no existe");
                    rd.forward(request, response);
                }else{
                    request.setAttribute("mensaje", null);
                    request.setAttribute("propietario", sprop.getSrvPropietariosPort().retornaInformacionPropietario(rut));
                    //buscando la ultima atencion
                    if(sagen.getSrvAgendamientoPort().ultimoEventoRegistrado(prop) == null) {
                        request.setAttribute("mensaje", "Este propietario aún no ha registrado un agendamiento");
                        request.setAttribute("propietario", null);
                        rd.forward(request, response);
                    }else{
                        request.setAttribute("agenda", sagen.getSrvAgendamientoPort().ultimoEventoRegistrado(prop));
                        request.setAttribute("detalle", sagen.getSrvAgendamientoPort().detalleUltimoEventoRegistrado(prop));
                        request.setAttribute("fecha", sagen.getSrvAgendamientoPort().ultimoEventoRegistrado(prop).getFechaEvento().toGregorianCalendar().getTime());
                        rd.forward(request, response);
                    }
                }
            }
        } catch (Exception e) {
            RequestDispatcher rd = request.getRequestDispatcher("consulta.jsp");
            request.setAttribute("mensaje", "Error Inesperado: "+e.getMessage());
            rd.forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
