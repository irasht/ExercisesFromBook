package e11;

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        System.out.println(anIntegerRepresentingColors = newHue);
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow all = new AllTheColorsOfTheRainbow();
        all.changeTheHueOfTheColor(5);
    }
}