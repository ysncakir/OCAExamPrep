package Q1toQ30.Q7;

public class main {

    public static void main(String[] args) {

        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);

    }

    public static void callExport(Exportable ex){
        ex.export();
    }
}
