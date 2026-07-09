package com.guilhermebritofreire.my_own_blog.domains.settings;

import com.guilhermebritofreire.my_own_blog.models.PreferencesModel;
import com.guilhermebritofreire.my_own_blog.utils.globalData.PreferencesProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class SettingsController {

    private final PreferencesProvider preferencesProvider;

    @GetMapping("/settings")
    public String settingsPageIndex() {
        return "pages/settings/index";
    }

    @PostMapping("settings/save")
    public String applySettings(PreferencesModel model) {
        preferencesProvider.SavePreferences(model);
        return "redirect:/";
    }
}
