import java.io.File;
import java.io.PrintWriter;

public class SalvamentoAutomatico implements Runnable, Observador{

    private static final String PATH = "\"C:\\Users\\aluno\\Documents\\LucasBA\\LeituraTeclado\\temp.txt\"";
    private static final Integer INTERVAL = 10000;
    private Buffer buffer;
    private Boolean teveMudanca;

    public SalvamentoAutomatico(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run(){
        while(true){
            try{
                System.out.println(teveMudanca);
                File file = new File(PATH);
                String textoSalvar = buffer.lerConteudoBuffer();
                PrintWriter pw = new PrintWriter(file);
                pw.println(textoSalvar);
                pw.close();
                Thread.sleep(INTERVAL);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void notificaMudanca() {
        teveMudanca = Boolean.TRUE;
    }
}
