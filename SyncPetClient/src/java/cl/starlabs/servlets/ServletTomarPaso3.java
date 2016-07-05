/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.starlabs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import servicios.Mascota;
import servicios.SrvAgendamiento_Service;
import servicios.SrvMascotas_Service;

/**
 *
 * @author Victor Manuel Araya
 */
@WebServlet(name = "ServletTomarPaso3", urlPatterns = {"/tomarHora"})
public class ServletTomarPaso3 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            RequestDispatcher rd = request.getRequestDispatcher("paso3.jsp");
            int mascota = Integer.parseInt(request.getParameter("cmbPaciente"));
            
            SrvMascotas_Service srv = new SrvMascotas_Service();
            SrvAgendamiento_Service srv2 = new SrvAgendamiento_Service();
            
            Mascota mas  = srv.getSrvMascotasPort().buscarMascotaById(mascota);
            request.setAttribute("mascota", mas);
            request.setAttribute("listadoMedicos", srv2.getSrvAgendamientoPort().listaVeterinarios());
            GregorianCalendar cal = new GregorianCalendar();
            XMLGregorianCalendar xmlG = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            request.setAttribute("listadoHorasOcupadas", srv2.getSrvAgendamientoPort().horasOcupadas(xmlG));
            request.setAttribute("listadoHoras", horasDelDia());
            request.setAttribute("fechaHoy", cal.getTime());
            rd.forward(request, response);
        } catch (Exception e) {
        }
    }
    
    private Object[] horasDelDia() {
        try {
            Object[] obj = new Object[96];
            Calendar cal = new GregorianCalendar();
            cal.set(Calendar.HOUR_OF_DAY, 00);
            cal.set(Calendar.MINUTE, 00);
            for(int i=0; i<96; i++) {
                obj[i] = new SimpleDateFormat("HH:mm").format(cal.getTime());
                cal.add(Calendar.MINUTE, 15);
            }
            return obj;
        } catch (Exception e) {
            return null;
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}