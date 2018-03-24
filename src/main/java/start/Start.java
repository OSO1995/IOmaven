package start;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import encode.Encode;

import java.io.IOException;

public class Start {
  public static void main(String[] args) {
    try {
      Encode.encode();
    } catch (IOException | Base64DecodingException e) {
      e.printStackTrace();
    }
  }
}