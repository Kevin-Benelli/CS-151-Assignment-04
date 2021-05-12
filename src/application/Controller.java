package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Controller {
    private final static String storageFileName = "credentialStorage.txt";

    public static void registerUser(String usrn, String pass) {
        try{
            FileWriter fileWriter = new FileWriter(storageFileName, true);

            String credentialStr = usrn + " " + pass + "\n";
            fileWriter.write(credentialStr);
            fileWriter.close();
            System.out.println("closed");
        }catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e){
            System.out.println("File error");
        }catch(Exception e){
            System.out.println("Invalid file input");
        }
    }

    public boolean verifyLogin(String usrn, String pass) {

        boolean isCredentialValid = false;
        String[] credentialArr;

        try{
            File file = new File(storageFileName);
            Scanner in = new Scanner(file);
            String fileContent ="";

            while(in.hasNextLine()){
                fileContent = in.nextLine();
                credentialArr = fileContent.split(" ");

                if(credentialArr.length == 2) {
                    System.out.println("here: " + credentialArr[0] + " AND " + credentialArr[1]);
                    if(usrn.equals(credentialArr[0]) && pass.equals(credentialArr[1])){
                        isCredentialValid = true;
                        break;
                    }
                }
            }

        }catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch(Exception e){
            System.out.println("Invalid file input" + e);
        }

        return isCredentialValid;
    }



}
