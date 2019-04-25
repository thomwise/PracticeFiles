public class Effect {

    public String effectName;
    public int deltaHealth;
    public int duration;

    public Effect(String effectName, int deltaHealth, int duration) {
        this.effectName = effectName;
        this.deltaHealth = deltaHealth;
        this.duration = duration;
    }
}
