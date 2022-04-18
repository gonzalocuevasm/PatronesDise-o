package Command;

public class Invoker {
    private Commands comandos;

    public void setComandos(Commands comandos) {
        this.comandos = comandos;
    }
    public void executeCommand() {
        this.comandos.execute();
    }
}
