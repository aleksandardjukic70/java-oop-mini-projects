package milantairoopapp09;

public class Subject {
    private String name, code;

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getCode() {
        return code;
    }

    public final void setCode(String code) {
        this.code = code;
    }

    public Subject() {
    }

    public Subject(String name, String code) {
        this.setName(name);
        this.setCode(code);
    }

    @Override
    public String toString() {
        return "Subject{" + "name=" + name + ", code=" + code + '}';
    }
    
    
}
