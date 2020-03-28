// Mendoza, Jacinto J.
// jjm2349
// 2020-03-27

import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays;
//import java.util.regex.*;

// Commands:
// javac hmwk_02.java
// java hmwk_02 inputdata.txt


//----------------------------------------------------------
public class hmwk_02 {
  public static void processToken( String token )
  {
    // Replace the following line with your code to classify
    // the string in 'token' according to your three Regular
    // Expressions and print the appropriate message.
    boolean PayJay = false;
    boolean Rattle = false;
    boolean Tork = false;
    PayJay = token.matches("^(%|\\*)(%%|\\*\\*|%\\*|\\*%)*((J(J)*AY)|(p(p)*ay)|(J|p)*)$");
    Rattle = token.matches("^(\\+([0-9A-F][0-9A-F])*(\\-|:))|(\\-([0-9A-F][0-9A-F])*(:|\\+))|(:([0-9A-F][0-9A-F])*(\\-|\\+))$");
    Tork = token.matches("^(\\|[AEIOU]*\\*)|(\\|[aeiou]*=)|(\\|\\$)$");

    // Rattle: ("^(\\+|-|:)$");

    if(PayJay == true)
    {
      System.out.println(">"+token+"< matches PayJay.");
    }
    else if(Rattle == true)
    {
      System.out.println(">"+token+"< matches Rattle.");
    }
    else if(Tork == true)
    {
      System.out.println(">"+token+"< matches Tork.");
    }
    else
    {
      System.out.println(">"+token+"< does not match.");
    }

    //System.out.println( ">" + token + "< is the proposed token." );
  }

  //--------------------------------------------------------
  // DO NOT CHANGE anything below this line!
  public static void main( String[] args )
  {
    System.out.println( "processing tokens from " + args[ 0 ] + " ..." );

    try {
      Files.lines( Paths.get( args[ 0 ] ) ).filter(line -> line.length() > 0).forEachOrdered(
        line -> Arrays.stream( line.split( "\\s+" )  )
            .forEachOrdered( token -> processToken( token ) ) );
    } catch ( java.io.IOException e ) {
      e.printStackTrace();
    }
  }
}

//----------------------------------------------------------
