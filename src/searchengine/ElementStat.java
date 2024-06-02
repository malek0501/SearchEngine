package searchengine;

public class ElementStat<elment, stat> {
	public elment key;
	public stat value;

    public ElementStat(elment key, stat value) {
        this.key = key;
        this.value = value;
    }
    public elment getKey() {
        return key;
    }

    public stat getValue() {
        return value;
    }
    public void setKey(elment key) {
        // Setter for the 'key' attribute
        this.key = key;
    }

    public void setValue(stat value) {
        // Setter for the 'value' attribute
        this.value = value;
    }
}
