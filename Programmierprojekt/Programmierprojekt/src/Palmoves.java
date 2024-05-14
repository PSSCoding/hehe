public class Palmoves {
    int palmon_id;
    int move_id;
    int learned_on_level;

    public Palmoves(int palmon_id, int move_id, int learned_on_level) {
        this.palmon_id = palmon_id;
        this.move_id = move_id;
        this.learned_on_level = learned_on_level;
    }

    public int getPalmon_id() {
        return palmon_id;
    }

    public void setPalmon_id(int palmon_id) {
        this.palmon_id = palmon_id;
    }

    public int getMove_id() {
        return move_id;
    }

    public void setMove_id(int move_id) {
        this.move_id = move_id;
    }

    public int getLearned_on_level() {
        return learned_on_level;
    }

    public void setLearned_on_level(int learned_on_level) {
        this.learned_on_level = learned_on_level;
    }
}
