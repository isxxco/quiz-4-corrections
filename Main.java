class Main {
  public static void main(String[] args) {
    Main p = new Main();
    p.partial(null, "a", 1);
    p.oddsOnly("forty");
  }
  public String partial(String original, String letter, int count) {
    if (original == null) {
      System.out.println("null");
      return null;
    } else  {
        int sub = original.indexOf(letter);
        if (sub == -1)  {
          System.out.println("\"\"");
          return ("\"\"");
        } else  {
          String subb = original.substring(sub, sub + count + 1);
          System.out.println(subb);
          return subb;
        }
    }
  }

  public String oddsOnly(String original) {
    if (original == null) {
      return null;
    } else  {
      String r = "";
      for (int i = 0; i < original.length(); i++)  {
        if(i % 2 == 0)  {
          r += original.charAt(i);
        } 
      } System.out.println(r); 
      return r; 
    } 
  } 
}
