package champcraft.champcraftsystem.region;

import org.betterspigot.bspigot.region.AbstractRegion;

public class SpawnRegion extends AbstractRegion {
    @Override
    public int getMinX() {
        return -30;
    }

    @Override
    public int getMaxX() {
        return 30;
    }

    @Override
    public int getMinY() {
        return 90;
    }

    @Override
    public int getMaxY() {
        return 256;
    }

    @Override
    public int getMinZ() {
        return -30;
    }

    @Override
    public int getMaxZ() {
        return 30;
    }
}
