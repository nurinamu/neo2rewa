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
		
		System.out.println("Test");
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String line = "";
		StringBuffer sb = new StringBuffer();
		while((line = br.readLine()) !=null){
			sb.append(line);
		}
		conn.disconnect();
		System.out.println(sb.toString());
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(conn.getInputStream());
		NodeList table = doc.getElementsByTagName("table");
		int tlength = table.getLength();
		System.out.println(tlength);
		for(int tab=0;tab < tlength;tab++){
			NodeList trs = ((Element)table.item(tab)).getElementsByTagName("tr");
			int trlength = trs.getLength();
			for(int tri =0;tri < trlength;tri ++){
				NodeList tds = ((Element)trs.item(tri)).getElementsByTagName("td");
				String num = ((Element)tds.item(0).getFirstChild()).getAttribute("alt"); // Number
				String title = ((Element)tds.item(1).getFirstChild()).getTextContent(); // Title
				String organ = tds.item(2).getTextContent(); // Organization
				String time = tds.item(3).getTextContent(); // Time Limit
				String status = ((Element)tds.item(4).getFirstChild()).getAttribute("alt"); // Status Ing / End
				System.out.println(num + ","+title+","+organ+","+time+","+status);
			}
		}
		} catch (IOException | SAXException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
