class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int total = 55 * 9;
    double blue = total * .24;
    double brown = total * .13;
    double green = total * .16;
    double orange = total * .2;
    double red = total * .13;
    double yellow = total * .14;

    System.out.println("blue: " + blue);
    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("orange: " + orange);
    System.out.println("red: " + red);
    System.out.println("yellow: " + yellow);
    
    double sum = blue + brown + green + orange + red + yellow;
    System.out.println("Sum: " + sum);

    if ( blue > brown && green > red)
     System.out.println("Blue over Brown and Green over Red");
    if ( brown <= orange)
     System.out.println("Brown is less than or equal to Orange");
    if ( sum == total)
     System.out.println("Numbers match");


  }
}