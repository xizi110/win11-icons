package xyz.yuelai.ikonli.win11;

import org.kordamp.ikonli.AbstractIkonHandler;
import org.kordamp.ikonli.Ikon;
import org.kordamp.ikonli.IkonHandler;
import org.kordamp.jipsy.annotations.ServiceProviderFor;

import java.io.InputStream;
import java.net.URL;

/**
 * @author Andres Almiray
 */
@ServiceProviderFor(IkonHandler.class)
public class Win11IkonHandler extends AbstractIkonHandler {
    private static final String FONT_RESOURCE = "/META-INF/resources/win11/segoeFluentIcons/SegoeFluentIcons.ttf";

    @Override
    public boolean supports(String description) {
        return description != null && description.startsWith("win11-");
    }

    @Override
    public Ikon resolve(String description) {
        return Win11.findByDescription(description);
    }

    @Override
    public URL getFontResource() {
        return getClass().getResource(FONT_RESOURCE);
    }

    @Override
    public InputStream getFontResourceAsStream() {
        return getClass().getResourceAsStream(FONT_RESOURCE);
    }

    @Override
    public String getFontFamily() {
        return "Segoe Fluent Icons";
    }
}