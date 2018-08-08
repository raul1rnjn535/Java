import java.io.*;
public class ReadingFromFile
{
  public static void main(String[] args) throws Exception
  {
    // pass the path to the file as a parameter
    FileReader fr =
      new FileReader(args[0]);
 
    int i;
    while ((i=fr.read()) != -1)
      System.out.print((char) i);
  }
}
