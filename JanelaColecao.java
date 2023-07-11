package View;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controle.ControleJanelaColecao;

public class JanelaColecao extends JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField textNomeColecao;
    private JTextField textItem;
    private JTextField textAno;
    private JTextField textColecionador;
    private ControleJanelaColecao cjs =
            new ControleJanelaColecao();

    /**
     * Launch the application.
     */
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JanelaColecao frame = new JanelaColecao();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    

    /**
     * Create the frame.
     */
    
    public JanelaColecao() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 276, 243);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
       
        JLabel lblCadastroDeCole = new JLabel("CADASTRO DE COLEÇÕES");
        lblCadastroDeCole.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCadastroDeCole.setBounds(40, 11, 198, 24);
        contentPane.add(lblCadastroDeCole);
       
        JLabel lblNomeColecao= new JLabel("COLECAO:");
        lblNomeColecao.setBounds(10, 49, 46, 14);
        contentPane.add(lblNomeColecao);
       
        JLabel lblItem = new JLabel("ITEM:");
        lblItem.setBounds(10, 74, 46, 14);
        contentPane.add(lblItem);
       
        JLabel lblAno = new JLabel("ANO:");
        lblAno.setBounds(10, 99, 46, 14);
        contentPane.add(lblAno);
       
        JLabel lblColecionador = new JLabel("COLECIONADOR:");
        lblColecionador.setBounds(10, 129, 46, 14);
        contentPane.add(lblColecionador);
       
        textNomeColecao = new JTextField();
        textNomeColecao.setBounds(50, 46, 46, 20);
        contentPane.add(textNomeColecao);
        textNomeColecao.setColumns(10);
       
        textItem = new JTextField();
        textItem.setBounds(50, 71, 86, 20);
        contentPane.add(textItem);
        textItem.setColumns(10);
       
        textItem = new JTextField();
        textItem.setBounds(50, 99, 86, 20);
        contentPane.add(textItem);
        textItem.setColumns(10);
       
        textColecionador = new JTextField();
        textColecionador.setBounds(50, 126, 200, 20);
        contentPane.add(textColecionador);
        textColecionador.setColumns(10);
       
        JButton btnCadastrar = new JButton("CADASTRAR COLEÇÃO");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomecolecao = textNomeColecao.getText();
                String item = textItem.getText();
                String ano = textAno.getText();
                String colecionador = textColecionador.getText();
               
                cjs.incluirColecao(nomecolecao, item, ano, colecionador);
               
                JOptionPane.showMessageDialog(null,
                        "Coleção cadastrada com sucesso!");
               
                textNomeColecao.setText("");
                textItem.setText("");
                textAno.setText("");
                textColecionador.setText("");
            }
        });
        btnCadastrar.setBounds(47, 154, 119, 23);
        contentPane.add(btnCadastrar);
    }
}