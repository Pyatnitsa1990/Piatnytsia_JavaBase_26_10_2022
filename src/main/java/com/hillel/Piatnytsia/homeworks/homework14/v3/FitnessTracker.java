package com.hillel.Piatnytsia.homeworks.homework14.v3;

public class FitnessTracker {
    public static void main(String[] args) {
        Account leha = new Account("Олексій", new Date(28, 11, 1990), "wer@gmail.com", "0679958764", "П'ятниця", 75, 120, 14857);
        Account viktor = new Account("Віктор", new Date(14, 11, 1989), "tkp@gmail.com", "0985767472", "Марченко", 70, 125, 11325);
        Account dimon = new Account("Дімон", new Date(6, 7, 1992), "ghj@gmail.com", "0636574747", "Михоцький", 82, 123, 9725);
        printAccountInfo(viktor);
        printAccountInfo(leha);
        printAccountInfo(dimon);

        viktor.setPressure(130);
        viktor.setSurname("Толстих");
        leha.setWeight(72);
        leha.setCountSteps(19466);
        System.out.println("\nДані з новими змінними");
        printAccountInfo(viktor);
        printAccountInfo(leha);
    }

    public static void printAccountInfo(Account account) {
        String printInfo = "\nІм'я: %s\n" +
                "Прізвище: %s\n" +
                "Дата народження: %s\n" +
                "Email: %s\n" +
                "Мобільний номер: %s\n" +
                "Вага: %d\n" +
                "Тиск: %d\n" +
                "Кількість шагів: %d\n"+
                "Вік: %d\n"
                ;

        System.out.printf(printInfo,
                account.getName(),
                account.getSurname(),
                account.getBirthDay(),
                account.getEmail(),
                account.getMobilePhone(),
                account.getWeight(),
                account.getPressure(),
                account.getCountSteps(),
                account.getAge());
    }

    }



