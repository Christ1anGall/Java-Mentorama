package metodos2;

import metodos.Primeiro;

public class Quarta extends Primeiro {
    private void metodoPrivado() {

        metodoProtect();

        metodoPrivado();

        metodoDefault(); // not possible acess

    }
}
