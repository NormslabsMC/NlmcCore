package net.normslabs.nlmc_core.datagen;

import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nlmc.nlmc_core.NlmcCore;
import net.nlmc.nlmc_core.registrar.registrytypes.FluidEngineFuelData;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public abstract class NlmcFluidEngineFuelProvider implements DataProvider {
    private final DataGenerator generator;
    
    private final DeferredRegister<FluidEngineFuelData> registry;
    
    protected NlmcFluidEngineFuelProvider(DataGenerator generator, DeferredRegister<FluidEngineFuelData> registry) {
        this.generator = generator;
        this.registry = registry;
    }
    
    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        Path output = this.generator.getPackOutput().getOutputFolder();
        for (RegistryObject<FluidEngineFuelData> fuelObject : this.registry.getEntries()) {
            String name = fuelObject.getId().getPath();
            Path path = output.resolve("data/" + this.registry.getRegistryKey().location().getNamespace() + "/diesel_engine_fuel_types/" + name + ".json");
            // Generate the JSON content for the mana type
            String jsonContent = generateJsonForFuel(fuelObject.get());
            try {
                Files.createDirectories(path.getParent());
                Files.writeString(path, jsonContent);
            } catch (Exception e) {
                NlmcCore.getLogger().error("Failed to execute " + this.getName() + ".", e);
            }
        }
        return CompletableFuture.allOf();
    }
    
    private String generateJsonForFuel(FluidEngineFuelData fuelDataObject) {
        return fuelDataObject.toCdgJson();
    }
    
    @Override
    public String getName() {
        return this.registry.getRegistryKey().location().getNamespace() + " CDG Fuel Data Generator";
    }
}