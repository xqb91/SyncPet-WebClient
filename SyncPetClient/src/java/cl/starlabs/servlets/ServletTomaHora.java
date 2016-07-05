
package cl.starlabs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
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

/**
 *
 * @author Victor Manuel Araya
 */
@WebServlet(name = "ServletTomaHora", urlPatterns = {"/registrarTomaHora"})
public class ServletTomaHora extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            RequestDispatcher rd = request.getRequestDispatcher("reserva.jsp");
            String veterinario  = request.getParameter("cmbVeterinario");
            String hora         = request.getParameter("cmbHoraAtencion");
            String fecha        = request.getParameter("cmbFecha");
            String mascota      = request.getParameter("txtMascota");
            String sucursal     = request.getParameter("txtSucursal");
            
            if(veterinario.isEmpty()) {
                request.setAttribute("mensaje", "Seleccione un veterinario");
                rd.forward(request, response);
            }else{
                int vet = Integer.parseInt(veterinario);
                if(hora.isEmpty()) {
                    request.setAttribute("mensaje", "Seleccione la hora");
                    rd.forward(request, response);
                }else{
                    if(fecha.isEmpty()) {
                        request.setAttribute("mensaje", "Seleccione una fecha válida");
                        rd.forward(request, response);
                    }else{
                        GregorianCalendar caal = new GregorianCalendar();
                        caal.set(Calendar.DAY_OF_MONTH  , Integer.parseInt(fecha.split("-")[2]));
                        caal.set(Calendar.MONTH         , Integer.parseInt(fecha.split("-")[1]));
                        caal.set(Calendar.YEAR          , Integer.parseInt(fecha.split("-")[0]));
                        caal.add(Calendar.MONTH, -1);
                        if(mascota.isEmpty()) {
                            request.setAttribute("mensaje", "Seleccione una hora para agendar");
                            rd.forward(request, response);
                        }else{
                            caal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hora.split(":")[0]));
                            caal.set(Calendar.MINUTE, Integer.parseInt(hora.split(":")[1]));
                            caal.set(Calendar.SECOND, 00);
                            caal.set(Calendar.MILLISECOND, 000);
                            if(mascota.isEmpty()) {
                                request.setAttribute("mensaje", "No hay un paciente definido en el sistema");
                                rd.forward(request, response);
                            }else{
                                int masco = Integer.parseInt(mascota);
                                if(sucursal.isEmpty()) {
                                    request.setAttribute("mensaje", "No hay una sucursal definida");
                                    rd.forward(request, response);
                                }else{
                                    SrvAgendamiento_Service srv = new SrvAgendamiento_Service();
                                    int sucu = Integer.parseInt(sucursal);
                                    XMLGregorianCalendar xmla = DatatypeFactory.newInstance().newXMLGregorianCalendar(caal);
                                    if(srv.getSrvAgendamientoPort().agendarHorario(xmla, sucu, vet, masco)) {
                                        request.setAttribute("mensaje", "Hora tomada con éxito");
                                        rd.forward(request, response);
                                    }else{
                                        request.setAttribute("mensaje", "Ocurrió un problema a la hora de agendar el evento");
                                        rd.forward(request, response);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        } catch (Exception e) {
            RequestDispatcher rd = request.getRequestDispatcher("tomarHora");
            request.setAttribute("mensaje", "Ocurrió un problema: "+e.getMessage());
            rd.forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
