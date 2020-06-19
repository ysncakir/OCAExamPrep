package Q91to120;

public class Q96 {
}

    interface Exportable {
        void export ();
    }

    class Tool implements Exportable {

        public void export () {
            System.out.println("Q91to120.Tool : export");
        }
    }

    class ReportTool extends Tool {

//        @Override
//        public void export() {  // default olacagi icin calismaz. Interface deki metodu
//                            // override ettigi icin public den asagi olmamasi lazim
//            System.out.println("RTool : export");
//        }


        public static void main(String[] args) {

            Tool aTool = new ReportTool();
            Tool bTool = new Tool () ;
            callExport(aTool);
            callExport(bTool);
        }

        public static void callExport (Exportable ex) {
            ex.export();
        }
    }



