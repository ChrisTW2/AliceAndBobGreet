package AliceAndBobGreet;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by christopherworsley on 9/9/16.
 */
public class greeting {
    public static void ask(){
        Scanner hey = new Scanner(System.in);
        System.out.println("Hey whats your name");
        String name = hey.next();


        if (name.equals("Alice") ){
            System.out.println("Hey " + name);

        }
        else if (name.equals("Bob")){
            System.out.println("How are you? " + name);
        } else{
            System.out.println("Hi");
        }

    }

    public static void main(String[] args) {
        ask();


    }
}
