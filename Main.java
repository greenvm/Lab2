class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int totalNumberMMs = 55*11; 
    double blueMMs = totalNumberMMs * .24;
    double brownMMs = totalNumberMMs * .13;
    double greenMMs = totalNumberMMs * .16;
    double orangeMMs = totalNumberMMs * .2;
    double redMMs = totalNumberMMs * .13;
    double yellowMMs = totalNumberMMs * .14;

    System.out.println("Blue: " + blueMMs);
    System.out.println("Brown: " + brownMMs);
    System.out.println("Green: " + greenMMs);
    System.out.println("Orange: " + orangeMMs);
    System.out.println("Red: " + redMMs);
    System.out.println("Yellow: " + yellowMMs);

    double sumMMs = blueMMs + brownMMs + greenMMs + orangeMMs + redMMs + yellowMMs; 
    System.out.println("Sum: " + sumMMs);

    if ( blueMMs < brownMMs && redMMs > orangeMMs)
     System.out.println ("Blue under Brown and Red over Orange");
    
    if ( brownMMs >= greenMMs)
      System.out.println ("Brown is greater than or equal to Green");

    if ( sumMMs == totalNumberMMs)
     System.out.println ("Numbers match");

  }
}