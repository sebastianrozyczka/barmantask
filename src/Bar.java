public class Bar {
    public static void main(String[] args) {
        Barman barman = new Barman();
        Drink alcoholic = new Drink("Malibu", 12.5, true);
        Drink nonAlcoholic = new Drink("Cola", 3.79, false);
        Person adult = new Person("Sebastian", "Rozyczka", 21);
        Person underage = new Person("Artur", "Kowalski", 16);

        barman.order(adult, alcoholic);
        barman.order(adult, nonAlcoholic);
        barman.order(underage, alcoholic);
        barman.order(underage, nonAlcoholic);
    }
}
