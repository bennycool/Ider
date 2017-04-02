package servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.baidu.location.BDLocation;


@WebServlet("/test")
public class MyHttpServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		System.out.println("In HttpServlet");
		System.out.println(req.getContentType());
		System.out.println(req.getRemoteAddr());
		req.setCharacterEncoding("utf-8");
		System.out.println(req.getParameter("msg"));
		BufferedReader br = new BufferedReader(new InputStreamReader(//使用字符流读取客户端发过来的数据  
                req.getInputStream()));  
        String line = null;  
        StringBuffer s = new StringBuffer();  
        while ((line = br.readLine()) != null) {  
            s.append(line);  
        }  
        br.close();  
        System.out.println(s.toString());//{"password":"123456","name":"admin"}  
        JSONObject json = new JSONObject(s.toString());
        //System.out.println(json.getString("name"));
  
 
        //String name = json.getString("name");//从json对象中得到相应key的值  
        //String password = json.getString("password");  
          

		//req.getRequestDispatcher("/WEB-INF/test.jsp").forward(req, resp);

        
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	

}
