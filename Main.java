import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner wyjscie = new Scanner(System.in);
    int w=0;
    int liczba;
   
    while (true ){
      System.out.println("Wybierz jedną z następujących opcji");
      System.out.println("1. DEC to BIN");
      System.out.println("2. DEC to OCT");
      System.out.println("3. BIN to DEC");
      System.out.println("4. Wyjście z programu");
      w = wyjscie.nextInt();

      switch (w){
        case 1:
          String wynik = "";
          System.out.println("Podaj liczbę");
          liczba = wyjscie.nextInt();
          if (liczba==0){
            System.out.println("Wynik to 0");
            break;
            
          }
          if (liczba<0){
            System.out.println("Niepoprawne dane");
            break;
          }
          while (liczba > 0){
            int mod = liczba%2;
            liczba = liczba/2;
            wynik = mod+wynik;
          }
          System.out.println("Twoja liczba w systemie binarnym to: "+wynik);
          break;
        case 2:
          String wynik2 = "";
          System.out.println("Podaj liczbę");
          liczba = wyjscie.nextInt();
          if (liczba==0){
            System.out.println("Wynik to 0");
            break;
            
          }
          if (liczba<0){
            System.out.println("Niepoprawne dane");
            break;
          }
          while (liczba > 0){
            int mod = liczba%8;
            liczba = liczba/8;
            wynik2 = mod+wynik2;
          }
          System.out.println("Twoja liczba w systemie ósemkowym to: "+wynik2);
          break;
        case 3:
          System.out.println("Podaj liczbę binarnie");
          String liczba2 = wyjscie.next();
          int DEC = Integer.parseInt(liczba2,2);
          System.out.println("Twoja liczba: "+DEC);
          break;
        case 4:
          System.exit(0);
          break;
          
      }
    }
  }
}