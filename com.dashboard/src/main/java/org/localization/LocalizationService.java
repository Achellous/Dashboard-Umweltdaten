package org.localization;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Locale;
import java.util.ResourceBundle;

@ApplicationScoped
public class LocalizationService {

    private Locale locale = Locale.getDefault();

    public String getMessage(String key) {
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.messages", locale);
        return bundle.getString(key);
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
