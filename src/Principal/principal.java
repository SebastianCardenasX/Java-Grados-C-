
package Principal;

import controlador.CntConversor;
import modelo.MdlConversion;
import vista.FrmConversion;

public class principal {
    
    public static void main(String[] args) {
        FrmConversion frmConversor = new FrmConversion();
        MdlConversion mdlConversion = new MdlConversion();
        CntConversor ctnConversor= new CntConversor(frmConversor,mdlConversion);
        frmConversor.setVisible(true);
        
    }
    
}
