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
import servicios.SrvMascotas_Service;
import servicios.SrvPropietarios_Service;

/**
 *
 * @author Victor Manuel Araya
 */
@WebServlet(name = "ServletTomarPaso2", urlPatterns = {"/seleccionPaciente"})
public class ServletTomarPaso2 extends HttpServlet {

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
        response.sendRedirect("reservar");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //recuperando datos
        try {
            RequestDispatcher rd = request.getRequestDispatcher("reservar");
            String rut = request.getParameter("txtRut");
            SrvPropietarios_Service s = new SrvPropietarios_Service();
            if(s.getSrvPropietariosPort().retornaInformacionPropietario(rut) == null) {
                request.setAttribute("mensaje", "El propietario no se encuentra registrado en el sistema. Por favor registrese.");
                rd.forward(request, response);
            }else{
                RequestDispatcher rf = request.getRequestDispatcher("paso2.jsp");
                request.setAttribute("propietario", s.getSrvPropietariosPort().retornaInformacionPropietario(rut));
                SrvMascotas_Service m = new SrvMascotas_Service();
                request.setAttribute("listaPacientes", m.getSrvMascotasPort().listadoMascotasPorPropietario(s.getSrvPropietariosPort().retornaInformacionPropietario(rut)));
                //definiendo valores para registro
                request.setAttribute("listaRazas", m.getSrvMascotasPort().listadoRazas());
                request.setAttribute("listaCaracter", m.getSrvMascotasPort().listadoCaracter());
                request.setAttribute("listaGrupoSanguineo", m.getSrvMascotasPort().listadoGruposSanguineos());
                rf.forward(request, response);
            }
        } catch (Exception e) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
