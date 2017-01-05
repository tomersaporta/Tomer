package course.java.lab1.data;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SerializeToXML {

    public static void write(Worker w, String filename) throws Exception{
        XMLEncoder encoder =new XMLEncoder(new BufferedOutputStream(
        		new FileOutputStream(filename)));
 
        encoder.writeObject(w);
        encoder.close();
    }
    
    public static Worker read(String filename) throws Exception {
        XMLDecoder decoder =
            new XMLDecoder(new BufferedInputStream(
                new FileInputStream(filename)));
        Worker w = (Worker)decoder.readObject();
        decoder.close();
        return w;
    }
    
    
}





