/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ArrayHandling.outputFormating;
import DatabaseOperations.agentOutputHandling;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(urlPatterns = {"/filterPackages"})
public class filterPackages extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        String valMax= request.getParameter("valajax");
        agentOutputHandling filter = new agentOutputHandling();
        ResultSet filtered=filter.filterResults(valMax);
        int noFresults = filter.countFlitered(valMax);
        out.write("                                    <div> <h4> No of Packages Generated = ");
      out.print(noFresults );
      out.write(" </h4> <div>\r\n");
      out.write("                                    \r\n");
        
        response.getWriter().write("                                <table class=\"table table-bordered\">\r\n");
       response.getWriter().write("                                    <thead>\r\n");
     response.getWriter().write("                                        <tr>\r\n");
     response.getWriter().write("                                            <th>Package No</th>\r\n");
      response.getWriter().write("                                            <th>Package Details </th>\r\n");
      response.getWriter().write("                                            <th>Total Cost </th>\r\n");
      response.getWriter().write("\r\n");
      response.getWriter().write("                                        </tr>\r\n");
      response.getWriter().write("                                    ");
                              int a = 1;
                              while (filtered.next()) {
                              String Pdetails = filtered.getString("PackageDe");
                               System.out.println("lllllllllllllllll"+Pdetails);
                                Float cost = filtered.getFloat("cost");
                               String ForPdetails = Pdetails.replaceFirst(Pattern.quote(","), "");
  
      response.getWriter().write("\r\n");
      response.getWriter().write("                                        <tr>\r\n");
      response.getWriter().write("                                            <td>");
      response.getWriter().write(a);
     response.getWriter().write("</td>\r\n");
      response.getWriter().write("                                            <td><table>\r\n");
      response.getWriter().write("                                                    ");
      outputFormating format = new outputFormating();
                                                    String[] outarray = format.splitOutput(ForPdetails.trim());
                                                        for (int y = 0; y < outarray.length; y++) {
                                                            String Val = outarray[y].replaceAll("-", ",").trim();

                                                    
      response.getWriter().write("\r\n");
     response.getWriter().write("\r\n");
      response.getWriter().write("                                                    <tr>\r\n");
      response.getWriter().write("                                                        <td>\r\n");
      response.getWriter().write("\r\n");
     response.getWriter().write("                                                            ");
  String[] ItemDetails = format.splitOutput(Val);
                                                                int length = ItemDetails.length;
                                                                if (length == 3) {
                                                                    String ServiceName = ItemDetails[0].replaceAll("[(]", "").trim();
                                                                    String Pname = ItemDetails[2].trim();
                                                                    String Value = ItemDetails[1].replaceAll("[)]", "");

                                                            
      response.getWriter().write("\r\n");
      response.getWriter().write("\r\n");
      response.getWriter().write("                                                            <table class=\"table table-bordered\"><tr>\r\n");
      response.getWriter().write("                                                                    <td>\r\n");
      response.getWriter().write("                                                                        <a href=\"DisplayPackageDetails.jsp?Service=");
      response.getWriter().print(ServiceName);
      response.getWriter().write("&Package=+");
      response.getWriter().print(Pname);
      response.getWriter().write("\" > ");
      response.getWriter().print(ServiceName + " " + Pname);
      response.getWriter().write(" \r\n");
      response.getWriter().write("                                                                        </a>\r\n");
      response.getWriter().write("                                                                    <td>\r\n");
      response.getWriter().write("                                                                        ");
      response.getWriter().print( Value);
      response.getWriter().write("         \r\n");
      response.getWriter().write("                                                                    </td>\r\n");
      response.getWriter().write("\r\n");
      response.getWriter().write("                                                                </tr></table>\r\n");
      response.getWriter().write("                                                                ");
 }
                                                                    if (length == 4) {
                                                                        String ServiceName = ItemDetails[0].replaceAll("[(]", "");
                                                                        String Pname = ItemDetails[3];
                                                                        String Value = ItemDetails[2];
                                                                        String Num = ItemDetails[1].replaceAll("[)]", "");;


                                                                
      response.getWriter().write("<table class=\"table table-bordered\"><tr>\r\n");
      response.getWriter().write("                                                                    <td>\r\n");
      response.getWriter().write("                                                                        ");
      response.getWriter().print(ServiceName + " " + Pname + " " + Num);
      response.getWriter().write(" </td>\r\n");
      response.getWriter().write("                                                                    <td>\r\n");
      response.getWriter().write("                                                                        ");
      response.getWriter().print( Value);
      response.getWriter().write("         \r\n");
      response.getWriter().write("                                                                    </td>\r\n");
      response.getWriter().write("\r\n");
      response.getWriter().write("                                                                </tr></table>");

                                                                    }
                                                                
      response.getWriter().write("\r\n");
      response.getWriter().write("\r\n");
      response.getWriter().write("                                                        </td>\r\n");
      response.getWriter().write("                                                    </tr>\r\n");
      response.getWriter().write("                                                    ");

                                                        }
                                                    
      response.getWriter().write("\r\n");
      response.getWriter().write("                                                </table>\r\n");
      response.getWriter().write("\r\n");
      response.getWriter().write("                                            </td>  \r\n");
      response.getWriter().write("                                            <td > ");
      response.getWriter().print(cost);
      response.getWriter().write("</td>\r\n");
      response.getWriter().write("\r\n");
      response.getWriter().write("                                        </tr>\r\n");
      response.getWriter().write("                                        ");
 a++;
                             }
      response.getWriter().write("\r\n");
      response.getWriter().write("                                    </thead>\r\n");
      response.getWriter().write("\r\n");
      response.getWriter().write("                                </table>\r\n");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(filterPackages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(filterPackages.class.getName()).log(Level.SEVERE, null, ex);
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
