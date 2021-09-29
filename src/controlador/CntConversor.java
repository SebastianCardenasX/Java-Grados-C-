package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MdlConversion;
import vista.FrmConversion;

public class CntConversor implements ActionListener {

    private FrmConversion frmConversor;
    private MdlConversion mdlConversion;

    public CntConversor(FrmConversion frmConversor, MdlConversion mdlConversion) {
        this.frmConversor = frmConversor;
        this.mdlConversion = mdlConversion;
        frmConversor.getBtnConvertir().addActionListener(this);
        frmConversor.getBtnLimpiar().addActionListener(this);

    }

    private void aFahrenheit() {
        Double centigrados = Double.parseDouble(frmConversor.getTxtCentigrados().getText());
        Double fahrenheit = mdlConversion.aFahrenheit(centigrados);
        frmConversor.getTxtFarenheit().setText(fahrenheit.toString());
    }

    private void aCentigrados() {
        Double fahrenheit = Double.parseDouble(frmConversor.getTxtFarenheit().getText());
        Double centigrados = mdlConversion.aCentigrados(fahrenheit);
        frmConversor.getTxtCentigrados().setText(centigrados.toString());
    }

    private void toClean() {
        frmConversor.getTxtCentigrados().setText("");
        frmConversor.getTxtFarenheit().setText("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmConversor.getBtnConvertir()) {
            try {
                if (frmConversor.getTxtCentigrados().getText().length() != 0) {
                    aFahrenheit();
                } else if (frmConversor.getTxtFarenheit().getText().length() != 0) {
                    aCentigrados();
                }
            } catch (Exception ex) {
                frmConversor.getTxtCentigrados().setText("0.0");
                frmConversor.getTxtFarenheit().setText("32.0");

            }

        } else if (e.getSource() == frmConversor.getBtnLimpiar()) {
            toClean();

        }
    }
}
