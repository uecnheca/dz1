package person.example;

import person.example.model.*;

public class Main {
    public static void main(String[] args) {
        Thrower thrower = new Thrower("Колян", "Метатель", 3900, 200, 7);
        MagicianHealth magicianHealth = new MagicianHealth("Люся", "Маг Целитель", 3600, 200, 3000, "Исцеление");
        Warrior warrior = new Warrior("Толя", "Воин", 6400, 400, 1500);
        Magician magician = new Magician("Ленка", "Маг", 3400, 200, 3000);
        MagicianDamage magicianDamage = new MagicianDamage("Катюха", "Атакующий маг", 4000, 300, 3000, 600);
        System.out.println(magicianDamage);
        System.out.println(magician);
        System.out.println(warrior);
        System.out.println(thrower);
        System.out.println(magicianHealth);
        warrior.Attack(magicianHealth);
        System.out.println();
        System.out.println("Толя ударил Люсю");
        System.out.println(magicianDamage);
        System.out.println(magician);
        System.out.println(warrior);
        System.out.println(thrower);
        System.out.println(magicianHealth);
        System.out.println();
        magician.Support(magicianDamage);
        System.out.println("Ленка хилит Люсю");
        System.out.println(magicianDamage);
        System.out.println(magician);
        System.out.println(warrior);
        System.out.println(thrower);
        System.out.println(magicianHealth);
        magician.ApplyMagic(thrower);
        System.out.println();
        System.out.println("Ленка нанесла урон Коляну");
        System.out.println(magicianDamage);
        System.out.println(magician);
        System.out.println(warrior);
        System.out.println(thrower);
        System.out.println(magicianHealth);
        System.out.println();
        thrower.Throw(magicianDamage, magicianDamage, magicianHealth);
        System.out.println("Колян атаковал магов");
        System.out.println(magicianDamage);
        System.out.println(magician);
        System.out.println(warrior);
        System.out.println(thrower);
        System.out.println(magicianHealth);
        System.out.println();
    }
}