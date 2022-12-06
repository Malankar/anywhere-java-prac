package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDemo {
  public static void main(String[] args) throws Exception {
    Save obj=new Save();
    obj.i=4;
    
    // Serialization
    File f=new File("Obj.ser");
    FileOutputStream fos=new FileOutputStream(f);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(obj);
    oos.close();
    
    // Deserialization
    FileInputStream fis=new FileInputStream(f);
    ObjectInputStream ois=new ObjectInputStream(fis);
    Save obj1=(Save)ois.readObject();
    ois.close();
    System.out.println(obj1.i);
  }
}
class Save implements Serializable{
  int i;
}
