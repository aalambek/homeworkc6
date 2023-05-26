public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealthHB(700);
        boss.setDamageHB(50);
        Weapon weapon = new Weapon(WeaponType.FIRE, "Fire-Gun");
        boss.setWeaponType(weapon);
        System.out.println(boss.info());
    }


}