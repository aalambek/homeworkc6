public class GameEntity {
    int healthHB;
    int damageHB;

    Weapon weaponType;



    public void setHealthHB(int healthHB) {
        this.healthHB = healthHB;
    }

    public void setDamageHB(int damageHB) {
        this.damageHB = damageHB;
    }

    public Weapon getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(Weapon weaponType) {
        this.weaponType = weaponType;
    }

    public int getHeathHB() {
        return healthHB;
    }


    public int getDamageHB() {
        return damageHB;
    }

    public String info (){
        return "Boss Health: "+this.healthHB + ", damage: "+ this.damageHB+ ", weapon name: "+ this.weaponType.getNameOfWeapon() + ", weapon type: "+ this.weaponType.getTypeOfWeapon() ;
    }
}

