package Q1toQ30.Q7;

public class Tool implements Exportable{
    @Override
    public void export() {                      // method protected olamaz
        System.out.println("Tool :: export");
    }
}


// export report interface de public oldugu icin protected olarak override edemeyiz.