package info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP2;
public abstract class Shape implements Cloneable {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void draw();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

