package ua.org.crazy.homework21.task01.serial;

import ua.org.crazy.homework21.task01.model.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializator {

    public boolean serialization(User user, String fileName) {
        boolean flag = false;
        File f = new File(fileName);
        ObjectOutputStream ostream = null;
        try {
            FileOutputStream fos = new FileOutputStream(f);
            if (fos != null) {
                ostream = new ObjectOutputStream(fos);
                ostream.writeObject(user);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File cant be create: " + e);
        } catch (NotSerializableException e) {
            System.err.println("The class does not support serialization.: " + e);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (ostream!=null){
                    ostream.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing stream");
            }
        }
        return flag;
    }

    public User deserialization(String fileName) throws InvalidObjectException {
        File file = new File(fileName);
        ObjectInputStream inputStream = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            inputStream = new ObjectInputStream(fis);
            User user = (User) inputStream.readObject();
            return user;
        } catch (ClassNotFoundException e) {
            System.err.println("Class does not exist: " + e);
        }catch (FileNotFoundException e) {
            System.err.println("File to deserialize does not exist: " + e);
        }catch (InvalidClassException ioe) {
            System.err.println("Class version mismatch: " + ioe);
        }catch (IOException ioe) {
            System.err.println("Common I / O error: " + ioe);
        } finally {
            try {
                if (inputStream !=null){
                    inputStream.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing stream");
            }
        }
        throw new InvalidObjectException("Object not restored");
    }
}
