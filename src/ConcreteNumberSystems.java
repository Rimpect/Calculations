public class ConcreteNumberSystems extends Number_systems {
    @Override
    public void change_system() {
        System.out.println("Выбор системы счисления");
        System.out.println("1 Двоичная");
        System.out.println("2 Восьмиричная");
        System.out.println("3 Десятичная");
        System.out.println("4 Шестнацитиричная");
    }

    @Override
    public int convertToDecimal(String number, int base) {
        return Integer.parseInt(number, base);
    }
}