public class Main {
    public static void main(String[] args) {

        Pizza pizzaDefault = new BuilderPizza().build();
        System.out.println(pizzaDefault.toString());

        Pizza pizzaConpina = new BuilderPizza()
                .setPina(true)
                .build();
        System.out.println(pizzaConpina.toString());
        Pizza pizzaBarbacoa = new BuilderPizza()
                .setTipoMasa(Pizza.FINA)
                .setTipoSalsa(Pizza.BARBACOA)
                .build();
        System.out.println(pizzaBarbacoa.toString());
    }
}