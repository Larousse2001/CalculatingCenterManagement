package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/so")
public class servlet extends HttpServlet {
	public 		double moyenne=0;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
		

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String m="0";
		String hidden =request.getParameter("hidden");
		if(hidden==null)
			response.sendRedirect("index.html");
	    //Les matieres dans toutes les sections
	    	String arb= request.getParameter("arabe");
			String eng=request.getParameter("eng");
			String fr=request.getParameter("fr");
			String sport= request.getParameter("sport");
			String algo= request.getParameter("algo");
			String option=request.getParameter("option");

		 if (Objects.equals(hidden, "math")) {
			String math= request.getParameter("math");
			String phy= request.getParameter("phy");
			String science= request.getParameter("science");
			moyenne=(Double.parseDouble(eng)
					+Double.parseDouble(math)*4
					+Double.parseDouble(phy)*4
					+Double.parseDouble(algo)*1
					+Double.parseDouble(science)*2
					+Double.parseDouble(arb)
					+Double.parseDouble(fr)
					+Double.parseDouble(sport)
					+Double.parseDouble(option))/16;
		 }
		 else if(Objects.equals(hidden, "science")) {
				String math= request.getParameter("math");
				String phy= request.getParameter("phy");
				String science= request.getParameter("science");

				moyenne=(Double.parseDouble(eng)
						+Double.parseDouble(math)*4
						+Double.parseDouble(phy)*4
						+Double.parseDouble(algo)*1
						+Double.parseDouble(science)*4
						+Double.parseDouble(arb)
						+Double.parseDouble(fr)
						+Double.parseDouble(sport)
						+Double.parseDouble(option))/18;
				}
		 else if(Objects.equals(hidden, "info")) {
				String math= request.getParameter("math");
				String phy= request.getParameter("phy");
				moyenne=(Double.parseDouble(eng)+Double.parseDouble(math)*4+Double.parseDouble(phy)*3+Double.parseDouble(algo)*4+Double.parseDouble(arb)+Double.parseDouble(fr)+Double.parseDouble(sport)+Double.parseDouble(option))/16;
		 }
		 else if(Objects.equals(hidden, "technique")) {
				String technique= request.getParameter("technique");
				String math= request.getParameter("math");
				String phy= request.getParameter("phy");
				moyenne=(Double.parseDouble(eng)
						+Double.parseDouble(technique)*4
						+Double.parseDouble(math)*4
						+Double.parseDouble(phy)*4
						+Double.parseDouble(algo)
						+Double.parseDouble(arb)
						+Double.parseDouble(fr)
						+Double.parseDouble(sport)
						+Double.parseDouble(option)
						)/18;
		 }
		 else if(Objects.equals(hidden, "lettre")) {
				String histgeo= request.getParameter("histgeo");
				moyenne=(Double.parseDouble(histgeo)*4+Double.parseDouble(eng)*3+Double.parseDouble(algo)+Double.parseDouble(arb)*4+Double.parseDouble(fr)*4+Double.parseDouble(sport)+Double.parseDouble(option))/18;
		 }
		 else  if(Objects.equals(hidden, "eco")){
				String phy= request.getParameter("phy");
				String math= request.getParameter("math");
				String gestion= request.getParameter("gestion");
				moyenne=(Double.parseDouble(phy)
				+Double.parseDouble(math)*4
				+Double.parseDouble(gestion)*4
				+Double.parseDouble(eng)+Double.parseDouble(algo)+Double.parseDouble(arb)+Double.parseDouble(fr)+Double.parseDouble(sport)+Double.parseDouble(option))/15;
				
		 }
		//		out.println("<html>");
//		out.println("<body>");
//		out.println("<h2>Bac "+hidden+"</h2>");
//		out.println("<h1>Votre moyenne est  = "+moyenne+"</h1>");
//		if(moyenne>10) 
//			out.println("<h2>ADMIS ....</h2>");
//	}
		 try {
		 request.setAttribute("m",moyenne);
		 request.getRequestDispatcher("vuemoyenne.jsp").forward(request, response);
		 }
		 catch(IllegalStateException x) {

		 }
		 }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
