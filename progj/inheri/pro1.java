
class Animal{
    void  makesound()
    {
        System.out.println("moooo");
    }
}
 class Cat extends Animal{
    void makesound()
    {
            System.out.println("cat does not barking");
    }
    public static void main(String a[])
    {
        Cat obj= new Cat();
        obj.makesound();
    }
    
 }