package com.hillel.Piatnytsia.homeworks.homework5;

public class ChineseDynasties {
    public static void main(String[] args) {
        int attackWarriorLi = 13;
        int attackArcherLi = 24;
        int attackRiderLi = 46;
        int countSoldiersEachTypeLi = 860;

        int attackWarriorMin = 9;
        int attackArcherMin = 35;
        int attackRiderMin = 12;
        double countSoldiersEachTypeMin = countSoldiersEachTypeLi * 1.5;

        int totalAttackArmyLi = countSoldiersEachTypeLi * (attackWarriorLi + attackArcherLi + attackRiderLi);
        double totalAttackArmyMin = countSoldiersEachTypeMin * (attackWarriorMin + attackArcherMin + attackRiderMin);

        System.out.println("Загальний показник атаки армії Лі = " + totalAttackArmyLi);
        System.out.println("Загальний показник атаки армії Мінь = " + (int) totalAttackArmyMin);
    }
}
