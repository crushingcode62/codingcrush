abstract class Bird {
       abstract void fly();
    abstract void makeSound();
}
class Eagle extends Bird {
        public void fly() {
        System.out.println("Eagles can fly high.");
    }
   public void makeSound() {
        System.out.println("Eagles make a screeching sound.");
    }
}
class Hawk extends Bird {
        public void fly() {
        System.out.println("Hawks can fly quickly.");
    }
   public void makeSound() {
        System.out.println("Hawks make a loud sound.");
    }
}
public class pro25 {
    public static void main(String[] args) {
      
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();
        eagle.fly();
        eagle.makeSound();
        hawk.fly();
        hawk.makeSound();
    }
}