public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic" , "Sausage" , "White", 3.56);
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println(hamburger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Chicken Breast" , 5);
        healthyBurger.addHealthyAddition1("Cucumber" , 1);
        healthyBurger.addHealthyAddition2("Lettuce" , 1);
        System.out.println(healthyBurger.itemizeHamburger());
    }

}
