package JButtons;
import javax.swing.JFrame;

public class ButtonTest {
    public static void main (String[]args){
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275,110); //configura o tamanho do frame
        buttonFrame.setVisible(true); //exibe o frame 
    } //fim da main  
} //fim da classe CheckBoxTest
