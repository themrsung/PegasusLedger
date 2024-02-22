package pegasus.portfolio;

import pegasus.asset.Asset;
import pegasus.liability.Liability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class TestPortfolio implements Portfolio {
    private String name;
    private final List<Asset> assets = new ArrayList<>();
    private final List<Liability> liabilities = new ArrayList<>();

    public TestPortfolio(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Stream<Asset> getAssets() {
        return assets.stream();
    }

    @Override
    public boolean containsAsset(Asset a) {
        return assets.contains(a);
    }

    @Override
    public int getAssetCount() {
        return assets.size();
    }

    @Override
    public double getAssetValue() {
        return assets.stream().mapToDouble(Asset::getValue).sum();
    }

    @Override
    public void addAsset(Asset a) {
        assets.add(Objects.requireNonNull(a));
    }

    @Override
    public void removeAsset(Asset a) {
        assets.remove(a);
    }

    @Override
    public Stream<Liability> getLiabilities() {
        return liabilities.stream();
    }

    @Override
    public boolean containsLiability(Liability l) {
        return liabilities.contains(l);
    }

    @Override
    public int getLiabilityCount() {
        return liabilities.size();
    }

    @Override
    public double getLiabilityValue() {
        return liabilities.stream().mapToDouble(Liability::getValue).sum();
    }

    @Override
    public void addLiability(Liability l) {
        liabilities.add(l);
    }

    @Override
    public void removeLiability(Liability l) {
        liabilities.remove(l);
    }

    @Override
    public double getNetAssetValue() {
        return getAssetValue() - getLiabilityValue();
    }
}
