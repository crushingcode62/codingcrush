//Instrument.java
abstract class Instrument {
  public abstract void play();

  public abstract void tune();
}
//Glockenspiel.java
class Glockenspiel extends Instrument {
  @Override
  public void play() {
    System.out.println("Glockenspiel: Playing the notes on the metal bars.");
  }

  @Override
  public void tune() {
    System.out.println("Glockenspiel: Tuning the metal bars to the correct pitch.");
  }
}
//Violin.java
class Violin extends Instrument {
  @Override
  public void play() {
    System.out.println("Violin: Playing the strings with a bow or fingers.");
  }

  @Override
  public void tune() {
    System.out.println("Violin: Tuning the strings to the correct pitch.");
  }
}
//Main.java
class pro23 {
  public static void main(String[] args) {
    Instrument glockenspiel = new Glockenspiel();
    Instrument violin = new Violin();

    glockenspiel.play();
    glockenspiel.tune();

    violin.play();
    violin.tune();
  }
}