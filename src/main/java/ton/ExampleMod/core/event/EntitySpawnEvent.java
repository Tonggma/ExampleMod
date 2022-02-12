package ton.ExampleMod.core.event;

import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import ton.ExampleMod.common.entity.ExampleEntity;

public class EntitySpawnEvent {
    public static void BiomeLoading(BiomeLoadingEvent event) {
        if (event.getName() == null) {
            return;
        }
        MobSpawnInfoBuilder spawns = event.getSpawns();

        if (event.getCategory().equals(Biome.Category.BEACH) && event.getCategory().equals(Biome.Category.FOREST)) {
            spawns.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(ExampleEntity.TYPE, 10 ,4, 4));
        }
    }
}
