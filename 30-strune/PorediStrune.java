public class PorediStrune {
   public static void main(String args[]){
      String velikaSlova = "Zdravo Svete";
      String malaSlova = "zdravo svete";

      // vraca ascii razliku prvog razlicitog znaka u strunama
      System.out.println(velikaSlova.compareTo(malaSlova));
      System.out.println(velikaSlova.compareToIgnoreCase(malaSlova));
   }
}
