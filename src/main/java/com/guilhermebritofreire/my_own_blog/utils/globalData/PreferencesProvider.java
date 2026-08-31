package com.guilhermebritofreire.my_own_blog.utils.globalData;

import com.guilhermebritofreire.my_own_blog.models.PreferencesModel;
import com.guilhermebritofreire.my_own_blog.repositories.PreferencesRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PreferencesProvider {

    @Value("${globalPreferencesId}")
    private String preferencesId;

    @Getter
    private PreferencesModel preferencesCache;

    private final PreferencesRepository preferencesRepository;

    private PreferencesModel generateDefaultInstance(){
        return new  PreferencesModel(
                preferencesId,
                "MyOwnBlog",
                true,
                "Hello World!"
        );
    }

    public void applyPreferences(Model modelUi) {
        if (preferencesCache == null) {
            preferencesCache = preferencesRepository.findById(preferencesId)
                    .orElseGet(this::generateDefaultInstance);
        }
        modelUi.addAttribute("preferences", preferencesCache);
    }

    public void SavePreferences(PreferencesModel preferences){

        // Validate the name
        if (preferences.getBlogName() == null || preferences.getBlogName().isEmpty()) {
            throw new RuntimeException("Invalid Blog Name");
        }

        // Validate the Intro Message
        if (preferences.getIntroMessage() == null || preferences.getIntroMessage().isEmpty()) {
            throw new RuntimeException("Invalid Intro Message");
        }

        preferences.setId(preferencesId);

        // Save in Database and apply in runtime.
        preferencesRepository.save(preferences);
        preferencesCache = preferences;
    }

    // Used For the system start with a Default data
    public boolean reloadPreferences() {
        Optional<PreferencesModel> preferencesModel = preferencesRepository.findById(preferencesId);
        if(preferencesModel.isPresent()) {
            // Exist cache
            preferencesCache = preferencesModel.get();
            return true; // The change has made
        }
        PreferencesModel preferenceGenerated = generateDefaultInstance();
        preferencesRepository.save(preferenceGenerated);
        preferencesCache = preferenceGenerated;
        return false; // Something failed
    }
}