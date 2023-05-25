public class Main {

    public static void main(String[] args) {

      Boss boss = new Boss();
      boss.setHealthHB(700);
      boss.setDamageHB(50);
      boss.setWeaponType(WeaponType.FIRE);
        System.out.println(boss.info());
    }


}