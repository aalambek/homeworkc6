public class GameEntity {
    int healthHB;
    int damageHB;

    WeaponType weaponType;



    public void setHealthHB(int healthHB) {
        this.healthHB = healthHB;
    }

    public void setDamageHB(int damageHB) {
        this.damageHB = damageHB;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getHeathHB() {
        return healthHB;
    }


    public int getDamageHB() {
        return damageHB;
    }

    public String info (){
        return "Boss Health: "+this.healthHB + " damage: "+ this.damageHB+ " weapon: "+ this.weaponType;
    }
}

