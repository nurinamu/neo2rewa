package com.veckon.hack.neo2rewa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestDom {

	public static void main(String[] args){
		
		try {
		HttpURLConnection conn = (HttpURLConnection) new URL("http://www.1365.go.kr/nanum/prtl/web/vols/vol/selectWrkList.do?menuNo=P9140").openConnection();
		conn.setRequestMethod("POST");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String line = "";
		StringBuffer sb = new StringBuffer();
		while((line = br.readLine()) !=null){
			sb.append(line);
		}
		System.out.println(sb.toString());
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(conn.getInputStream());
		NodeList table = doc.getElementsByTagName("table");
		int tlength = table.getLength();
		for(int tab=0;tab < tlength;tab++){
			NodeList trs = ((Element)table.item(tab)).getElementsByTagName("tr");
			int trlength = trs.getLength();
			for(int tr =0;tr < trlength;tr ++){
		//		NodeList tds = trs.item(tr);
				
			}
		}
		} catch (IOException | SAXException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
