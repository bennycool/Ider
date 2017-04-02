package servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/barrage")
public class BarrageHttpServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In BarrageHttpServlet");
		req.setCharacterEncoding("utf-8");
		System.out.println(req.getParameter("msg"));
		BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));  
        String line = null;  
        StringBuffer s = new StringBuffer();  
        while ((line = br.readLine()) != null) {  
            s.append(line);  
        }  
        
        br.close();  
        System.out.println(s.toString());
        
        BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(resp.getOutputStream()));
        bWriter.write(s.toString());
        bWriter.flush();
        bWriter.close();
        
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
