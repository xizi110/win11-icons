package xyz.yuelai.ikonli.win11;

import org.kordamp.ikonli.IkonProvider;
import org.kordamp.jipsy.annotations.ServiceProviderFor;

@ServiceProviderFor(IkonProvider.class)
public class Win11IkonProvider implements IkonProvider<Win11> {
    @Override
    public Class<Win11> getIkon() {
        return Win11.class;
    }
}