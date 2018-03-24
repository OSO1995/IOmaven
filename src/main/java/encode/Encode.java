package encode;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;

import java.io.*;
import java.util.Base64;

public class Encode {
  public static void encode() throws IOException, Base64DecodingException {
    FileInputStream inputStream = new FileInputStream(new File("enc.txt"));
    byte[] arr = new byte[50000];
    inputStream.read(arr, 0, 50000);

    Base64.Decoder decoder = Base64.getMimeDecoder();

    byte[] decode = decoder.decode(arr);

    FileOutputStream outputStream = new FileOutputStream(new File("pic.jpg"));
    outputStream.write(decode, 0, decode.length);
    inputStream.close();
    outputStream.close();
  }

}