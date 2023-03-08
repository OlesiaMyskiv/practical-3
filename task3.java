public class task3 {

    public class Menu {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введіть ваш вибір (Так/Ні): ");
            String choice = input.next().toLowerCase();

            switch (choice) {
                case "так":
                case "ok":
                case "yes":
                case "y":
                case "+":
                    System.out.println("Я погоджуюсь!");
                    break;
                case "ні":
                case "no":
                case "n":
                case "-":
                    System.out.println("Я відмовляюсь!");
                    break;
                default:
                    System.out.println("Неправильне значення. Будь ласка, спробуйте знову.");
                    break;
            }
}
