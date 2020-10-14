public class Barman {

    private static final int MINIMUM_AGE = 18;

    public void order(Person person, Drink drink) {
        if(person.getAge() < MINIMUM_AGE && drink.isAlcoholic())
            System.out.println("Odmowa sprzedaży alkoholu ! Klient niepełnoletni !");
        else
            System.out.println(person.getFirstName()+ " " + person.getLastName()
                    + ", Twój drink " + drink.getName()
                    + " jest gotowy. Kwota do zapłaty: " + drink.getPrice());
    }
}
