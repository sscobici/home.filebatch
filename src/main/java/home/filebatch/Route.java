package home.filebatch;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:c:/temp/filebatch/in?delete=true")
        .split(body().tokenize(System.lineSeparator()))
        .streaming()
        .to("file:c:/temp/filebatch/out?fileName=${file:onlyname.noext}-${exchangeProperty.CamelSplitIndex}.${file:ext}");
    }
}
