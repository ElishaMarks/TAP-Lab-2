import java.util.Scanner;

class Dog{
    public String race;
    public int age;

    public Dog(){
        System.out.println("Constructor fara parametru dog");
        race="Necunoscut";
        age=8;
    }
    public Dog(int age,String race){
        System.out.println("Constructor parametru int,string race");
        this.age=age;
        this.race=race;
    }

    public Dog(String race ,int age){
        System.out.println("Constructor parametru string,int age");
        this.age=age;
        this.race=race;
    }
    public void afisare() {
        System.out.println("Câine ");
        System.out.println("Rasa: "+race);
        System.out.println("Varsta: "+age);
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }
}

class coolDog extends Dog{

    private char categorie;
    public coolDog(){
        super();
        System.out.println("fara parametru coolDog");
        this.categorie='Z';
    }
    public coolDog(String race, int age, char cat){
        super(race,age);
        System.out.println("parametru coolDog");
        this.categorie=cat;
    }

    public void afisare() {
        System.out.println("Catel frumos ");
        System.out.println("Rasa: "+getRace());
        System.out.println("Varsta: "+getAge());
        System.out.println("Categoria: "+categorie);
    }
    public char getCategorie() {
        return categorie;
    }
    public void changeCategory(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu noua categorie pentru :"+getRace());
        this.categorie=sc.next().charAt(0);
        sc.close();

    }
}


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Dog unknown =new Dog();
        Dog Labrador= new Dog("Labrador",2);
        Dog Husky=new Dog(11,"Husky");
        coolDog Borzoi =new coolDog();
        coolDog Pudel=new coolDog("Pudel",10,'L');

        unknown.afisare();
        System.out.println(Labrador.getRace());
        System.out.println(Husky.getAge());
        System.out.println(Borzoi.getCategorie());
        Pudel.afisare();
        Pudel.changeCategory();
        System.out.println("Categoria schimbata: ");
        Pudel.afisare();
    }
}