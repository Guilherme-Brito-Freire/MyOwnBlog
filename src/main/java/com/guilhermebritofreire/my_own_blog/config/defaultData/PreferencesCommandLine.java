package com.guilhermebritofreire.my_own_blog.config.defaultData;

import com.guilhermebritofreire.my_own_blog.utils.globalData.PreferencesProvider;
import lombok.AllArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PreferencesCommandLine implements CommandLineRunner {
    
    private final PreferencesProvider preferencesProvider;
    
    @Override
    public void run(String @NonNull ... args) throws Exception {
        boolean status = preferencesProvider.reloadPreferences();

        if(status){
            System.out.println("Preferences loaded!");
            return;
        }
        System.out.println("Preferences NOT found. Resetting them");

    }
}