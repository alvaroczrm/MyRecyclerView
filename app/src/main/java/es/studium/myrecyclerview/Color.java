package es.studium.myrecyclerview;

public class Color {
    private final String name;
    private final String hex;

    public Color(String name, String hex) {
        this.name = name;
        this.hex = hex;
    }
    public String getName() {
        return name;
    }

    public String getHex() {
        return hex;
    }
}
