package e22;

import e21.PaperCurrencyType;

public class EnumWithSwitch {
    static void describe(PaperCurrencyType pct) {
        System.out.print(pct + " has a portrait of ");
        switch (pct) {
            case ONE:
                System.out.print("Volodymyr the Great of Kyiv");
                break;

            case TWO:
                System.out.print("Yaroslav the Wise");
                break;
            case FIVE:
                System.out.print("Bohdan Khmelnytsky");
                break;
            case TEN:
                System.out.print("Ivan Mazepa");
                break;
            case TWENTY:
                System.out.print("Ivan Franko");
                break;
            case FIFTY:
                System.out.print("Mykhailo Hrushevskyi");
                break;
            case HUNDRED:
                System.out.print("Taras Shevchenko");
        }
    }

    public static void main(String args[]) {
        for (PaperCurrencyType s : PaperCurrencyType.values()) {
            describe(s);
            System.out.println();
        }
    }
}
