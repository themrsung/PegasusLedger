package pegasus;

import pegasus.portfolio.TestPortfolio;

public class Main {
    public static void main(String[] args) {
        var port = new TestPortfolio("test");

        port.addAsset(() -> 3000);
        port.addAsset(() -> 3002);
        port.addAsset(() -> 3054);

        port.addLiability(() -> 232);

        System.out.println(port.getAssetValue());
        System.out.println(port.getLiabilityValue());
        System.out.println(port.getNetAssetValue());
    }
}