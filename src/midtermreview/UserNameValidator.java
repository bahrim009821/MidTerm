/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreview;

/**
 *
 * @author bhari
 */
import java.util.Scanner;

public class UserNameValidator {
    public static String userCheck(){ 
            Scanner input = new Scanner(System.in);

String userName;
userName = input.nextLine();
if ("".equals(userName)){
        System.out.print("please do not leave the username part empty");

}
else{
        System.out.print("have a nice shopping");

}
return userName;
    }
}
