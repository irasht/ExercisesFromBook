package e21;

public class PaperCurrencyEnum {
    public static void main(String[] args) {
        for (PaperCurrencyType currency : PaperCurrencyType.values())
            System.out.println(currency + ", ordinal " + currency.ordinal());
    }
}
