public class Move {

    int id;
    String name;
    int damage;
    int max_usages;
    int accuracy;
    String type;

    public Move(int id, String name, int damage, int max_usages, int accuracy, String type) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.max_usages=max_usages;
        this.accuracy=accuracy;
        this.type=type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMax_usages() {
        return max_usages;
    }

    public void setMax_usages(int max_usages) {
        this.max_usages = max_usages;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
