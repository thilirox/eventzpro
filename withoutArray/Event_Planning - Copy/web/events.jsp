<%-- 
    Document   : events
    Created on : Dec 5, 2016, 9:30:52 AM
    Author     : Thilini.Samaranayake
--%>


<%@ page contentType="application/json" %>
<%= getEvents(request) %>
<%@ page import="com.dhtmlx.planner.*,com.dhtmlx.demo.*" %>
<%!
    String getEvents(HttpServletRequest request) throws Exception {
    EventsManager evs = new EventsManager(request);
    return evs.run();
  }
%>