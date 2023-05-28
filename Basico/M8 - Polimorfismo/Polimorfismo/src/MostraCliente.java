package src;

import java.util.function.Consumer;

public class MostraCliente implements Consumer {

    @Override
    public void accept(Object t) {
        System.out.println(t);
    }

}
