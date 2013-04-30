package com.mygames.jackpot;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SlotServer extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		  resp.addHeader("Access-Control-Allow-Origin", "*");
		  resp.addHeader("Content-Type", "text/plain");
		  //String jsonString = "\"{\"\"c2array\"\":true,\"\"size\"\":[1,1,9],\"\"data\"\":[[[0,1,2,3,4,5,6,7,7]]]}\"";
		  //String jsonString = "\"{\"\"c2array\"\":true,\"\"size\"\":[10,1,1],\"\"data\"\":[[[1]],[[0]],[[0]],[[0]],[[0]],[[0]],[[0]],[[0]],[[0]],[[0]]]}\"";
		  //String jsonString = "{\"c2array\":true,\"size\":[10,1,1],\"data\":[[[1]],[[0]],[[0]],[[0]],[[0]],[[0]],[[0]],[[0]],[[0]],[[0]]]}";
		  String jsonString = "{\"c2array\":true,\"size\":[1,1,9],\"data\":[[[0,1,2,3,4,5,6,7,0]]]}";
		  try {
			resp.getWriter().append(jsonString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
