package com.guilhermebritofreire.my_own_blog.config;

import com.guilhermebritofreire.my_own_blog.utils.globalData.PreferencesProvider;
import lombok.RequiredArgsConstructor;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
@RequiredArgsConstructor
public class GlobalAttributesConfig {
    private final PreferencesProvider  preferencesProvider;

    @ModelAttribute
    public void addGlobalAttributes(Model model) {
        preferencesProvider.applyPreferences(model);
    }
}
