package Helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

 public class UniqueIdentifier {

     public static String getUniqueId(String str) {
         return str + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
     }
 }