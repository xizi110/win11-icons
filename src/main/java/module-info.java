module xyz.yuelai.ikonli.win11 {
    requires org.kordamp.ikonli.core;
    requires static org.kordamp.jipsy.annotations;

    exports xyz.yuelai.ikonli.win11;

    provides org.kordamp.ikonli.IkonHandler
            with xyz.yuelai.ikonli.win11.Win11IkonHandler;
    provides org.kordamp.ikonli.IkonProvider
            with xyz.yuelai.ikonli.win11.Win11IkonProvider;

}