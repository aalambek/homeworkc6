public class Weapon {
    private WeaponType typeOfWeapon;
    private String nameOfWeapon;

    public Weapon(WeaponType typeOfWeapon, String nameOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
        this.nameOfWeapon = nameOfWeapon;
    }

    public WeaponType getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setTypeOfWeapon(WeaponType typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}

