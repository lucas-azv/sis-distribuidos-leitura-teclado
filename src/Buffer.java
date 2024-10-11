public class Buffer {
    private StringBuffer conteudo = new StringBuffer("");

    synchronized void addConteudoBuffer(String novaLinha){
        conteudo.append(novaLinha);
    }

    public synchronized String lerConteudoBuffer(){
        return conteudo.toString();
    }
}
