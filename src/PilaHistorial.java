package Metodos;
import java.util.Stack;
public class PilaHistorial {
    private  Stack<String> pilaAtras;
    private Stack<String> pilaAdelenta;
    private String paginaActual;
    public PilaHistorial(){
        pilaAtras = new Stack<>();
        pilaAdelenta =new Stack<>();
        paginaActual="";
    }
    public void irPagina(String pagina){
        pilaAtras.push(paginaActual);
        paginaActual=pagina;
        pilaAdelenta.clear();
        System.out.println("Navegando a la pagina:"+ pagina);

    }
    public void retroceder(){
        if(!pilaAtras.isEmpty()){
            pilaAdelenta.push(paginaActual);
            paginaActual=pilaAtras.pop();
            System.out.println("Retrocediendo a la pagina"+paginaActual);
        }else {
            System.out.println("no hay paginas anteriores para retroceder");
        }
    }
    public void adelantar(){
        if(!pilaAdelenta.isEmpty()){
            pilaAtras.push(paginaActual);
            paginaActual= pilaAdelenta.pop();
            System.out.println("Adelantando a la pagina:"+paginaActual);
        }else
        {
            System.out.println("no hay paginas para adelantar");
        }
    }
    public String obtenerPaginaAcgtual(){
        return paginaActual;
    }
    public static void main(String args[]){
        PilaHistorial navegador= new PilaHistorial();
        navegador.irPagina("www.google.com");
        navegador.irPagina("www.youtube.com");
        navegador.irPagina("www.wikipedia.com");
        System.out.println("Pagina actual"+navegador.paginaActual);
        navegador.retroceder();
        navegador.retroceder();
        System.out.println("Pagina actual"+navegador.paginaActual);
        navegador.adelantar();
        System.out.println("Pagina actual"+navegador.paginaActual);
    }
}
