package pegasus.portfolio;

import pegasus.asset.Asset;
import pegasus.liability.Liability;

import java.util.stream.Stream;

/**
 * A portfolio.
 */
public interface Portfolio {
    /**
     * Returns the name of this portfolio.
     * @return The name of this portfolio
     */
    String getName();

    /**
     * Sets the name of this portfolio.
     * @param name The name of this portfolio
     */
    void setName(String name);

    /**
     * Returns a stream of every asset this portfolio contains.
     * @return A stream of every asset this portfolio contains
     */
    Stream<Asset> getAssets();

    /**
     * Checks if this portfolio contains the provided asset {@code a}.
     * @param a The asset of which to check for containment
     * @return {@code true} if this portfolio contains the provided asset
     */
    boolean containsAsset(Asset a);

    /**
     * Returns the number of assets this portfolio contains.
     * @return The number of assets this portfolio contains
     */
    int getAssetCount();

    /**
     * Returns the total asset value of this portfolio.
     * @return The total asset value of this portfolio
     */
    double getAssetValue();

    /**
     * Adds the provided asset {@code a} to this portfolio.
     * @param a The asset to add to this portfolio
     * @throws NullPointerException When the provided asset {@code a} is {@code null}
     */
    void addAsset(Asset a);

    /**
     * Removes the provided asset {@code a} from this portfolio.
     * @param a The asset to remove from this portfolio
     */
    void removeAsset(Asset a);

    /**
     * Returns a stream of every liability this portfolio contains.
     * @return A stream of every liability this portfolio contains
     */
    Stream<Liability> getLiabilities();

    /**
     * Checks if this portfolio contains the provided liability {@code l}.
     * @param l The liability of which to check for containment
     * @return {@code true} if this portfolio contains the provided liability
     */
    boolean containsLiability(Liability l);

    /**
     * Returns the number of liabilities this portfolio contains.
     * @return The number of liabilities this portfolio contains
     */
    int getLiabilityCount();

    /**
     * Returns the total liability value of this portfolio.
     * @return The total liability value of this portfolio
     */
    double getLiabilityValue();

    /**
     * Adds the provided liability {@code l} to this portfolio.
     * @param l The liability to add to this portfolio
     * @throws NullPointerException When the provided liability {@code l} is {@code null}
     */
    void addLiability(Liability l);

    /**
     * Removes the provided liability {@code l} from this portfolio.
     * @param l The liability to remove from this portfolio
     */
    void removeLiability(Liability l);

    /**
     * Returns the net asset value of this portfolio.
     * @return The net asset value of this portfolio
     */
    double getNetAssetValue();
}
