package course.java.lab1.data;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Worker> workers = new ArrayList<Worker>();
		
		Worker w2= new Worker("Tomer", 25, 12351);
		workers.add(new Worker("Shir", 23,1254));
		Worker w1 = new Worker();
		//System.out.println(w1);
		/*
		try {
			SerializeToXML.write(w1, "worker.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	    try {
	      FileInputStream inputStream = new FileInputStream("worker.xml");
	      XMLDecoder decoder = new XMLDecoder(inputStream);
	      Worker w2 = (Worker)decoder.readObject();
	      decoder.close();
	      System.out.println("worker.xml:"+ w2);
	    } catch (Exception ex) {
	    } 
	    */
		int read = 0;
		if (read==1){
		 //write XML
		try {
			XMLEncoder e = new XMLEncoder(
			    new BufferedOutputStream(
			        new FileOutputStream("Worker3.xml")));
			e.writeObject(w2);
			System.out.println("XML file saved!");
			e.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		else {
		//read XML
		XMLDecoder decoder = null;
			try {
					decoder = new XMLDecoder(new BufferedInputStream(
				    new FileInputStream("Worker3.xml")));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Worker w4 =	(Worker)decoder.readObject();
	        System.out.println("XML file loaded!");
	        System.out.println(w4.toString());
	        decoder.close();   
		}
		System.out.println("h	ello git!");
	}
}
