public class Main {
    public static void main(String[] args) {
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var allWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес боксеров " +allWeight + " килогрмм!");
var difference = boxer2Weight - boxer1Weight;
        System.out.println("разница в весел " + difference + "кг!");
        var differenceWeight = boxer2Weight % boxer1Weight;
        System.out.println("разница остатка " + differenceWeight + "кг!");



        var allTime = 640;
        var workingTime = 8;
        var employeesAmount = allTime / workingTime;
        System.out.println("Всего работников в комании " + employeesAmount + " человек.");
        var newbee = 94;
        var allEmploees = employeesAmount + newbee;
        var overTime = (newbee + employeesAmount) * workingTime;
        System.out.println("Если в компании работает всего " + allEmploees + " , то всего " + overTime + " часов может быть поделено между сотрудниками"
        );


    }
}