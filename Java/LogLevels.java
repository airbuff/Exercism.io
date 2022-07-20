public class LogLevels {
    
    public static String message(String logLine) {
        
     String[] error = logLine.split(":");
        String a = error[1].trim();
        return a;
             
    }
    

    public static String logLevel(String logLine) {
        String [] error = logLine.split(":");
          String a = error[0].toLowerCase();
        a = a.replaceAll("[\\[\\](){}]", "");
        return a;
    }

    public static String reformat(String logLine) {
      String a = message(logLine)+" ("+logLevel(logLine)+")";

        return a;
    }
}
