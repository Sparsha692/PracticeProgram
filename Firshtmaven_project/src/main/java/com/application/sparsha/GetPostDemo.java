package com.application.sparsha;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetPostDemo {

 public static void main(String[] args) {
  try {
   URL urlToHit = new URL(" https://docs.oracle.com");
   
   HttpURLConnection connection = (HttpURLConnection) urlToHit.openConnection();
   
   connection.setRequestMethod("GET");
   
   connection.setRequestProperty("User-Agent", "Java Browser");
   
   BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
   
   String data = "";
   
   StringBuilder builder = new StringBuilder("");
   
   while((data = reader.readLine()) != null) {
    builder.append(data);
    builder.append("\n");
   }
   
   reader.close();
   
   System.out.println("Data from domain : ");
   
   System.out.println(builder);
   
  } catch (IOException e) {
   System.out.println("Issues with the URL : " + e.getMessage());
  }

 }

}